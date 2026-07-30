package HotelManagementSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Hotel hotel = new Hotel();

	        hotel.inserisciCamera(new Camera(101, TipoCamera.SINGOLA));
	        hotel.inserisciCamera(new Camera(102, TipoCamera.DOPPIA));
	        hotel.inserisciCamera(new Camera(103, TipoCamera.SUITE));
	        hotel.inserisciCamera(new Camera(104, TipoCamera.TRIPLA));
	        hotel.inserisciCamera(new Camera(105, TipoCamera.DOPPIA));
	        hotel.inserisciCamera(new Camera(106, TipoCamera.SUITE));
	        
	       GestioneScelte menu = new GestioneScelte(hotel);
	       
	       try {
	    	   menu.avvia();
	       }
	       catch(Exception e)
	       {
	    	   e.getMessage();
	       }
	       
	}

}
