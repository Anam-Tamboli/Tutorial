package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class OopsTest {
	@Test
	public void evaluatesExpression() {
		DerivedStud d1= new DerivedStud();
		String s1=d1.stud_name();
		DerivedStud d2= new DerivedStud();
		String s2=d2.stream();
		DerivedStud d3= new DerivedStud();
		String s3=d3.stud_name("String");
		assertEquals("Anam",s1);
		assertEquals("Engineering",s2);
		assertEquals("Tamboli",s3);
	}

}
