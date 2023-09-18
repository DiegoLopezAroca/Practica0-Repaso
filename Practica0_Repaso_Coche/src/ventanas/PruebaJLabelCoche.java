package ventanas;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JLabel;

public class PruebaJLabelCoche extends JLabel{

	private BufferedImage cocheImage;

    public PruebaJLabelCoche() {
        try {
            // Cargar la imagen del coche desde un archivo
            cocheImage = ImageIO.read(new File("coche.png"));
            
            // Escalar la imagen al tamaño deseado (100x100 píxeles)
            cocheImage = resizeImage(cocheImage, 100, 100);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para escalar una imagen
    private BufferedImage resizeImage(BufferedImage originalImage, int width, int height) {
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, width, height, null);
        g.dispose();
        return resizedImage;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibujar la imagen del coche en el JLabel
        g.drawImage(cocheImage, 0, 0, this);
    }
}