package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class teststr {

	@Test
	public void test() {
		jUnitFunction junitstr = new jUnitFunction();
		String result = junitstr.addstring("Software ","Engineering");
		assertEquals ("Software Engineering", result);
	}

}
