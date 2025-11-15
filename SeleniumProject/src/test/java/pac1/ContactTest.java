package pac1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest() {
		String browser =System.getProperty("browser","chrome");
	    String url= System.getProperty("url");
	    String username=System.getProperty("username");
		String password= System.getProperty("password");
		
		System.out.println(browser);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		System.out.println("execute createContactTest");
	}
	
	@Test
	public void modifyContactTest() {
		System.out.println("execute modifyContactTest");
	}


}
