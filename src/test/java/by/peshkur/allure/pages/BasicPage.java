package by.peshkur.allure.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicPage {

    public void clickButton(String text) {
        $(By.xpath("//*[@id=\"__next\"]/section[1]/div[1]/div[4]/div[1]/div/a")).click();
    }

    public void clickButtonSpan(String text) {
        $(By.xpath("//span[text()='" + text + "']/..")).click();
    }

    public void contentIsVisible(String text) {
        $(By.xpath("//*[text()='" + text + "']")).shouldBe(Condition.visible);
    }
}
