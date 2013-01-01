package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.PageHeader;
import WebElements.LoginForm;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class WhenHomePageIsLoaded {
	
	private WebDriver driver = new FirefoxDriver();
	private PageHeader pageHeader = new PageHeader(driver);
	private LoginForm loginForm = new LoginForm(driver);


	
	@Before
	public void LoadHomePage(){
		
		driver.get("http://localhost:8080/");
		
	}
	
	
	@Test
	public void aUserShouldLogging(){
		
		loginForm.login("admin", "admin", driver);
		
		assertThat(driver.getTitle(), containsString("User"));
		
	}
	
	@Ignore
	public void aUserShouldSearhByString() throws InterruptedException{
		
		System.out.println("Bigin test!");
		
		pageHeader.search("Тест");
		
		pageHeader.viewResults();
		
		assertThat(pageHeader.toString(), containsString("message"));

	}

	@After
	public void closePage(){

		//driver.quit();
		
	}
}
