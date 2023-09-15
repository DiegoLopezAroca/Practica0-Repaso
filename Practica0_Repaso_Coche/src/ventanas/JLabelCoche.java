package ventanas;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.*;

public class JLabelCoche extends JLabel{
	
	protected JLabel labelLogo;
	
	public void JLabelCoche() {
		
		JLabel labelLogo = new JLabel();
		ImageIcon imagen = new ImageIcon("\\Users\\diego\\eclipse-workspace\\Practica0_Repaso_Coche\\src\\ventanas\\coche.png");
		labelLogo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(50, 100, Image.SCALE_SMOOTH)));
		this.add(labelLogo);
		this.setVisible(true);
	}
	
}
