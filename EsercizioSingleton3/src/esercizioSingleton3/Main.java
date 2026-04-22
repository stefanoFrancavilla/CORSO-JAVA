package esercizioSingleton3;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Cliente c1 = new Cliente("Mario", 1200, true); 
	       

	        Cliente c2 = new Cliente("Luca", 300, true); 
	       

	        Cliente c3 = new Cliente("Anna", 1000, false); 
	        

	        Cliente c4 = new Cliente("Sara", 200, true); 
	     
	        c1.start(); 
	    
	        c2.start(); 
	    
	        c3.start(); 
	      
	        c4.start(); 
	        
	}
	}


