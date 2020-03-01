package e;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import alco.calcoo;

class calcooTest {
private static final int timeout = 0;
Exception ee= new Exception ();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	calcoo f =new calcoo ();
	
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@Test 
	public void add_inputaa_b_outc() {
		calcoo f =new calcoo ();
		int a= 9;
		int b =0 ;
	int c;
	c=f.add(a, b);
	assertTrue(c==9);
		
	}
	
	@Test 
	public void add_neg_pos() {
		calcoo f =new calcoo ();
		int a= 9;
		int b =-9 ;
	int c;
	c=f.add(a, b);
	assertTrue(c==0);
		
	}
	
	/*@Test
	(expected=ArithmeticException.class)
	public void div_90_exp () {
		
		calcoo f =new calcoo ();
		int a= 9;
		int b =0 ;
	int c;
	c=f.div(a, b);
		
	}*/

	
}


