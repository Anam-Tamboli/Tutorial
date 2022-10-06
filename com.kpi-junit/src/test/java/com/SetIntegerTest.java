package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class SetIntegerTest {
	@Test
	public void main()
	{
		SetInteger n=new SetInteger();
		int b=n.show();
		assertEquals(b,30);
	}

}
