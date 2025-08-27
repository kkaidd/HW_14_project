package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class HhHomePage {

    private SelenideElement jobSearchInput = $("[data-qa='search-input']"),
            submitButton = $("[data-qa='search-button']"),
            removeBanner = $(".bloko-modal-close-button"),
            mainPageHeader = $("[data-qa='main-page-anonymous-header']"), // Добавлен элемент
            searchResults = $("[data-qa='vacancy-serp__results']"); // Добавлен элемент

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
    public HhHomePage clickSubmitButton() {
        submitButton.click();
        return this;
    }

    @Step("Закрыть баннер")
    public HhHomePage closeBanner() {
        if (removeBanner.exists()) {
            removeBanner.click();
        }
        return this;
    }

    @Step("Проверить результаты поиска")
    public HhHomePage verifySearchResults(String query) {
        searchResults.shouldBe(visible).shouldHave(text(query));
        return this;
    }
}