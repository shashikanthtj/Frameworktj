package Dataprov;

import org.testng.annotations.Test;

public class DataprovExaple {
	@Test(dataProvider = "logincredential",dataProviderClass = customdataprov.class)
public void logintest(String un,String pwd)
{
		System.out.println(un +" "+ pwd);
}
}
