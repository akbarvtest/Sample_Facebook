 package Automation;

import org.openqa.selenium.By;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {

 // Create web driver interface reference as fields of test class
   
  WebDriver driver; 
  
  // Call class method setup, and instantiate web driver interface reference with FirefoxDriver
   
   @BeforeClass
   public void setUp() throws IOException {
    
    // Identify the OS
    
    
    
     driver = new FirefoxDriver();
           driver.manage().window().maximize();//Maximize the window
           driver.get("https://www.facebook.com/");//Launch URL
    
        
   }
 
 
   // Call class method tearDown, and close FireFox driver instance
   
   @AfterClass
   public void tearDown() throws IOException {
    
    driver.quit();//Close all Tab
   }
 
 
 
 @Test
  public void Career() throws Exception 
 {
  
  Login();
  
  //Find_Friends();
  Thread.sleep(7000);
  
  //Support_Inbox();
  //Thread.sleep(7000);
  
  Logout();
  
 }
 
 
 

public void Login() throws Exception
 {
  Thread.sleep(3000);
  driver.findElement(By.id("email")).sendKeys("vtest160@gmail.com");
  driver.findElement(By.id("pass")).sendKeys("V123456789");
  
  driver.findElement(By.id("loginbutton")).click();//Click on Login button.
     Thread.sleep(3000);
 }
 
 
 public void Logout() throws InterruptedException
 {
 
	 driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//li[12]/a/span/span")).click();
 }
 
 
 public void Find_Friends() throws Exception
 {
  driver.findElement(By.id("findFriendsNav")).click();
  driver.findElement(By.id("q")).sendKeys("Barack Obama");
  Thread.sleep(3000);
  
  driver.findElement(By.xpath("//div/div/span/button")).click();
  Thread.sleep(10000);
  
 }
 
 public void Support_Inbox() throws Exception
 {
  driver.findElement(By.id("userNavigationLabel")).click();
  Thread.sleep(2000);
  
  driver.findElement(By.xpath("//*[@id='u_1h_1']/div/div/div[1]/div/div/ul/li[12]/a/span/span")).click();
  Thread.sleep(10000);
  
 }
 
}