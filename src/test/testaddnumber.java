package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumber {

	@Test
	public void test() {
		tf t=new tf();
		int result=t.addnumbers(10, 20);
		assertEquals(30,result);
	}

}
