import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Klasse realisiert den Listener fuer Start- und Stop-Button
 * @author Daniel Schwenk
 */
public class ListenerButton implements ActionListener {

	private Hauptfenster hauptfenster;
	
	// Konstruktor
	public ListenerButton(Hauptfenster hauptfenster){
		this.hauptfenster = hauptfenster;
	}
	
	/**
	 * Eventhandler fuer das Druecken der Buttons
	 * @param e Button der das Event ausgeloest hat
	 */
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