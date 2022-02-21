/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author User
 *
 */
public class loginPage {
	
	WebDriver driver;
	
	
	By userName = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='pass']");
	By loginButton = By.xpath("//button[@id='u_0_b']");
	

    public loginPage(WebDriver driver) {
    	
    	this.driver = driver;
    }

    public void typeuserName() {
    	driver.findElement(userName).sendKeys("admin");
    }
    
    public void typepassword() {
    	driver.findElement(password).sendKeys("pass123");
    }
    
    public void clickloginButton() {
    	driver.findElement(loginButton).click();
    }
    
    

}


