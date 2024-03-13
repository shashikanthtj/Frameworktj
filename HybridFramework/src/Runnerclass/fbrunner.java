package Runnerclass;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pom.pomscript;

public class fbrunner extends Genric.Baseclass {
@Test(dataProvider ="test1")
public void logfb(String un,String pwd) throws InterruptedException
{
	
	pomscript p=new pomscript(driver);
	p.passdata(un);
	Thread.sleep(2000);
	p.pssspwd(pwd);
	Thread.sleep(2000);
	p.passele();

}
@DataProvider(name="test1")
public Object[][] createData1()
{
	return new Object[][]
			{
		{"shashikanth@gmail.com","shashi@123"},
		{"santhosh@gmail.com","santhosh@123"}
			};
}
}
