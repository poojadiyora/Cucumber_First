package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.Backgroundcolorpage;
import page.TestBase;

public class StepDefinition extends TestBase  {
	Backgroundcolorpage  page;
	@Before
	public void setup() {
		initDriver();
		page = PageFactory.initElements(driver, Backgroundcolorpage.class);
	}
	
	@Given("^User is on techfios Login page$")
	public void user_is_on_techfios_Login_page() throws Throwable {
		driver.get("https://techfios.com/test/101/");
	}

	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() throws Throwable {
		String s = driver.findElement(By.xpath("//button[contains(text(),'Set SkyBlue Background')]")).getText();
		if(driver.getPageSource().contains("Set SkyBlue Background")) {
			
		System.out.println("The background button "+ s + "exists");
			
		} else
			
		System.out.println("The background button "+ s + " don't exists");
			}
	

	@When("^I click on the button$")
	public void i_click_on_the_button() throws Throwable {
	page.skycolorbackground();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
		takescreenshot(driver);
	}

	@Given("^Set SkyWhite Background button exists$")
	public void set_SkyWhite_Background_button_exists() throws Throwable {
		String s = driver.findElement(By.xpath("//button[contains(text(),'Set White Background')]")).getText();
		if(driver.getPageSource().contains("Set SkyBlue Background")) {
			
			System.out.println("The background button "+ s + "exists");
			
		} else
			
		System.out.println("The background button "+ s + " don't exists");
	}

	@When("^I click on the sky white button$")
	public void i_click_on_the_sky_white_button() throws Throwable {
	   page.whitecolorbackground();
	}

	@Then("^the background color will change to sky white$")
	public void the_background_color_will_change_to_sky_white() throws Throwable {
		takescreenshot(driver);
	}
@After
public void close() {
	teardown();
}
}
