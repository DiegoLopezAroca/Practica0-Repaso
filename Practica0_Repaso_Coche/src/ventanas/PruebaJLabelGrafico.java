package ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class PruebaJLabelGrafico extends JLabel{

	protected Coche coche;
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		PruebaJLabelGrafico vent = new PruebaJLabelGrafico();
		vent.setVisible(true);
		vent.Mover();
	}*/
	
	//No static
	//private JPanel pnlJuego;
	protected JLabel lblCoche;
	
	public PruebaJLabelGrafico() {
		//Configuracion de la ventana
		/*this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setBounds(200,200,600,400);
		
		//Creamos los contenedores
		pnlJuego = new JPanel();
		pnlJuego.setLayout(null);
		//Creamos los componentes*/
		lblCoche = new PruebaJLabelGrafico(new ImageIcon("src/ventanas/coche.png"));
		lblCoche.setBounds(200,200,100,150);
		/*//otra forma de hacer visible un imagen:
		try {
			lblCoche = new JLabel(new ImageIcon(PruebaJLabelGrafico.class.getResource("coche.png")));
		} catch (MalformedURLException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//Asociamos componentes a contenedores
		//pnlJuego.add(lblCoche);
		//getContentPane().add(pnlJuego, BorderLayout.CENTER);
		//Gestion de eventos
		
	}*/
	}

	/*private void Mover() {
		//Hacer algo con el coche
				lblCoche.setBounds(200,200,100,150);
				for(int i=0; i<100; i++) {
					lblCoche.setLocation((int) (coche.getPosX()+1), (int) (coche.getPosY()+1));
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	}*/
	
		public PruebaJLabelGrafico(ImageIcon i) {
			super(i);
		}
		/*@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			//g.drawLine(0, 0, 100, 100);
			Image img = ((ImageIcon)getIcon()).getImage();
			Graphics2D g2 = (Graphics2D) g;
			//g2.rotate(Math.PI/4);
			//g2.drawImage(img, 0, 0, 100, 100, null);
		}*/
		
		public void acelera(int aceleracion) {
			double vel = coche.getMiVelocidad();
	        vel = vel + aceleracion;
	    }
		public void giraDerecha(int i){
			
		}
		protected void paintComponent(Graphics g) {
	        //super.paintComponent(g);
			Image img = ((ImageIcon)getIcon()).getImage();
			Graphics2D g2 = (Graphics2D) g;
			g2.rotate( Math.PI / 4 );
			g2.rotate( 3 * Math.PI / 4, 50, 50 );
			g2.drawImage( img, 0, 0, 100, 100, null  );
		}
		

	    // Método para girar 45 grados a la derecha
	    public void giraIzquierda() {
	     
	    }

	    // Método para mover el coche
	    public void mueve(int tiempoDeMovimiento) {
	    	lblCoche.setLocation(200,200);
			for(int i=0; i<100; i++) {
				lblCoche.setLocation((int) (coche.getPosX()+1), (int) (coche.getPosY()+1));
				try {
					Thread.sleep(tiempoDeMovimiento);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	    }
	    
	    public void frena(double desaceleracion) {
	       
	    }
}