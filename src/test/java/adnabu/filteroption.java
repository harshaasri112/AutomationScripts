package adnabu;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.basetest;

public class filteroption extends basetest 
{
	@Test
	public static void filter() throws InterruptedException, AWTException
	 {
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[@class='site-nav__label'][normalize-space()='Catalog']")).click();
	  WebElement dropdown= driver.findElement(By.xpath("//select[@id='FilterTags']"));
	  dropdown.click();
	  Select s = new Select(dropdown);
	  s.selectByIndex(3);
      s.selectByVisibleText("33");
		 
	 }
}
