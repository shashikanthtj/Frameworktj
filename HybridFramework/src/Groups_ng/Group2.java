package Groups_ng;

import org.testng.annotations.Test;

@Test(groups = {"g1","g2"})
public class Group2 {
	@Test
	public void test2()
	{
		System.out.println("hello Asia");
	}
}
