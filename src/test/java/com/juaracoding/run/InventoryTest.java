package com.juaracoding.run;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InventoryTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void verifyAddToCart() throws InterruptedException {

        
        String username = "standard_user";
        String password = "secret_sauce";

        
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        
        WebElement inventoryTitle = driver.findElement(By.className("title"));
        Assert.assertEquals(inventoryTitle.getText(), "Products");

        
        WebElement addToCartButton = driver.findElement(
                By.id("add-to-cart-sauce-labs-backpack"));
        addToCartButton.click();

       
        WebElement cartBadge = driver.findElement(
                By.className("shopping_cart_badge"));
        Assert.assertEquals(cartBadge.getText(), "1");

       
        WebElement removeButton = driver.findElement(
                By.id("remove-sauce-labs-backpack"));
        Assert.assertTrue(removeButton.isDisplayed());

        System.out.println("Test Case TC_INV_003 PASSED");
    }

    @AfterMethod
    public void teardown() {

      
        driver.quit();
    }
}
