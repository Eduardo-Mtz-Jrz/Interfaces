
public class Rombo implements FiguraGeometrica{
	
	private String nombre;
	private double diagonalMayor;
	private double diagonalMenor;
	private double lado;
	
	public Rombo(String nombre, double diagonalMayor, double diagonalMenor, double lado) {
		super();
		this.nombre = nombre;
		this.diagonalMayor = diagonalMayor;
		this.diagonalMenor = diagonalMenor;
		this.lado = lado;
	} // constructor
	
	public String calcularArea () {
		double res = 0;
		res = (getDiagonalMayor() * getDiagonalMenor()) / 2;
		return String.format("%.2f", res);
	} // calcularArea
	
	public String calcularPerimetro () {
		double res = 0;
		res = getLado() * 4;
		return String.format("%.2f", res);
	} // calcularPerimetro

	public String getNombre() {
		return nombre;
	} // getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	} // setNombre

	public double getDiagonalMayor() {
		return diagonalMayor;
	} // getDiagonalMayor

	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	} // setDiagonalMayor

	public double getDiagonalMenor() {
		return diagonalMenor;
	} // getDiagonalMenor

	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	} // setDiagonalMenor

	public double getLado() {
		return lado;
	} // getLado

	public void setLado(double lado) {
		this.lado = lado;
	} // setLado

	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", diagonalMayor=" + diagonalMayor + ", diagonalMenor=" + diagonalMenor
				+ ", lado=" + lado + "]";
	} // toString

} // class Rombo
