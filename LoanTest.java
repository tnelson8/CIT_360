package junit;
import static org.junit.Assert.*;
import  org.junit.*;

public class LoanTest {
	private double delta = .005;
	
	@BeforeClass
	public static void setUp1() {
		System.out.println("Starting all tests");
	}
	
	@Before
	public void setup2() {
		System.out.println("Starting a test");
	}
	
	@Test
	public void testLoan1() {
		Loan loan = new Loan(2.5, 30, 100000.00);
		assertEquals(395.12, loan.getMonthlyPayment(), delta);
		assertEquals(142243.52, loan.getTotalPayment(), delta);
	}
	
	@Test
	public void testLoan2() {
		Loan loan = new Loan(2.5, 30, 200000.00);
		assertEquals(790.24, loan.getMonthlyPayment(), delta);
		assertEquals(284487.05, loan.getTotalPayment(), delta);
	}
	
	@AfterClass
	public static void tearDown1() {
		System.out.println("Finished all tests");
	}
	
	@After
	public void tearDown2() {
		System.out.println("Finished a test");
	}
}