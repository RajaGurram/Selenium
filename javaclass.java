package com.selenium.example;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class javaclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/toumetis/Downloads/chrome/chromedriver");
		//System.setProperty("webdriver.gecko.driver","/Users/toumetis/Downloads/SeleniumGecko/geckodriver");
//WebDriver driver = new FirefoxDriver();
WebDriver driver = new ChromeDriver();
driver.get("https://mas.comdasys.com/ucs/dl/micollab/feature-quicklaunch-context-menu-bc441ddf3032c16106079cca3d250a09d0bed57f.3576/");

//driver.findElement(By.partialLinkText("3568")).click();
driver.manage().window().maximize();
driver.findElement(By.className("button-content")).click();
//String URL1 = driver.getCurrentUrl();
driver.getCurrentUrl();
//driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"login_form\"]/input[2]")).sendKeys("rgurram2");
//WebDriverWait wait = new WebDriverWait(driver, 10);
driver.findElement(By.xpath("//*[@id=\"login_form\"]/input[3]")).sendKeys("Sesam123!");
driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/table/tr/td[3]/div/div/div/div")).click();

driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
driver.findElement(By.xpath("/html/body/div[1]/div[11]/div/div[2]/ul/li[2]/div/span")).click();
//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
driver.findElement(By.xpath("/html/body/div[1]/div[11]/div/div[2]/ul/li[3]/div/span")).click();
//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
driver.findElement(By.xpath("/html/body/div[1]/div[11]/div/div[2]/ul/li[4]/div/span")).click();

driver.findElement(By.xpath("/html/body/div[1]/div[11]/div/div[2]/ul/li[5]/div/span")).click();
//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
driver.findElement(By.xpath("/html/body/div[1]/div[11]/div/div[2]/ul/li[6]/div/span")).click();
//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
driver.findElement(By.xpath("/html/body/div[1]/div[11]/div/div[2]/ul/li[7]/div/span")).click();
//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
driver.findElement(By.xpath("/html/body/div[1]/div[11]/div/div[2]/ul/li[8]/div/span")).click();

driver.findElement(By.xpath("/html/body/div[1]/div[11]/div/div[2]/ul/li[8]/div/span")).click();


driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/ul/li[1]/div/div")).click();
//driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/ul/li[2]/div/div")).click();
driver.findElement(By.xpath("/html/body/div[1]/div[9]/div/div[3]")).click();
driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[1]/div[2]/div/div[3]")).click();
driver.findElement(By.xpath("/html/body/div[1]/div[8]/div[1]/div[1]/div/div[2]/div/div[1]")).click();



driver.close();

	}
}
