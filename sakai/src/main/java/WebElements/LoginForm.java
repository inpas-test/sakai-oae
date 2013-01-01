package WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;


@Block(@FindBy(id = "topnavigation_user_options_login_form"))
public class LoginForm extends HtmlElement{
	
	@FindBy(id = "topnavigation_user_options_login_fields_username")
	private TextInput userName;
	
	@FindBy(id = "topnavigation_user_options_login_fields_password")
	private TextInput userPassword;
	
	@FindBy(id = "topnavigation_user_options_login_wrapper")
	private WebElement loginLinkButton;
	
	@FindBy(id = "topnavigation_user_options_login_button_login")
	private Button loginButton;
	

	
	public LoginForm (WebDriver webDriver){
		
		HtmlElementLoader.populatePageObject(this, webDriver);
	}
	
	public void login (String username, String password, WebDriver driver){
		
		Actions builder = new Actions(driver);
		builder.moveToElement(loginLinkButton).click().perform();

		
		userName.sendKeys(username);
		
		userPassword.sendKeys(password);
		
		loginButton.click();
		
	}

}
