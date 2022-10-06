package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class ArrayListTest {
@Test
public void check()
{
	ArrayListElem arr=new ArrayListElem();
	int b=arr.check();
	assertEquals(3,b);
	}
}
