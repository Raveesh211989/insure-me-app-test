package com.capstone.test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App
{
   
	public static void main( String[] args ) throws InterruptedException
    {
        //System.setProperty("webdriver.chrome.driver", "C://Users//ravee//eclipse-workspace//ChromeDriver//chromedriver-win64//chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        System.out.println("Test Case is strting");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://3.82.52.104:8085/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("Raveesh");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"inputNumber\"]")).sendKeys("78787888");
        Thread.sleep(9000);
        driver.findElement(By.xpath("//*[@id=\"inputMail\"]")).sendKeys("rks@tmail.com");
        Thread.sleep(9000);
        driver.findElement(By.xpath("//*[@id=\"inputMessage\"]")).sendKeys("How are you");
        Thread.sleep(9000);
        driver.findElement(By.xpath("//*[@id=\"my-button\"]")).click();
        Thread.sleep(9000);
        String response = driver.findElement(By.xpath("//*[@id=\"response\"]")).getText();
        String expectedResponse = "Message Sent";
        int comarisionResult = response.compareTo(expectedResponse);
        if(comarisionResult < 0) { 
	        System.out.println("Test Failed");	
	        driver.quit();
        } else {
             System.out.println("finished");
             driver.quit();
               }
}
	
}


//driver.findElement(By.id("gwt-uid-11")).sendKeys("hdasjdsa@gmail.com");
//Thread.sleep(1000);
//driver.findElement(By.id("gwt-uid-13")).sendKeys("2/11/24,");
//Thread.sleep(1000);
//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//driver.findElement(By.xpath("//*[@id=\"addressbook20-315424805\"]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/div/div[1]/div")).click();
//Thread.sleep(1000);
//driver.findElement(By.id("gwt-uid-7")).sendKeys("Kumar");
//driver.findElement(By.id("gwt-uid-5")).sendKeys("Raveesh");

//driver.findElement(By.xpath("//*[@id="inputNumber"].")).sendKeys("7382387888");
