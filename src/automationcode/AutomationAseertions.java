package automationcode;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationAseertions<JavascriptExecuter> {
	WebDriver driver =new ChromeDriver();
	String Website ="https://codenboxautomationlab.com/practice/";
	Random rand = new Random();
	
@BeforeTest
public void BeforStarted() {
	driver.get(Website);
	driver.manage().window().maximize();
	
}

@Test (priority= 1, enabled=false)
public void RadioButtons() {
	WebElement RadioButtons =driver.findElement(By.xpath("//div[@id='radio-btn-example']//fieldset"));
	RadioButtons.findElements(By.tagName("input"));
	Random rand = new Random();
	int Radio = rand.nextInt(RadioButtons.findElements(By.tagName("input")).size());
	WebElement RB = RadioButtons.findElements(By.tagName("input")).get(2);
	RB.click();
	
}

@Test (priority=2, enabled=false)
public void DropDownExample () {
	
	
	WebElement Country = driver.findElement(By.id("autocomplete"));
	String[] Alphabets = { "ab","dh","vh","ck","fn","rt","ya"};
	int countries = rand.nextInt(Alphabets.length);
	
	Country.sendKeys(Alphabets[countries]);
	//Country.sendKeys(Keys.ARROW_DOWN.ENTER);
	
}


@Test (priority=3, enabled=false)
public void SelectButton () {
	WebElement Selectbutt= driver.findElement(By.id("dropdown-class-example"));
	Select select = new Select(Selectbutt);
	int Slct= rand.nextInt(2);
	select.selectByIndex(Slct);
	

}


@Test (priority=4, enabled=false)
public void CheckBox () {
	WebElement Checkboxes = driver.findElement(By.cssSelector("div[id='checkbox-example'] fieldset"));
	List <WebElement> optins = Checkboxes.findElements(By.xpath("//input[@type='checkbox']"));
for (int i=0 ;i< optins.size() ;i++) {
	optins.get(i).click();
	
	
}
}



@Test (priority=5,enabled=false)
public void Click () throws InterruptedException {
	WebElement ClickButton = driver.findElement(By.id("openwindow"));
	ClickButton.click();
	List <String> windowhandls= new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(windowhandls.get(1));
	Thread.sleep(8000);
	driver.findElement(By.linkText("Services")).click();
}




@Test (priority=5,enabled=false)
public void linkClick () throws InterruptedException {
WebElement ClickButton = driver.findElement(By.id("opentab"));
ClickButton.click();



 
}



@Test (priority=6,enabled=false)
public void Hide () throws InterruptedException {
	WebElement Write = driver.findElement(By.id("name"));
	Write.sendKeys("mohammed");
	Thread.sleep(2000);
	driver.findElement(By.id("alertbtn")).click();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	driver.findElement(By.id("confirmbtn")).click();
	Thread.sleep(1000);
	driver.switchTo().alert().dismiss();
	
}




@Test (priority=7,enabled= false )
public void Table () throws InterruptedException {

List <WebElement> tableofcontent = driver.findElement(By.id("product")).findElements(By.tagName("td"));

for(int i=1 ;i<tableofcontent.size();i++ ) {
	System.out.print(tableofcontent.get(i).getText());
	
}}


@Test (priority=8,enabled= false)
public void Hidebutton () throws InterruptedException {
	WebElement hideshow = driver.findElement(By.id("enabled-example-input"));
	driver.findElement(By.id("hide-textbox")).click();
	boolean actual =hideshow.isDisplayed();
	boolean expected= true;
	Assert.assertEquals(actual, expected);
	
}




@Test (priority=9,enabled=false)
public void ableButton () throws InterruptedException {
WebElement diabled = driver.findElement(By.id("disabled-button"));
diabled.click();
boolean Writebutton = driver.findElement(By.id("enabled-example-input")).isDisplayed();
boolean expacteddisabled = true;
Assert.assertEquals(Writebutton, expacteddisabled);


}


@Test (priority = 10,enabled=false)
public void ablebutton2 () {
	
	
	 driver.findElement(By.id("enabled-button")).click();
	
	boolean Writebutton1 = driver.findElement(By.id("enabled-example-input")).isEnabled();
	boolean expactedenabled = true;
	Assert.assertEquals(Writebutton1, expactedenabled);
	
	
}

@Test (priority =11,enabled= false)
public void hover () {
	
	Actions action = new Actions(driver);
	WebElement mousehover=driver.findElement(By.id("mousehover"));
	action.moveToElement(mousehover).perform();
	WebElement Top = driver.findElement(By.partialLinkText("Reload"));
	Top.click();
	

	
	
	
}
////////////////////****************////////////////////
@Test (priority=12,enabled=false)
 public void link () {
	WebElement BookingCalender= driver.findElement(By.linkText("Booking Calendar"));
	BookingCalender.click();
	List <String> windowhanles = new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(windowhanles.get(1));
//	List <WebElement> Calender =driver.findElements(By.xpath("//a[href='javascript:void(0)']"));

	WebElement Search= driver.findElement(By.className("search-input"));
Search.sendKeys("fdgy");
	//for (int i=1;i<25;i++) {
		//List <WebElement> Calender =driver.findElements(By.xpath("//a[href='javascript:void(0)']"));
		//Calender.get(i).click();
		
		

		
	}
	

@Test (priority = 13)
public void frame () throws InterruptedException {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,2400)");

	
	WebElement Frame = driver.findElement(By.id("courses-iframe"));
	driver.switchTo().frame(0);
	
	WebElement Click = driver.findElement(By.cssSelector(".ct-mobile-meta-item.btn-nav-mobile.open-menu"));
	Click.click();
	Thread.sleep(5000);
	WebElement servise = driver.findElement(By.partialLinkText("SERVICES"));
	servise.click();
	





	
	
	
	
}






}









