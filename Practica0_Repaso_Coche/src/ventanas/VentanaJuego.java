package ventanas;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaJuego extends JFrame{

	protected JPanel pnlInferior;
	protected JPanel pnlPrincipal;
	protected JButton btnAcelera;
	protected JButton btnGiraIzq;
	protected JButton btnGiraDer;
	protected JButton btnFrena;
	protected Coche coche;
	protected PruebaJLabelGrafico cocheGrafico;
	protected CocheJuego cocheJuego;
	
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
		
		btnFrena = new JButton("Frena");
		pnlInferior.add(btnFrena, new FlowLayout());
		
		pnlPrincipal.setLayout(null);
		
		btnAcelera.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cocheGrafico.acelera(5);
				cocheGrafico.mueve(1000);
			}
			
		});
		
		btnGiraIzq.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cocheGrafico.giraIzquierda();
			}
			
		});
		
		btnGiraDer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cocheGrafico.giraDerecha(10);
			}
			
		});
		
		btnFrena.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cocheGrafico.frena(5);
			}
			
		});
		
		//aqui creamos todo lo relacionado con la imagen del coche
		
		//Creamos los componentes
		ImageIcon imgCoche = new ImageIcon("src/ventanas/coche.png");
		JLabel lblCoche = new JLabel(imgCoche);
		
		getContentPane().add(pnlPrincipal, BorderLayout.CENTER);
		pnlPrincipal.add(lblCoche);
		//Gestion de eventos
		while(this.isVisible()) {
			lblCoche.setLocation(200,200);
			for(int i=0; i<100; i++) {
				lblCoche.setLocation((int) (coche.getPosX()+1), (int) (coche.getPosY()+1));
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VentanaJuego v = new VentanaJuego();
		Coche coche = new Coche();
		System.out.println(coche.toString());
		v.setVisible(true);
		v.cocheGrafico.mueve(1);
	}
	
	
}