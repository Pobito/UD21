package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {

	
	Geometria geo;
	
	@BeforeEach
	public void before() {
		System.out.println("before()");
		geo = new Geometria();
	}
	@Test
	public void testCuadrado() {
		int resultado = geo.areacuadrado(2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreaCirculo() {
		double resultado = geo.areaCirculo(5);
		int esperado = 78;
		int delta = 1;
		assertEquals(esperado, resultado, delta);
	}
	@Test
	public void testAreatriangulo() {
		double resultado = geo.areatriangulo(5, 4);
		int esperado = 10;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testArearectangulo() {
		double resultado = geo.arearectangulo(5, 4);
		int esperado = 20;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreapentagono() {
		double resultado = geo.areapentagono(5, 4);
		int esperado = 10;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testArearombo() {
		double resultado = geo.arearombo(5, 4);
		int esperado = 10;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testArearomboide() {
		double resultado = geo.arearomboide(5, 4);
		int esperado = 20;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreatrapecio() {
		double resultado = geo.areatrapecio(5, 5, 2);
		int esperado = 10;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testFiguraCuadrado() {
		String resultado = geo.figura(1);
		String esperado = "cuadrado";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testFiguraCirculo() {
		String resultado = geo.figura(2);
		String esperado = "Circulo";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testFiguraTriangulo() {
		String resultado = geo.figura(3);
		String esperado = "Triangulo";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testFiguraRectangulo() {
		String resultado = geo.figura(4);
		String esperado = "Rectangulo";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testFiguraPentagono() {
		String resultado = geo.figura(5);
		String esperado = "Pentagono";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testFiguraRombo() {
		String resultado = geo.figura(6);
		String esperado = "Rombo";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testFiguraRomboide() {
		String resultado = geo.figura(7);
		String esperado = "Romboide";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testFiguraTrapecio() {
		String resultado = geo.figura(8);
		String esperado = "Trapecio";
		assertEquals(esperado, resultado);
	}

	@Test
	public void testFiguraDefault() {
		String resultado = geo.figura(10);
		String esperado = "Default";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testGetId() {
		int resultado = geo.getId();
		int esperado = geo.getId();
		assertEquals(esperado, resultado);
	}
	@Test
	public void testSetId() {
		geo.setId(1);
		int resultado = geo.getId();
		int esperado =1;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testGetNom() {
		String resultado = geo.getNom();
		String esperado = geo.getNom();
		assertEquals(esperado, resultado);
	}
	@Test
	public void testSetNom() {
		geo.setNom("Triangulo");
		String resultado = geo.getNom();
		String esperado = "Triangulo";
		assertEquals(esperado, resultado);
	}

	@Test
	public void testGetArea() {
		double resultado = geo.getArea();
		double esperado = geo.getArea();
		assertEquals(esperado, resultado);
	}
	@Test
	public void testSetArea() {
		geo.setArea(105.32);
		double resultado = geo.getArea();
		double esperado =105.32;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testGeometria() {
		geo = new Geometria(2);
	}

	@Test
	public void testToString() {
		geo.setId(1);
		geo.setNom("Triangulo");
		geo.setArea(105.32);
		String resultado = geo.toString();
		String esperado = "Geometria [id=" + geo.getId() + ", nom=" + geo.getNom() + ", area=" + geo.getArea() + "]";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testApp() {
		assertEquals(geo, geo);
	}
	
	
}
