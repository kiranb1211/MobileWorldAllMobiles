package ppom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class sup {
	@Test
    public void signup() throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\kiran.b\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         Thread.sleep(1000);
      landingpage landingpage = new landingpage(driver);
         landingpage.goTo();
         Thread.sleep(1000);
         landingpage.signupapplication("Kiran","bkkk","kiran@gmail.com","kiran@0123" ,"01/06/1999","9945339074","Welcome to Qualitest");
         Thread.sleep(1000);
    }
}
