import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author dschwenk
 * Klasse realisiert das Panel mit der Anzeige fuer Guthaben und Gewinn
 */
public class NorthPanel extends JPanel {

	private Hauptfenster hauptfenster;	
	private JLabel guthaben;
	private JLabel gewinn;
	private JTextField tf_guthaben;
	private JTextField tf_gewinn;
	
	// Konstruktor
	public NorthPanel(Hauptfenster hauptfenster){
		
		this.hauptfenster = hauptfenster;
		
		this.setLayout(new GridLayout(2,2,0,0));
		
		Dimension dim = new Dimension(100,25);
		Font font = new Font("Arial", Font.PLAIN, 20);
		
		// JLabel Guthaben
		this.guthaben = new JLabel("Guthaben");
		this.guthaben.setPreferredSize(dim);
		this.add(guthaben);
		
		// JLabel Gewinn
		this.gewinn = new JLabel("Gewinn");
		this.gewinn.setPreferredSize(dim);
		this.add(gewinn);
		
		// JTextfield Guthaben
		this.tf_guthaben = new JTextField();
		this.tf_guthaben.setEditable(false);
		this.tf_guthaben.setPreferredSize(dim);
		this.tf_guthaben.setFont(font);
		this.tf_guthaben.setText(String.valueOf(this.hauptfenster.getSpielautomat().getGuthaben()));
		this.add(this.tf_guthaben);
		
		// JTextfield Gewinn
		this.tf_gewinn = new JTextField();
		this.tf_gewinn.setEditable(false);
		this.tf_gewinn.setPreferredSize(dim);
		this.tf_gewinn.setFont(font);
		this.tf_gewinn.setText(String.valueOf(this.hauptfenster.getSpielautomat().getGewinn()));		
		this.add(this.tf_gewinn);
	}
	
	// das aktuelle Guthaben ins JTextField schreiben
	public void setGuthaben(int tmp_guthaben){
		tf_guthaben.setText(String.valueOf(tmp_guthaben));
	}
	
	// den aktuelle Gewinn ins JTextField schreiben
	public void setGewinn(int tmp_gewinn){
		tf_gewinn.setText(String.valueOf(tmp_gewinn));
	}
}
