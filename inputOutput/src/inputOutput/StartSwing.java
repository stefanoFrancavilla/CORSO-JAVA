package inputOutput;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

//Author: Luca Bonacorsi.
public class StartSwing {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				StartSwing startSwing = new StartSwing();
				startSwing.buildInterface();
			}
		});
	}
	
	private void buildInterface()
	{
		JFrame jframe = new JFrame();
		
		JPanel mainContainer = new JPanel();
		mainContainer.setLayout(new BoxLayout(mainContainer, BoxLayout.Y_AXIS));
				
		JPanel widgetsContainer = new JPanel();
		widgetsContainer.setLayout(new BoxLayout(widgetsContainer, BoxLayout.X_AXIS));
		
		JPanel imagesContainer = new JPanel();
		imagesContainer.setLayout(new BoxLayout(imagesContainer, BoxLayout.X_AXIS));
		
		JTextArea display = new JTextArea(18,60);
	
		display.setEditable(false);
		
		JScrollPane jscrollpane = new JScrollPane(display);
		jscrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		JButton jbutton = new JButton("Load data");
		jbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("CLICCATO.");
				
				String jsonData = null;
				
				try
				{
					jsonData = StartSwing.loadRemoteJsonData("https://reqres.in/api/users?page=1");
					
					System.out.println("jsonData: " + jsonData);
				}
				catch (IOException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				if(jsonData!=null)
				{
					List<Persona2> mainPeople = getPeopleFromJsonData(jsonData);
					
					System.out.println("mainPeople: " + mainPeople);
					
					populateInterface(mainPeople, jframe, display, imagesContainer);
				}
			}
		});
		
		widgetsContainer.add(jscrollpane);
		widgetsContainer.add(jbutton);
		
		mainContainer.add(widgetsContainer);
		mainContainer.add(imagesContainer);
		
		jframe.add(mainContainer);
		jframe.pack();
		
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
	}
	
	private static String loadRemoteJsonData(String path) throws IOException {
	    URL url = new URL(path);
	    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

	    httpURLConnection.setRequestMethod("GET");
	    httpURLConnection.setRequestProperty("x-api-key", "LA_TUA_API_KEY");
	    httpURLConnection.setRequestProperty("Accept", "application/json");
	    // Se necessario:
	    // httpURLConnection.setRequestProperty("X-Reqres-Env", "prod");

	    int statusCode = httpURLConnection.getResponseCode();

	    BufferedReader reader;
	    if (statusCode >= 200 && statusCode < 300) {
	        reader = new BufferedReader(
	                new InputStreamReader(httpURLConnection.getInputStream()));
	    } else {
	        reader = new BufferedReader(
	                new InputStreamReader(httpURLConnection.getErrorStream()));
	    }

	    try (reader) {
	        String line;
	        StringBuilder stringBuilder = new StringBuilder();

	        while ((line = reader.readLine()) != null) {
	            stringBuilder.append(line);
	        }

	        if (statusCode >= 200 && statusCode < 300) {
	            return stringBuilder.toString();
	        } else {
	            throw new IOException("HTTP " + statusCode + ": " + stringBuilder);
	        }
	    }
	}
	
	private static List<Persona2> getPeopleFromJsonData(String jsonData)
	{
		Gson gson = new Gson();
		JsonObject jsonObject = gson.fromJson(jsonData, JsonObject.class);
		JsonArray jsonPeople = jsonObject.get("data").getAsJsonArray();
		
		List<Persona2> people = new ArrayList<>();
		//List<Persona2> people = new LinkedList<>();
		
		for(int i = 0; i < jsonPeople.size(); i++)
		{
			JsonObject jsonPerson = jsonPeople.get(i).getAsJsonObject();
			
			Persona2 persona = new Persona2();
			persona.setId(jsonPerson.get("id").getAsInt());
			persona.setEmail(jsonPerson.get("email").getAsString());
			persona.setNome(jsonPerson.get("first_name").getAsString());
			persona.setCognome(jsonPerson.get("last_name").getAsString());
			persona.setAvatar(jsonPerson.get("avatar").getAsString());
			
			System.out.println(persona);
			
			people.add(persona);
		}
		
		return people;
	}
	
	private void populateInterface(List<Persona2> mainPeople, JFrame jframe, JTextArea display, JPanel imagesContainer)
	{
		for(int i = 0; i < mainPeople.size(); i++)
		{
			Persona2 currentPerson = mainPeople.get(i);
			
			display.append("nome: " + currentPerson.getNome() + "\n");
			display.append("cognome: " + currentPerson.getCognome() + "\n");
			display.append("email: " + currentPerson.getEmail() + "\n");
			display.append("avatar: " + currentPerson.getAvatar() + "\n");
			display.append("\n\n");
			
			Image image = loadImage(currentPerson.getAvatar());
			
			if(image!=null)
			{
				JLabel jlabel = new JLabel(new ImageIcon(image));
				
				imagesContainer.add(jlabel);
			}
		}
		
		jframe.pack();
	}
	
	private Image loadImage(String imagePath)
	{
		Image image = null;
		URL url = null;
		
		try
		{
			url = new URL(imagePath);
			image = ImageIO.read(url);
		}
		catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return image;
	}
}