import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ListenerButton implements ActionListener {

	private Hauptfenster hauptfenster;
	
	// Konstruktor
	public ListenerButton(Hauptfenster hauptfenster){
		this.hauptfenster = hauptfenster;
	}
	

	public void actionPerformed(ActionEvent e) {
		// pruefe welcher Button das Event ausgeloest hat
		if(e.getActionCommand().equals("start")){
			this.hauptfenster.getSpielautomat().startRollen();
		}
		else if(e.getActionCommand().equals("stop")){
			this.hauptfenster.getSpielautomat().stopRollen();
		}
	}
}