package org.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testfiles {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com");



        System.out.println("pageTitle"+ driver.getTitle());


        driver.manage().window().minimize();

        driver.quit();
    }
}
