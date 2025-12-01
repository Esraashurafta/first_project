package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mytestcases {

    String  myWebsite ="https://www.saucedemo.com/"	;
    WebDriver driver = new  EdgeDriver();
	String UserName = "standard_user";
	String Password = "secret_sauce";
	String firstName = "esraa";
	String lastName = "esraa";
	String ZipCode = "1234";
	String Url1= "https://www.google.com";
		
		@BeforeTest	
	
public void mySetup() throws InterruptedException {

driver.get(myWebsite);	
driver.manage().window().maximize();
driver.navigate().to(Url1);
//driver.navigate().to("https://facebook.com");

//Thread.sleep(3000); // يوقف الكود لمدة ثلاث ثواني
//
//driver.navigate().back(); //back يرجع للاول 
//driver.navigate().forward();//يعني بيكمل للامام بفتح الموقع الثاني
//driver.navigate().refresh();

}	
	
	
	
	
@Test
	
public void Login() {

//	driver.findElement(By.id("user-name")).sendKeys(UserName);
//	driver.findElement(By.id("password")).sendKeys(Password);
//	driver.findElement(By.id("login-button")).click();
//	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//	driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
//	driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
//	driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
//	driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
//	driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
//	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
//	driver.findElement(By.id("checkout")).click();
//	driver.findElement(By.id("first-name")).sendKeys(firstName);
//	driver.findElement(By.id("last-name")).sendKeys(lastName);
//	driver.findElement(By.id("postal-code")).sendKeys(ZipCode);
//	driver.findElement(By.id("continue")).click();
//	driver.findElement(By.id("finish")).click();
	

	
	
}	
	


@AfterTest
	
public void myAfetrTest() {

	//driver.close();
}	
	
	
	
	
	
	
	
	
}
