package Groups_ng;

import org.testng.annotations.Test;

@Test(groups = {"g1"})
public class Group1 {
	@Test
	public void test1()
	{
		System.out.println("hello India");
	}

}
