import org.junit.After;
import org.junit.Before;
import org.junit.   Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SampleTest {

   @Test
    public void someTest(){
       WebDriver webDriver = new ChromeDriver();

       webDriver.get("http://localhost:8083/onlinebookstore/");
       System.out.println("URL is valid");
       assertEquals( "http://localhost:8083/onlinebookstore/",webDriver.getCurrentUrl());
       assertEquals( "Book Store", webDriver.getTitle());

       webDriver.quit();
    }

    @Test
    public void adminLogin() {
        WebDriver webDriver = new ChromeDriver();
        System.out.println("Click on Login as Admin button");
        webDriver.get("http://localhost:8083/onlinebookstore/");
        webDriver.findElement(By.xpath("/html/body/table[2]")).click();
        System.out.println("username");
        webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[1]")).sendKeys("Admin");
        System.out.println("password");
        webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[2]")).sendKeys("Admin");
        webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[3]")).click();
    }

        @Test
        public void removeBook() {
            WebDriver webDriver = new ChromeDriver();
            System.out.println("Click on Login as Admin button");
            webDriver.get("http://localhost:8083/onlinebookstor");
            webDriver.findElement(By.xpath("/html/body/table[2]")).click();
            System.out.println("username");
            webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[1]")).sendKeys("Admin");
            System.out.println("password");
            webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[2]")).sendKeys("Admin");
            webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[3]")).click();
            webDriver.findElement(By.xpath("/html/body/div[8]")).click();
            webDriver.findElement(By.xpath("/html/body/div[6]/form/input[1]")).sendKeys("0103");
            webDriver.findElement(By.xpath("/html/body/div[6]/form/input[2]")).click();
        }



            @Test
            public void AddBook() {
                WebDriver webDriver = new ChromeDriver();
                System.out.println("Book was added succesfuly");
                webDriver.get("http://localhost:8083/onlinebookstore/");
                webDriver.findElement(By.xpath("/html/body/table[2]")).click();
                System.out.println("username");
                webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[1]")).sendKeys("Admin");
                System.out.println("password");
                webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[2]")).sendKeys("Admin");
                webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[3]")).click();
                webDriver.findElement(By.xpath("/html/body/div[7]")).click();
                webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[1]")).sendKeys("0103");
                webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[2]")).sendKeys("Maven is cool");
                webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[3]")).sendKeys("Laravel");
                webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[4]")).sendKeys("200");
                webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[5]")).sendKeys("18");
                webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[6]")).click();
            }



    @Test
    public void userLogin() {
        WebDriver webDriver = new ChromeDriver();
        System.out.println("Welcome");
        webDriver.get("http://localhost:8083/onlinebookstore/");
        webDriver.findElement(By.xpath("/html/body/table[3]")).click();
        System.out.println("username");
        webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[1]")).sendKeys("sis");
        System.out.println("password");
        webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[2]")).sendKeys("qwe");
        webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[3]")).click();
    }



        @Test
        public void buyBooks() {
            WebDriver webDriver = new ChromeDriver();
            System.out.println("You have suucesfuly both a book");
            webDriver.get("http://localhost:8083/onlinebookstore/");
            webDriver.findElement(By.xpath("/html/body/table[3]")).click();
            System.out.println("username");
            webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[1]")).sendKeys("lokni");
            System.out.println("password");
            webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[2]")).sendKeys("123");
            webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[3]")).click();
            webDriver.findElement(By.xpath("/html/body/div[9]")).click();
            webDriver.findElement(By.xpath("/html/body/div[7]/form/table/tbody/tr[2]/td[1]/input")).click();
            webDriver.findElement(By.xpath("/html/body/div[7]/form/table/tbody/tr[2]/td[7]/input")).sendKeys("1");
            webDriver.findElement(By.xpath("/html/body/div[7]/form/input")).click();
        }


    @Test
    public void userRegistr() {
        WebDriver webDriver = new ChromeDriver();
        System.out.println("User was registered succesfuly");
        webDriver.get("http://localhost:8083/onlinebookstore/");
        webDriver.findElement(By.xpath("/html/body/table[4]")).click();

        webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[1]")).sendKeys("Sis");
        webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[2]")).sendKeys("qwe");
        webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[3]")).sendKeys("molingen");
        webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[4]")).sendKeys("Dis");
        webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[5]")).sendKeys("voides");
        webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[6]")).sendKeys("38099011");
        webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[7]")).sendKeys("sups");
        webDriver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input[8]")).click();

    }
    @Test
    public void MoodleLogin() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://moodle.chnu.edu.ua/login/index.phpwe");
        webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        webDriver.findElement(By.xpath("//*[@id=\"region-main\"]/div/div/div/div/div/div/div[2]/div[1]/div/a")).click();
        webDriver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("prokopets.yevhen@chnu.edu.ua");
        webDriver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
        webDriver.findElement(By.name("password")).sendKeys("Toradora1");
        webDriver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();


    }


}
