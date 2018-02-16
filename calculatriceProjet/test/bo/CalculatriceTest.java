package bo;



import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;




public class CalculatriceTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Calculatrice1 call = new Calculatrice1();
		Test t;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testAdditionner() {
		double result;
		double calcul;
		
		result = 30;
		
		calcul = Calculatrice1.additionner(10, 20);
		
		Assert.assertEquals(result, calcul,0.0001);
	}

	@Test
	public void testSoustraire() {
		double result;
		double calcul;
		
		result = 10;
		
		calcul = Calculatrice1.soustraire(30, 20);
		
		Assert.assertEquals(result, calcul,0.0001);
	}


	@Test
	public void testDevision() {
		double result;
		double calcul;
		
		result = 2;
		
		calcul = Calculatrice1.devision(30, 15);
		
		Assert.assertEquals(result, calcul,0.0001);
	}

}
