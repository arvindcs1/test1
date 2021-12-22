package Dataprovider_external;

import org.testng.annotations.DataProvider;

public class Data {
	@DataProvider(name="loghin_user")
	public Object[][] dataset(){
		
		return new Object[][] {
			{"trainee","trainee"},
			{"trainee","trainee"}
		};
	}

	@DataProvider(name="acty_user")
	public Object[][] dataset2(){
		
		return new Object[][] {
			{"Arvind","trainee"},
			{"trainee","trainee"}
		};
	}
}
