import model.spielautomatEvent;
import model.spielautomatListener;


public class ListenerSpielautomat implements spielautomatListener{

	private Hauptfenster hauptfenster;
	
	// Konstruktor
	public ListenerSpielautomat(Hauptfenster hauptfenster){
		this.hauptfenster = hauptfenster;
	}


	public void ModelChanged(spielautomatEvent e) {
		this.hauptfenster.getCenterPanel().setZiffern(e.getZiffern());		
	}

	
	public void StatusChanged(spielautomatEvent e) {
		
		// Textfelder aktualisieren
		this.hauptfenster.getNorthPanel().setGewinn(e.getGewinn());
		this.hauptfenster.getNorthPanel().setGuthaben(this.hauptfenster.getSpielautomat().getGuthaben());
		
		// gibt an ob ein Gewinn erzielt wurde (Achtung Zustand wird nicht zurueckgesetzt)
		if(e.getStatus() == this.hauptfenster.getSpielautomat().GEWONNEN){
			System.out.println("Gewinn!");
		}
		
		// gebe Gewinnkategorie aus
		if(e.getKategorie() == 2){
			System.out.println("5 Euro gewonnen!");			
		}
		else if(e.getKategorie() == 3){
			System.out.println("100 Euro gewonnen!");
		}
		else if(e.getKategorie() == 4){
			System.out.println("1000 Euro gewonnen!");
		}
	}
}