package ventanas;

import java.awt.*;

import javax.swing.*;

public class VentanaJuego extends JFrame{

	protected JPanel pnlInferior;
	protected JPanel pnlPrincipal;
	protected JButton btnAcelera;
	protected JButton btnGiraIzq;
	protected JButton btnGiraDer;
	protected JButton Frena;
	protected Coche coche;
	protected JLabelCoche jLabelCoche;
	
	public VentanaJuego() {
		
		this.setBounds(200, 100, 800, 600);
		this.setTitle("Juego del coche");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		pnlPrincipal = new JPanel();
		this.add(pnlPrincipal, BorderLayout.CENTER);
		pnlPrincipal.setBackground(Color.white);
		
		pnlInferior = new JPanel();
		pnlInferior.setBackground(Color.orange);
		this.add(pnlInferior, BorderLayout.SOUTH);
		
		btnAcelera = new JButton("Acelera");
		pnlInferior.add(btnAcelera, new FlowLayout());
		
		btnGiraIzq = new JButton("Gira Izq.");
		pnlInferior.add(btnGiraIzq, new FlowLayout());
		
		btnGiraDer = new JButton("Gira Der.");
		pnlInferior.add(btnGiraDer, new FlowLayout());
		
		Frena = new JButton("Frena");
		pnlInferior.add(Frena, new FlowLayout());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VentanaJuego v = new VentanaJuego();
		Coche coche = new Coche();
		JLabelCoche lblCoche = new JLabelCoche();
		
		System.out.println(coche.toString());
		
		int x = (int) coche.getPosX();
		int y = (int) coche.getPosY();
		
		v.pnlPrincipal.add(lblCoche);
		
		JLabel labelLogo = new JLabel();
		ImageIcon imagen = new ImageIcon("\\Users\\diego\\eclipse-workspace\\Practica0_Repaso_Coche\\src\\ventanas\\coche.png");
		labelLogo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		labelLogo.setBounds(x,y,100,100);
		
		v.add(labelLogo);
		
		v.setVisible(true);
		
	}
	
}