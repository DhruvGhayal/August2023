package StepDefinition;
import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import PageObject.AddNewCustomerPage;
import PageObject.LoginPage;
import PageObject.SearchCustomerPage;
import Utitlities.ReadConfig;
import org.apache.logging.log4j.*;
public class BaseClass {
	public static  WebDriver driver;
	public LoginPage loginPg;
	public SearchCustomerPage SearchCustPg;
	public AddNewCustomerPage addNewCustPg;
	public static Logger log;
	public ReadConfig readConfig;
	public static Properties prop;
	
	public String generateEmailId()
	{
		return(RandomStringUtils.randomAlphabetic(8));
	}
	
}
