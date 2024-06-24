package Testcases;

import org.testng.annotations.Test;

public class Logintestcase extends LoginBaseclass {


	@Test
	public void Login() {
		
		
		lpa.usernamefield();
		lpa.passwordfield();
		lpa.Loginbutton();
		
		
	}
}
