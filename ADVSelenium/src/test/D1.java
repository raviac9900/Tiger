package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class D1 {
	
	@Test
	public void State() throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream("./ravi.properties"));
		String a = p.getProperty("base");
		System.out.println(a);
	}

}
