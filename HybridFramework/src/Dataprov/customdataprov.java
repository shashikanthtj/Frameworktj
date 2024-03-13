package Dataprov;

import org.testng.annotations.DataProvider;

public class customdataprov {
	@DataProvider(name="logincredential")
	public Object[][] getdata()
	{
		Object[][] data= {{"santhosh@gmail.com","123"},{"pradeep@gmail.com","456"}};
		return data;
	}

}
