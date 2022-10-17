package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Backgroundcolorpage {
WebDriver driver;
public  Backgroundcolorpage(WebDriver driver) {
	this.driver = driver;
}

@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]")
WebElement SKYBLUEBUTTON;
@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set White Background')]")
WebElement WHITEBUTTON;



public void skycolorbackground() {
	SKYBLUEBUTTON.click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
}

public void whitecolorbackground() {
	 WHITEBUTTON.click();
	 try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
}



















}
