package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import test.ala;
class addTest {

	@Test
	void test() {
		  ala x = new ala();
	       int result= x.add(5, 7);	
	       assertEquals(12,result);
	}

}
