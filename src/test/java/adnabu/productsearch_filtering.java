package adnabu;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.basetest;

public class productsearch_filtering extends basetest
{
	@Test
	public static void productsearch() throws InterruptedException, AWTException
    {
  driver.manage().window().maximize();
  Thread.sleep(3000);
 WebElement search=driver.findElement(By.xpath("(//*[local-name()='svg' and @class='icon icon-search']/*[name()='path'])[3]"));
 Actions act = new Actions(driver);
 act.moveToElement(search).click().perform();
 
// Enter a valid product name and ensure relevant results are displayed.
 WebElement find =driver.findElement(By.xpath("//input[@class='search__input search-bar__input']"));
		find.click();
		find.sendKeys("Necklace");
 Robot r =new Robot();
 r.keyPress(KeyEvent.VK_ENTER);
 r.keyRelease(KeyEvent.VK_ENTER);
      
 

 
 
 
 
 
  
    }}