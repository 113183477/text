package kkk;

import org.junit.experimental.theories.Theory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class kkkk {
	WebDriver driver;
	String url;
	@BeforeClass
	public void caozuo5() {
		/*´ò¿ªä¯ÀÀÆ÷*/
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		driver=new ChromeDriver();
		url="http://localhost:8080/examsys/login.thtml";
	}
	@AfterClass
	public void caozuo6() {
		//driver.close();
		
	}
	
	@Test
	public void caozuo1() throws InterruptedException{
		
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys("hujianming");
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");
		WebElement x=driver.findElement(By.name("usertype"));
		Select y=new Select(x);
		y.selectByIndex(2);
		Thread.sleep(6000);
		WebElement k=driver.findElement(By.className("tm_btn"));
		k.click();
		
	
}}

