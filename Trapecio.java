
public class Trapecio  implements FiguraGeometrica{
	
	private String nombre;
	private double baseMayor;
	private double baseMenor;
	private double altura;
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	
	public Trapecio(String nombre, double baseMayor, double baseMenor, double altura, double lado1, double lado2,
			double lado3, double lado4) {
		super();
		this.nombre = nombre;
		this.baseMayor = baseMayor;
		this.baseMenor = baseMenor;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	} // constructor
	
	public String calcularArea () {
		double res = 0;
		res = (getAltura() * (getBaseMayor() + getBaseMenor())) / 2;
		return String.format("%.2f", res);
	} // calcularArea
	
	public String calcularPerimetro () {
		double res = 0;
		res = getLado1() + getLado2() + getLado3() + getLado4();
		return String.format("%.2f", res);
	} // calcularPerimetro

	public String getNombre() {
		return nombre;
	} // getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	} // setNombre

	public double getBaseMayor() {
		return baseMayor;
	} // getBaseMayor

	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	} // setBaseMayor

	public double getBaseMenor() {
		return baseMenor;
	} // getBaseMenor

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	} // setBaseMenor

	public double getAltura() {
		return altura;
	} // getAltura

	public void setAltura(double altura) {
		this.altura = altura;
	} // setAltura

	public double getLado1() {
		return lado1;
	} // getLado1

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	} // setLado1

	public double getLado2() {
		return lado2;
	} // getLado2

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	} // setLado2

	public double getLado3() {
		return lado3;
	} // getLado3

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	} // setLado3

	public double getLado4() {
		return lado4;
	} // getLado4

	public void setLado4(double lado4) {
		this.lado4 = lado4;
	} // setLado4

	@Override
	public String toString() {
		return "Trapecio [nombre=" + nombre + ", baseMayor=" + baseMayor + ", baseMenor=" + baseMenor + ", altura="
				+ altura + ", lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado4=" + lado4 + "]";
	} // toString

} // class Trapecio
