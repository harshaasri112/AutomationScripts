package adnabu;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.basetest;

public class Adding_Removing_Cart extends basetest {
	@Test
	 public static void Cart() throws InterruptedException, AWTException
	    {
	
//	Add to cart and Remove products from the cart
	
driver.manage().window().maximize();
driver.findElement(By.xpath("//span[@class='site-nav__label']")).click();
driver.findElement(By.xpath("//li[2]//div[1]//a[1]")).click();
driver.findElement(By.xpath("//button[@name='add']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//p[@class='cart__remove small--hide']//a[@aria-label='Remove 14k Wire Bloom Earrings ...'][normalize-space()='Remove']")).click();
driver.findElement(By.xpath("//a[@class='btn btn--has-icon-after cart__continue-btn']")).click();

//Check on adding the multiple products to the cart 


 Thread.sleep(3000);
 JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[6]//div[1]//a[1]")).click();
	driver.findElement(By.xpath("//span[normalize-space()='Add to cart']")).click();
	driver.findElement(By.xpath("//span[@class='site-nav__label'][normalize-space()='Home']")).click();
	 driver.findElement(By.xpath("//span[@class='site-nav__label']")).click();
	driver.findElement(By.xpath("//li[2]//div[1]//a[1]")).click();
	driver.findElement(By.xpath("//button[@name='add']")).click();
	
	// Check when the same product is added multiple times to the cart.

	
	driver.findElement(By.xpath("//span[@class='site-nav__label'][normalize-space()='Home']")).click();
	 driver.findElement(By.xpath("//span[@class='site-nav__label']")).click();
	driver.findElement(By.xpath("//li[2]//div[1]//a[1]")).click();
	WebElement dis = driver.findElement(By.xpath("//button[@name='add']"));
	dis.click();
	
//Check that the added item is displayed in the cart.
	
	System.out.println(dis.isDisplayed());
	
//	Check that the count changes on adding or removing items from the cart.
	
	List<WebElement> count =driver.findElements(By.xpath("//a[@class='site-header__icon site-header__cart']"));
	System.out.println(count.size());  
	
	    }}


