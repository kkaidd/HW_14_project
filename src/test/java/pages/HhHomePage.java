package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class HhHomePage {
    private final SelenideElement
            jobSearchInput = $("[data-qa='search-input']"),
            submitButton = $("[data-qa='search-button']"),
            mainPageHeader = $("[data-qa='main-page-anonymous-header']");

    @Step("Открыть главную страницу")
    public HhHomePage openPage() {
        open("/");
        return this;
    }

    @Step("Проверить заголовок главной страницы")
    public HhHomePage verifyMainPageHeader() {
        mainPageHeader.shouldHave(text("Работа найдётся для каждого"));
        return this;
    }

    @Step("Ввести значение '{value}' в поле поиска")
    public HhHomePage setJobSearchInput(String value) {
        jobSearchInput.shouldBe(visible).setValue(value);
        return this;
    }

    @Step("Нажать кнопку поиска")
    public HhSearchResultsPage clickSubmitButton() {
        submitButton.click();
        return new HhSearchResultsPage();
    }
}