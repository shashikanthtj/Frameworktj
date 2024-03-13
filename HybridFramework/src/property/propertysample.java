package property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class propertysample {
@Test
public void fetachprope() throws FileNotFoundException, IOException
{
	Properties p = new Properties();
	p.load(new FileInputStream("./shashi.properties"));
	String s = p.getProperty("baseURL");
	System.out.println(s);
}
}
