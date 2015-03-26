package ese103;

import geometricshapes.*;

public class Ese103 {
	public static void main(String[] args) throws Exception {
		testCircle();
		testTriangle();
		testRectangle();
		testSquare();
		// -------------------------------------------------------------------------------
		// Verifica di contains
		System.out.println("\n==> Verifica contains");
		GeometricShape shapeArray[] = new GeometricShape[4];
		shapeArray[0] = new Circle(0, 0, 1);
		shapeArray[1] = new Rectangle(0, 0, 3, 2);
		shapeArray[2] = new Square(0, 0, 1);
		shapeArray[3] = new Triangle(1, 0, 2);
		GeometricShape a, b;
		for (int i = 0; i < shapeArray.length; i++) {
			a = shapeArray[i];
			for (int j = 0; j < shapeArray.length; j++) {
				b = shapeArray[j];
				if (a != b) {
					if (a.contains(b))
						System.out.println(a + " contiene " + b);
					else
						System.out.println(a + " NON contiene " + b);
				}
			}
		}
	}

	private static void testTriangle() throws Exception {
		Triangle t;
		System.out.println("\n==> Verifica Triangle");
		System.out
				.print("11: Verifica implementazione costruttore di Triangle...");
		try {
			t = new Triangle(0, 0, 0);
			// Se viene eseguita l'istruzione successiva, non è stata lanciata
			// l'eccezione
			// per il raggio non positivo. L'implementazione sarebbe errata.
			throw new Exception(
					"Errore nell'implementazione di Costruttore di Triangle");
		} catch (IllegalArgumentException e) {
			System.out.println("superata");
		}
		// Verifica di Costruttore e Getter
		System.out
				.print("12: Verifica implementazione Costruttore e Getter di Triangle...");
		t = new Triangle(5, 6, 7);
		if (t.getXV() != 5)
			throw new Exception(
					"Errore nell'implementazione di getXV o Costruttore");
		if (t.getYV() != 6)
			throw new Exception(
					"Errore nell'implementazione di getYV o Costruttore");
		if (t.getL() != 7)
			throw new Exception(
					"Errore nell'implementazione di getL o Costruttore");
		System.out.println("superata");
		// Verifica di Setter
		System.out.print("13: Verifica implementazione Setter di Triangle...");
		t.setXV(10);
		t.setYV(11);
		t.setL(12);
		if (t.getXV() != 10)
			throw new Exception("Errore nell'implementazione di setXV");
		if (t.getYV() != 11)
			throw new Exception("Errore nell'implementazione di setYV");
		if (t.getL() != 12)
			throw new Exception("Errore nell'implementazione di setL");
		System.out.println("superata");
		// Verifica di eccezione in setL
		System.out.print("14: Verifica implementazione setL di Triangle...");
		try {
			t.setL(-1);
			// Se viene eseguita l'istruzione successiva, non è stata lanciata
			// l'eccezione
			// per il raggio non positivo. L'implementazione sarebbe errata.
			throw new Exception("Errore nell'implementazione di setL");
		} catch (IllegalArgumentException e) {
			System.out.println("superata");
		}
	}

	private static void testCircle() throws Exception {
		Circle c;
		System.out.println("\n==> Verifica Circle");
		System.out
				.print("01: Verifica implementazione costruttore di Circle...");
		try {
			c = new Circle(0, 0, 0);
			// Se viene eseguita l'istruzione successiva, non è stata lanciata
			// l'eccezione
			// per il raggio non positivo. L'implementazione sarebbe errata.
			throw new Exception("Errore nell'implementazione di Costruttore");
		} catch (IllegalArgumentException e) {
			System.out.println("superata");
		}
		// Verifica di Costruttore e Getter
		System.out
				.print("02: Verifica implementazione Costruttore e Getter di Circle...");
		c = new Circle(5, 6, 7);
		if (c.getXC() != 5)
			throw new Exception(
					"Errore nell'implementazione di getXC o Costruttore");
		if (c.getYC() != 6)
			throw new Exception(
					"Errore nell'implementazione di getYC o Costruttore");
		if (c.getR() != 7)
			throw new Exception(
					"Errore nell'implementazione di getR o Costruttore");
		System.out.println("superata");
		// Verifica di Setter
		System.out.print("03: Verifica implementazione Setter di Circle...");
		c.setXC(10);
		c.setYC(11);
		c.setR(12);
		if (c.getXC() != 10)
			throw new Exception("Errore nell'implementazione di setXC");
		if (c.getYC() != 11)
			throw new Exception("Errore nell'implementazione di setYC");
		if (c.getR() != 12)
			throw new Exception("Errore nell'implementazione di setR");
		System.out.println("superata");
		// Verifica di eccezione in setR
		System.out.print("04: Verifica implementazione setR di Circle...");
		try {
			c.setR(-1);
			// Se viene eseguita l'istruzione successiva, non è stata lanciata
			// l'eccezione
			// per il raggio non positivo. L'implementazione sarebbe errata.
			throw new Exception("Errore nell'implementazione di setR");
		} catch (IllegalArgumentException e) {
			System.out.println("superata");
		}
	}

