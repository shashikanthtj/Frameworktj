package Runnerclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import Genric.Baseclass;
import Genric.excel;
import Pom.pomscript;

public class exceldata extends Baseclass {
@Test
public void data() throws InterruptedException
{
//	String val = excel.getdata("Sheet1", 1, 0);
//	System.out.println(val);
	pomscript p=new pomscript(driver);
	p.passdata(excel.getdata("Sheet1", 0, 0));
	Thread.sleep(2000);
	p.pssspwd(excel.getdata("Sheet1", 1, 0));
	Thread.sleep(2000);
	p.passele();
	Assert.fail();
}
}
