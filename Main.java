
public class Main {

	public static void main(String[] args) {
		
		Triangulo t1 = new Triangulo("Bermudas", 20, 10, 15);
		Triangulo t = new Triangulo("Triángulo T", 200, 100, 150);
		Cuadrado c = new Cuadrado("Cuadradito", 15);
		Rectangulo rt = new Rectangulo("Rectangulus", 12, 10);
		Rombo rm = new Rombo("Rambo", 8, 4, 10);
		Romboide rb = new Romboide("Rombina", 12, 15);
		Trapecio tp = new Trapecio("Tramposo", 10, 6, 7, 5, 4, 6, 9);
		
		
		Main.imprimirCalculos(t1);
		Main.imprimirCalculos(t);
		Main.imprimirCalculos(c);
		Main.imprimirCalculos(rt);
		Main.imprimirCalculos(rm);
		Main.imprimirCalculos(rb);
		Main.imprimirCalculos(tp);
	} // main
	
	// Crear las clases de todas las figuras 
	// Interface FigurasGEometricas
	// Implementar la interface en todas las figuras geometricas
	
	
	public static void imprimirCalculos(FiguraGeometrica fg) {
		System.out.println(fg);
		System.out.println("+----------------------------------------------------------------------+");
		System.out.println("| El área de [ " + fg.getNombre() + " ]");
		System.out.println("| es " + fg.calcularArea());
		System.out.println("| El perimetro de [ " + fg.getNombre() + " ]");
		System.out.println("| es " + fg.calcularPerimetro());
		System.out.println("+----------------------------------------------------------------------+");
	}
} // class Main
