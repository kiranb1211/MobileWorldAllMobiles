package ppom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





public class Amobiles {
	@Test
    public void allmobiles() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran.b\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         Thread.sleep(2000);
         landingpage landingpage1 = new landingpage(driver);
         landingpage1.goTo();
         Thread.sleep(2000);
  
         
         landingpage1.searchbox("lenova");
         Thread.sleep(2000);
         landingpage1.searchbox("samsung");
        Thread.sleep(2000);
        landingpage1.searchbox("samsuuuuuuuuuuuuuuuuunnnnnnnnnnnnnnnnnnnnngggggg");
         Thread.sleep(2000);
         landingpage1.searchbox("ip");
         Thread.sleep(2000);
         landingpage1.searchbox(" ");
         
    }

}