package test;

import static org.junit.Assert.*;
import images.Proxy;

import org.junit.Test;

public class ProxyTest {

	@Test
	public void test() {
		
		String imageURL = "HiRes_photo1";
		boolean type = false;
	
		String expectedOutput= "Displaying  " + imageURL;
		String stringReturned= null;
		Proxy classUnderTest= new Proxy(imageURL,type);
		stringReturned= classUnderTest.showImage(type);
		assertEquals("Wrong Answer !", stringReturned, expectedOutput);
	}

}
