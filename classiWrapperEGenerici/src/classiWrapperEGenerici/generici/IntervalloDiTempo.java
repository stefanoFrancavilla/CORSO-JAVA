package classiWrapperEGenerici.generici;

import java.time.LocalDate;

public class IntervalloDiTempo extends Coppia<LocalDate>
{
	
	private Integer a; // Per far scattare un errore ed osservare lo stack trace.
	
	public IntervalloDiTempo(LocalDate primoMembro, LocalDate secondoMembro)
	{
		super(primoMembro, secondoMembro);
	}

	@Override 
	public void setSecondoMembro ( LocalDate secondoMembro)
	{
		System.out.println("IntervalloDiTempo -> setSecondoMembro()");
		
		//>0, if the current object is greater than the other object.
		//=, if the current object is equal to the other object.
		
		if(secondoMembro.compareTo(this.getPrimoMembro()) >= 0 )
		{
			//a.byteValue(); // Per far scattare un errore ed osservare lo stack trace.
			super.setSecondoMembro(secondoMembro);
			
		}
		
		//Metodo ponte ( bridge method), creato dal compilatore.
		// public void setSecondoMembro ( Object secondoMembro) {
		// setSecondoMembro( (LocalDate) secondoMembro);
		//}
	}
}
