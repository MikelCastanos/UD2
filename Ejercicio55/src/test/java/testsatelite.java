import static org.junit.Assert.*;

import org.junit.Test;

public class testsatelite {
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	@Test
	public void testConstructor1() {
		
		meridiano=10;
		paralelo=15;
		distancia_tierra=25;
		
		satelite satelitetest1 =new satelite(meridiano, paralelo, distancia_tierra);
		
		assertEquals(satelitetest1.meridiano,10,0);
		assertEquals(satelitetest1.paralelo,15,0);
		assertEquals(satelitetest1.distancia_tierra,25,0);
	}
	
	@Test
	
	public void testConstructor2() {
		satelite satelitetest2 =new satelite();
		assertEquals(satelitetest2.meridiano,0,0);
		assertEquals(satelitetest2.paralelo,0,0);
		assertEquals(satelitetest2.distancia_tierra,0,0);
		
	}
	
	@Test
	
	public void testSetPosicion() {
		satelite satelitetest3 =new satelite();
		
		satelitetest3.setPosicion(345, 14, 55);
		assertEquals(satelitetest3.meridiano,345,0);
		assertEquals(satelitetest3.paralelo,14,0);
		assertEquals(satelitetest3.distancia_tierra,55,0);
		
	}
	

}