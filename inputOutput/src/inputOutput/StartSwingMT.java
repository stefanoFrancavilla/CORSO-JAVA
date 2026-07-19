package inputOutput;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
//import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

//Author: Luca Bonacorsi.
public class StartSwingMT {
	
	private JPanel imagesContainer;
	private JFrame jframe;
	//private URL url = null;
	private int clickCounter;
	
    public static void main(String[] args)
    {   
    	SwingUtilities.invokeLater(new Runnable() {
    		
    		@Override
	        public void run() {
	        	StartSwingMT startSwing = new StartSwingMT();
	        	startSwing.setClickCounter(0);
	        	startSwing.buildInterface();
	        }
        });
    }
    
    public int getClickCounter() {
		return clickCounter;
	}

	public void setClickCounter(int clickCounter) {
		this.clickCounter = clickCounter;
	}

	private void buildInterface()
    {    	
    	jframe = new JFrame();
    	
    	JPanel mainContainer = new JPanel();
    	mainContainer.setLayout(new BoxLayout(mainContainer, BoxLayout.Y_AXIS));
    	
        JPanel widgetsContainer = new JPanel();
        widgetsContainer.setLayout(new BoxLayout(widgetsContainer, BoxLayout.X_AXIS));
        
    	JButton jbutton = new JButton("Load data!");  

        JTextArea display = new JTextArea(18,60);
        display.setEditable(false);
        
        JScrollPane jScrollpane = new JScrollPane(display);
        jScrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
    	imagesContainer = new JPanel();
    	imagesContainer.setLayout(new BoxLayout(imagesContainer, BoxLayout.X_AXIS));
    	
    	jbutton.addActionListener(new ActionListener()
    	{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				//String jsonData = null;
				
        		/*SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		            	
		            	resetInterface(display);
		            }
		        });*/
				
				if(clickCounter<2)
					clickCounter++;
				else
					clickCounter = 1;
				
				resetInterface(display);
        		
	            Thread t = new Thread(new Runnable()
	            {
	                @Override
	                public void run()
	                {
	                	String jsonData = null;
	                	
	                	try
	                	{
	                		//StartSwingMT.this.resetInterface();
	                		
							jsonData = StartSwingMT.loadRemoteJsonDataTWR("https://reqres.in/api/users?page=" + clickCounter);
						}
	                	catch(IOException e)
	                	{
							// TODO Auto-generated catch block
							//e.printStackTrace();
	                		System.out.println("e: " + e);
						}
						
						System.out.println("jsonData: " + jsonData);
						
						if(jsonData != null)
				    	{
							List<Persona2> mainPeople = StartSwingMT.getPeopleFromJsonData2(jsonData);
				
							//populateInterface(mainPeople, jframe, display, imagesContainer);
							//populateInterface(mainPeople, display);
							
							if (SwingUtilities.isEventDispatchThread()) {
					        	 System.out.println("EDT PT");
					        	 
					        	 populateInterface(mainPeople, display);
					        }
					        else
					        {
					        	System.out.println("EDT NO PT");
					        	
								SwingUtilities.invokeLater(new Runnable() {
									public void run() {
										
										populateInterface(mainPeople, display);
							        }
							    });
					        }
				    	}
	                }
	            });
	            t.start();				
			}
    	});

        widgetsContainer.add(jScrollpane);
        widgetsContainer.add(jbutton); 
        
        mainContainer.add(widgetsContainer);
        mainContainer.add(imagesContainer);

        jframe.add(mainContainer);
        jframe.pack();
    	        
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
    
    private static String loadRemoteJsonDataTWR(String path) throws FileNotFoundException, IOException
    {
		URL url = new URL(path);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");
        String jsonData = null;

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream())))
        {
	        String line;
	        StringBuilder stringBuilder = new StringBuilder();
        
	        while((line = bufferedReader.readLine()) != null)
	        {
	        	stringBuilder.append(line);
	        }

	        jsonData = stringBuilder.toString();
        }
        
        return jsonData;
    }
    
    private static List<Persona2> getPeopleFromJsonData2(String jsonData)
    {
    	List<Persona2> people = new ArrayList<>();
    	
    	Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(jsonData, JsonObject.class);
        JsonArray jsonPeople = jsonObject.get("data").getAsJsonArray();
        
        for(int i = 0; i < jsonPeople.size(); i++)
        {
        	JsonObject jsonPerson = jsonPeople.get(i).getAsJsonObject();
        	
        	Persona2 person = new Persona2();
        	person.setId(jsonPerson.get("id").getAsInt());
        	person.setEmail(jsonPerson.get("email").getAsString());
        	person.setNome(jsonPerson.get("first_name").getAsString());
        	person.setCognome(jsonPerson.get("last_name").getAsString());
        	person.setAvatar(jsonPerson.get("avatar").getAsString());
        	
        	System.out.println("person2: " + person);
        	
        	people.add(person);
        }
        
        return people;
    }
    
    private void populateInterface(List<Persona2> mainPeople, JTextArea display)
    //private void populateInterface(List<Persona2> mainPeople, JFrame jframe, JTextArea display, JPanel imagesContainer)
    {
		//Start.getPeopleFromJsonData(jsonData);
		
		for(int i = 0; i < mainPeople.size(); i++)
		{
			Persona2 currentPerson = mainPeople.get(i);
			
			display.append("name: " + currentPerson.getNome() + "\n");
			display.append("surname: " + currentPerson.getCognome() + "\n");
			display.append("email: " + currentPerson.getEmail() + "\n");
			display.append("avatar: " + currentPerson.getAvatar() + "\n");
			display.append("\n\n");

			//loadImage(currentPerson.getAvatar(), jframe, imagesContainer);
			loadImage(currentPerson.getAvatar());
		}
    }
    
    public void addImage(Image image)
    {
        JLabel jlabel = new JLabel(new ImageIcon(image));
		
		imagesContainer.add(jlabel);
		jframe.pack();
    }
    
    private void loadImage(String imagePath)
    {
        Thread t = new Thread(new LoadImageTask(imagePath));
        t.start();	
        
        //return image;
    }
    
    class LoadImageTask implements Runnable {
    	private String imagePath = null;
    	private Image image;
    	private URL url;
    	
    	public LoadImageTask(String imagePath)
    	{
    		this.imagePath = imagePath;
    	}
    	
    	@Override
    	public void run()
        {
	        try
	        {
	            url = new URL(imagePath);
	            image = ImageIO.read(url);
	        }
	        catch (MalformedURLException e)
	        {
	            System.out.println(e);
	            
	            return;
	        }
	        catch (IOException e) {
	            System.out.println(e);
	            
	            return;
	        }
	        
	        //StartSwingMT.this.addImage();
	        
	        if (SwingUtilities.isEventDispatchThread()) {
	        	 System.out.println("EDT");
	        	 
	        	 addImage(image);
	        }
	        else
	        {
	        	 System.out.println("NO EDT");
	        	 
	        	 SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		            	addImage(image);
		            }
	        	 });
	        }
        }
    }
    
    private void resetInterface(JTextArea display)
    {
    	display.setText("");
		imagesContainer.removeAll();
		imagesContainer.repaint();
    }
}
