package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CrudAppTestingApp {
    public static final String XPATH_INPUT = "/html/body/main/section[1]/form/fieldset[1]/input";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://rkalau5296.github.io/");

        WebElement searchField = driver.findElement(By.xpath("XPATH_INPUT"));
        searchField.sendKeys("New robotic task");
    }

}
