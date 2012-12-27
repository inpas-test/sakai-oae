package WebElements;

import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;


@Block(@FindBy(id = "topnavigation_user_options_login_form"))
public class LoginForm extends HtmlElement{
	
	@FindBy(id = "topnavigation_user_options_login_fields_username")
	private TextInput userName;
	
	@FindBy(id = "topnavigation_user_options_login_fields_password")
	private TextInput userPassword;
	
	@FindBy(id = "topnavigation_user_options_login")
	private Button loginLinkButton;
	
	@FindBy(id = "topnavigation_user_options_login_button_login")
	private Button loginButton;
	
	public void login (String username, String password){
		
		loginLinkButton.click();
		
		userName.sendKeys(username);
		
		userPassword.setName(password);
		
		loginButton.click();
		
	}

}
