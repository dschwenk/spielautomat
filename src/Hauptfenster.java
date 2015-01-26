import java.awt.BorderLayout;

import javax.swing.JFrame;

import model.spielautomat;

/**
 * @author dschwenk
 * Klasse realisiert das Hauptfenster, enthaelt main
 */
public class Hauptfenster extends JFrame {

	private spielautomat sautomat = spielautomat.getInstance();
	private NorthPanel np;
	private CenterPanel cp;
	
	// Konstruktor
	public Hauptfenster(){
		this.np = new NorthPanel(this);
		this.cp = new CenterPanel(this);
		
		// Listener fuer Spielautomat registrieren
		this.sautomat.addspielListener(new ListenerSpielautomat(this));
		
		// Layout festlegen
		this.setLayout(new BorderLayout());
		
		// Panels hinzufuegen
		this.add(np, BorderLayout.NORTH);
		this.add(cp, BorderLayout.CENTER);
		this.add(new SouthPanel(this), BorderLayout.SOUTH);
		
		// Eigenschaften JFrame
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	// main-Methode
	public static void main(String[] args) {
		new Hauptfenster();
	}

	// gibt den Spielautomaten zurueck
	public spielautomat getSpielautomat(){
		return this.sautomat;
	}
	
	// gibt das CentralPanel zurueck
	public CenterPanel getCenterPanel(){
		return this.cp;
	}
	
	// gibt das NorthPanel zurueck
	public NorthPanel getNorthPanel(){
		return this.np;
	}
}
