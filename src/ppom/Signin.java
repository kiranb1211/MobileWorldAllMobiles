package ppom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class Signin {
	@Test
   public void signin() throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","C:\\Users\\kiran.b\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
         //driver.get("https://mobileworld.azurewebsites.net/");
         Thread.sleep(1000);
         landingpage page = new landingpage(driver);
         page.goTo();
         Thread.sleep(1000);
         page.signinapplication("Kiran","kiran@0123");
         Thread.sleep(1000);  
    }
    
}