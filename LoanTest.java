package junit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;

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
	
	Loan loan1 = new Loan(2.5, 30, 100000.00);
	Loan loan2 = new Loan(2.5, 30, 200000.00);
	Loan loan3 = new Loan(2.5, 30, 300000.00);
	Loan loan4 = new Loan(2.5, 30, 400000.00);	
	Loan loan5 = new Loan(2.0, 30, 600000.00);	
	Loan loan6 = new Loan(2.5, 30, 500000.00);		
	@Test
	public void testEquals() {
		
		assertEquals(395.12, loan1.getMonthlyPayment(), delta);
		assertEquals(142243.52, loan1.getTotalPayment(), delta);
	}
	
	@Test
	public void testArrayEquals() {
		long paymentArray1[];
		long loanArray2[];
		//Obviously these will match because they are the same loans being compared. 
		paymentArray1 = new long[] {395,790,1185};
		loanArray2 = new long[] {(long) loan1.getMonthlyPayment(),(long) loan2.getMonthlyPayment(),(long) loan3.getMonthlyPayment()};
		assertArrayEquals(paymentArray1, loanArray2);
	}
	
	@Test
	public void testFalse() {
		System.out.println("Monthly Payment should be less than your total");
		
		assertFalse(loan1.getTotalPayment() < loan1.getLoanAmount());
	}
	
	@Test
	public void testNotNull() {
		System.out.println("Make sure a loan has been created");
		assertNotNull(loan1);
	}
	
	@Test
	public void testNotSame() {
		assertNotSame(loan1, loan2);
	}
	
	@Test
	public void testNull() {
		assertNull(null);
	}
	@Test
	public void testSame() {
		assertSame(loan1,loan1);
	}
	@SuppressWarnings("deprecation")
	@Test
	public void testThat() {
		String info = "4805557736";
		String areaCode = "480";
		//Make sure the number given is an Arizona 480 number
	    assertThat(info, containsString(areaCode));
	}
	
	@Test
	public void testTrue() {
		double loanBalance = 86347.54;
		//Assure that there is still money on the loan
		assertTrue(0 < loanBalance);
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