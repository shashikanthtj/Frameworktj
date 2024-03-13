package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Fetchproperty {
	@Test
	public static String getpro() throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream("./shashi.properties"));
		String s = p.getProperty("baseURL");
		return s;
	}
}
