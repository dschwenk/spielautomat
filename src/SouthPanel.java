import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author dschwenk
 * Klasse realisiert das Panel fuer Start- und Stop-Button
 */
public class SouthPanel extends JPanel {

	private Hauptfenster hauptfenster;
	private JButton start;
	private JButton stop;	
	
	public SouthPanel(Hauptfenster hauptfenster){
		this.hauptfenster = hauptfenster;
		
		// start Button
		this.start = new JButton("start");
		this.start.addActionListener(new ListenerButton(this.hauptfenster));
		
		// stop Button
		this.stop = new JButton("stop");
		this.stop.addActionListener(new ListenerButton(this.hauptfenster));
		
		this.add(this.start);
		this.add(this.stop);
	}
}
