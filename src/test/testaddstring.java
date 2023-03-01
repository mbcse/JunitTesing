package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstring {

	@Test
	public void test() {
		tf t=new tf();
		String result=t.addstrings("abc", "def");
		assertEquals("abcdef",result);
	}

}
