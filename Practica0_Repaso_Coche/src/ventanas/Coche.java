package ventanas;

public class Coche {
	
	private double miVelocidad; // Velocidad en pixels/segundo
	 protected double miDireccionActual; // Dirección en la que estoy mirando en grados (de 0 a 360)
	 protected double posX; // Posición en X (horizontal)
	 protected double posY; // Posición en Y (vertical)
	 private String piloto; // Nombre de piloto
	 protected VentanaJuego ventana;
	 protected PruebaJLabelCoche label;
	 
	 
	public double getMiVelocidad() {
		return miVelocidad;
	}
	public void setMiVelocidad(double miVelocidad) {
		this.miVelocidad = miVelocidad;
	}
	public double getMiDireccionActual() {
		return miDireccionActual;
	}
	public void setMiDireccionActual(double miDireccionActual) {
		this.miDireccionActual = miDireccionActual;
	}
	public double getPosX() {
		return posX;
	}
	public void setPosX(double posX) {
		this.posX = posX;
	}
	public double getPosY() {
		return posY;
	}
	public void setPosY(double posY) {
		this.posY = posY;
	}
	public String getPiloto() {
		return piloto;
	}
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	public Coche(double miVelocidad, double miDireccionActual, double posX, double posY, String piloto) {
		super();
		this.miVelocidad = miVelocidad;
		this.miDireccionActual = miDireccionActual;
		this.posX = posX;
		this.posY = posY;
		this.piloto = piloto;
	}
	public Coche() {
		super();
		this.miVelocidad = 0;
		this.miDireccionActual = 0;
		this.posX = 0;
		this.posY = 0;
		this.piloto = "Fernando Alonso";
	}
	@Override
	public String toString() {
		return "La velocidad del coche es: " + miVelocidad + ", la direccion actual es: " + miDireccionActual + ", la posicion es: x=" 
					+ posX + ", y=" + posY + " y el piloto se llama " + piloto;
	}
}
