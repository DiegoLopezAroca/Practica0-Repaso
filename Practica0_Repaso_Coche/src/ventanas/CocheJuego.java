package ventanas;

public class CocheJuego extends Coche{

	private PruebaJLabelCoche labelCoche;

	public CocheJuego() {
		
	    // Inicializa el coche con valores predeterminados
	    super();
	    // Inicializa el JLabelCoche
	    labelCoche = new PruebaJLabelCoche();
	    // Establece la posición inicial del JLabelCoche
	    labelCoche.setBounds((int) posX, (int) posY, 100, 100);
	 }

	 // Redefine los métodos set de posición para actualizar el JLabelCoche
	 @Override
	 public void setPosX(double posX) {
	     super.setPosX(posX);
	     labelCoche.setLocation((int) posX, (int) posY);
	 }

	 @Override
	 public void setPosY(double posY) {
	     super.setPosY(posY);
	     labelCoche.setLocation((int) posX, (int) posY);
	 }

		// Otros métodos de CocheJuego (omitiendo para brevedad)...

	 // Obtener el JLabelCoche asociado
	 public PruebaJLabelCoche getLabelCoche() {
	     return labelCoche;
	 }
	
}