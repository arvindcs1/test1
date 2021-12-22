package ui;

import org.testng.annotations.Test;

public class Invocationcount {

@Test
public static void test1() 
{
	System.out.println("test 1");
}

@Test(invocationCount=7)
public static void test2() 
{
	System.out.println("test 2");
}
@Test(invocationCount=3)
public static void test3() 
{
	System.out.println("test 3");
}

@Test
public static void test4() 
{
	System.out.println("test 4");
}
	

}