	private static void testRectangle() throws Exception {
		Rectangle r;
		System.out.println("\n==> Verifica Rectangle");
		// Verifica di Costruttore Rectangle
		System.out
				.print("21a: Verifica implementazione costruttore di Rectangle...");
		try {
			r = new Rectangle(0, 0, 0, 1);
			// Se viene eseguita l'istruzione successiva, non è stata lanciata
			// l'eccezione
			// per il raggio non positivo. L'implementazione sarebbe errata.
			throw new Exception("Errore nell'implementazione di Costruttore");
		} catch (IllegalArgumentException e) {
			System.out.println("superata");
		}
		System.out
				.print("21b: Verifica implementazione costruttore di Rectangle...");
		try {
			r = new Rectangle(0, 0, 1, 0);
			throw new Exception("Errore nell'implementazione di Costruttore");
		} catch (IllegalArgumentException e) {
			System.out.println("superata");
		}
		// Verifica di Costruttore e Getter
		System.out
				.print("22: Verifica implementazione Costruttore e Getter di Rectangle...");
		r = new Rectangle(5, 6, 7, 8);
		if (r.getXV() != 5)
			throw new Exception(
					"Errore nell'implementazione di getXV o Costruttore");
		if (r.getYV() != 6)
			throw new Exception(
					"Errore nell'implementazione di getYV o Costruttore");
		if (r.getXSideLength() != 7)
			throw new Exception(
					"Errore nell'implementazione di getXSideLength o Costruttore");
		if (r.getYSideLength() != 8)
			throw new Exception(
					"Errore nell'implementazione di getYSideLength o Costruttore");
		System.out.println("superata");
		// Verifica di Setter
		System.out.print("23: Verifica implementazione Setter di Rectangle...");
		r.setXV(10);
		r.setYV(11);
		r.setXSideLength(12);
		r.setYSideLength(13);
		if (r.getXV() != 10)
			throw new Exception("Errore nell'implementazione di setXV");
		if (r.getYV() != 11)
			throw new Exception("Errore nell'implementazione di setYV");
		if (r.getXSideLength() != 12)
			throw new Exception("Errore nell'implementazione di setXSideLength");
		if (r.getYSideLength() != 13)
			throw new Exception("Errore nell'implementazione di setYSideLength");
		System.out.println("superata");
		System.out
				.print("24: Verifica implementazione setXSideLength di Rectangle...");
		try {
			r.setXSideLength(-1);
			throw new Exception("Errore nell'implementazione di setXSideLength");
		} catch (IllegalArgumentException e) {
			System.out.println("superata");
		}
		System.out
				.print("25: Verifica implementazione setYSideLength di Rectangle...");
		try {
			r.setYSideLength(-1);
			throw new Exception("Errore nell'implementazione di setYSideLength");
		} catch (IllegalArgumentException e) {
			System.out.println("superata");
		}
	}

	private static void testSquare() throws Exception {
		Square s;
		System.out.println("\n==> Verifica Square");
		// Verifica di Costruttore Rectangle
		System.out
				.print("31: Verifica implementazione costruttore di Square...");
		try {
			s = new Square(0, 0, 0);
			// Se viene eseguita l'istruzione successiva, non è stata lanciata
			// l'eccezione
			// per il raggio non positivo. L'implementazione sarebbe errata.
			throw new Exception("Errore nell'implementazione di Costruttore");
		} catch (IllegalArgumentException e) {
			System.out.println("superata");
		}
		// Verifica di Costruttore e Getter
		System.out
				.print("32: Verifica implementazione Costruttore e Getter di Square...");
		s = new Square(5, 6, 7);
		if (s.getXV() != 5)
			throw new Exception(
					"Errore nell'implementazione di getXV o Costruttore");
		if (s.getYV() != 6)
			throw new Exception(
					"Errore nell'implementazione di getYV o Costruttore");
		if (s.getL() != 7)
			throw new Exception(
					"Errore nell'implementazione di getL o Costruttore");
		if (s.getYSideLength() != s.getXSideLength())
			throw new Exception(
					"Errore nell'implementazione di getYSideLength, getYSideLength o Costruttore");
		if (s.getYSideLength() != 7)
			throw new Exception(
					"Errore nell'implementazione di setYSideLength, getYSideLength o Costruttore");
		System.out.println("superata");
		// Verifica di Setter
		System.out.print("33: Verifica implementazione Setter di Rectangle...");
		s.setXV(10);
		s.setYV(11);
		s.setL(12);
		if (s.getXV() != 10)
			throw new Exception("Errore nell'implementazione di setXV");
		if (s.getYV() != 11)
			throw new Exception("Errore nell'implementazione di setYV");
		if (s.getL() != 12)
			throw new Exception("Errore nell'implementazione di setL");
		if (s.getYSideLength() != s.getXSideLength())
			throw new Exception(
					"Errore nell'implementazione di setYSideLength o setYSideLength");
		if (s.getYSideLength() != 12)
			throw new Exception(
					"Errore nell'implementazione di setYSideLength o setYSideLength");
		System.out.println("superata");
		System.out.print("34: Verifica implementazione setL di Square...");
		try {
			s.setL(-1);
			throw new Exception("Errore nell'implementazione di setL");
		} catch (IllegalArgumentException e) {
			System.out.println("superata");
		}
		System.out
				.print("35: Verifica implementazione setYSideLength di Square...");
		try {
			s.setYSideLength(-1);
			throw new Exception("Errore nell'implementazione di setYSideLength");
		} catch (IllegalArgumentException e) {
			System.out.println("superata");
		}
		System.out
				.print("36: Verifica implementazione setXSideLength di Square...");
		try {
			s.setXSideLength(-1);
			throw new Exception("Errore nell'implementazione di setXSideLength");
		} catch (IllegalArgumentException e) {
			System.out.println("superata");
		}
	}
}