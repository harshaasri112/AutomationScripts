package adnabu;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.basetest;
@Test
public class search2 extends basetest {
	 
		 public static void psearch() throws InterruptedException, AWTException
		 {
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		 WebElement search=driver.findElement(By.xpath("(//*[local-name()='svg' and @class='icon icon-search']/*[name()='path'])[3]"));
		 Actions act = new Actions(driver);
		 act.moveToElement(search).click().perform();
		 
//		 Enter a search with multiple keywords 
		 
		 WebElement find =driver.findElement(By.xpath("//input[@class='search__input search-bar__input']"));
				find.click();
				find.sendKeys("Necklace and Earring");
		 Robot r =new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
}
}