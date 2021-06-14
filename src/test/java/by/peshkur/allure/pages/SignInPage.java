package by.peshkur.allure.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    private SelenideElement loginInput = $(By.xpath("//*[@id=\"email\"]"));
    private SelenideElement passwordInput = $(By.xpath("//*[@id=\"password\"]"));

    public void inputLogin(String text) {
        this.loginInput.val(text);
    }

    public void inputPassword(String text) {
        this.passwordInput.val(text);
    }

}
