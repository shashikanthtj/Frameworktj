package Listeners_tng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenersExample {
@Test
public void Compose()
{
	System.out.println("message composed");
}
@Test
public void Sentitem()
{
	System.out.println("message sent");
	Assert.fail();
}
@Test(dependsOnMethods = "Sentitem")
public void trash()
{
	System.out.println("message deleted");
}

}
