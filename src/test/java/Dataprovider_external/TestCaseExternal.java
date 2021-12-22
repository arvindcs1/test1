package Dataprovider_external;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCaseExternal {

	@Test(dataProvider="loghin_user",dataProviderClass=Data.class,groups="bvt")
	public static void tc1(String username,String pwd) {
		System.out.println(username+"============="+pwd);
		System.out.println("I am TC1");
	}
	
	
	@Test(dataProvider="acty_user",dataProviderClass=Data.class,groups="regression")
	public static void tc2(String username1,String pwd1) {
		System.out.println(username1+"============="+pwd1);
		System.out.println("I am TC2");
	}
	
	@Test(dataProvider="acty_user",dataProviderClass=Data.class,groups="regression")
	public static void tc3(String username3,String pwd3) {
		System.out.println(username3+"============="+pwd3);
		System.out.println("I am TC2");
	}
	
	@Test(dataProvider="acty_user",dataProviderClass=Data.class,groups="bvt")
	public static void tc4(String username4,String pwd4) {
		System.out.println(username4+"============="+pwd4);
		System.out.println("I am TC2");
	}
	
	@Test(dataProvider="loghin_user",dataProviderClass=Data.class,groups="bvt")
	public static void tc5(String username5,String pwd5) {
		System.out.println(username5+"============="+pwd5);
		System.out.println("I am TC1");
	}
	
}
