import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Klasse realisiert das Panel fuer die Anzeige der 4 Ziffern
 * @author Daniel Schwenk
 */
public class CenterPanel extends JPanel{

	private Hauptfenster hauptfenster;
	private JLabel labels[];
	private int count;
	private int ziffern [];
	
	// Konstruktor
	public CenterPanel(Hauptfenster hauptfenster){
		this.hauptfenster = hauptfenster;
		
		// Layout des Panels festlegen
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		// die aktuellen Ziffern aus dem Spielautomat holen
		this.ziffern = hauptfenster.getSpielautomat().getIntZiffern();
		
		// Anzahl Ziffern auslesen
		this.count = hauptfenster.getSpielautomat().ANZAHLZIFFERN;
		this.labels = new JLabel[this.count];
		
		// Anlegen und fuellen der JLabels
		for(int i=0;i<count;i++){
			this.labels[i] = new JLabel(String.valueOf(ziffern[i]), JLabel.CENTER);
			this.labels[i].setPreferredSize(new Dimension(50,50));
			this.labels[i].setFont(new Font("Arial", Font.PLAIN, 28));
			this.labels[i].setBorder(BorderFactory.createLineBorder(Color.RED, 2));
			this.add(this.labels[i]);
		}
	}
	
	// die JLabels mit den aktuellen Ziffern versehen
	public void setZiffern(int[] tmp_ziffern){
		for(int i=0;i<this.count;i++){
			this.labels[i].setText(String.valueOf(tmp_ziffern[i]));
		}
	}
}
