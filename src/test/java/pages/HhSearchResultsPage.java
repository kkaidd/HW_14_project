package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class HhSearchResultsPage {
    private final SelenideElement
            removeBanner = $(".bloko-modal-close-button"),
            searchResults = $("[data-qa='vacancy-serp__results']");

    @Step("Закрыть баннер")
    public HhSearchResultsPage closeBanner() {
        if (removeBanner.exists()) {
            removeBanner.click();
        }
        return this;
    }

    @Step("Проверить результаты поиска")
    public void verifySearchResults(String query) {
        searchResults.shouldBe(visible).shouldHave(text(query));
    }
}