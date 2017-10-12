/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpbbank.rinor.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author rinor.jashari
 */
public class Programi {
    
    private WebDriver driver;
    private String baseUrl;
    
    
    
    public void filloProgramin(){
        
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "http://google.com/";
        
        driver.navigate().to(baseUrl);
        driver.manage().window().maximize();
        
        WebElement element = driver.findElement(By.id("lst-ib"));
        element.sendKeys("Ylli Petrovci facebook");
        element.submit();
        
        element = driver.findElement(By.partialLinkText("Ylli-Petrovci"));
        element.click();
        
//        element.sendKeys(Keys.ENTER);

    }
}
