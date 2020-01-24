package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookTestingApp {
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
        day.sendKeys("12");

        WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
        month.sendKeys("lip");

        WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
        year.sendKeys("1980");

    }
}
