package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class ConcreteTest {
	@Test
	public void evaluatesExpression()
	{
		Product1 a=new Product1();
		Product1 b=new Product1();
		Product2 a1=new Product2();
		Product2 b1=new Product2();
		Product3 a2=new Product3();
		Product3 b2=new Product3();
		Product4 a3=new Product4();
		Product4 b3=new Product4();
		
		String x1=a.prod_name();
		String x2=a1.prod_name();
		String x3=a2.prod_name();
		String x4=a3.prod_name();
		
		String y1=b.prod_manu();
		String y2=b1.prod_manu();
		String y3=b2.prod_manu();
		String y4=b3.prod_manu();
		
		assertEquals("Soap",x1);
		assertEquals("India",y1);
		assertEquals("Tooth-Paste",x2);
		assertEquals("USA",y2);
		assertEquals("Tooth-Brush",x3);
		assertEquals("UAE",y3);
		assertEquals("Body-Wash",x4);
		assertEquals("Africa",y4);
	}

	
	
}
