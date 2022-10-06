package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class JokerTest {
	@Test
	public void check()
	{
		Joker j= new Joker("Joker1","Bharatnatyam");
		Joker j1= new Joker("Joker3","Kuchipudi");
		assertEquals("Bharatnatyam",j.dance);
		assertEquals("Kuchipudi",j1.dance);
	}

}
