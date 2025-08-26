package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class HhHomePage {

    private SelenideElement jobSearchInput = $("[data-qa='search-input']"),
            submitButton = $("[data-qa='search-button']");

    public HhHomePage openPage() {
        open("/");
        return this;
    }

    public HhHomePage removeBanner() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public HhHomePage jobSearchInput(String value) {
        jobSearchInput.shouldBe(visible).setValue(value);
        return this;
    }

    public HhHomePage submitButton() {
        submitButton.click();
        return this;
    }

    public HhHomePage removeHhBanner() {
        executeJavaScript(
                "var banner = document.querySelector('.bloko-modal-container_visible');" +
                        "if (banner) banner.remove();" +
                        "var footer = document.querySelector('footer');" +
                        "if (footer) footer.remove();"
        );
        executeJavaScript(
                "var tooltip = document.querySelector('[data-qa=\"tooltip\"]');" +
                        "if (tooltip) tooltip.remove();" +
                        "var regionTooltip = document.querySelector('.magritte-tooltip___Hxyh2_10-0-6');" +
                        "if (regionTooltip) regionTooltip.remove();"
        );
        executeJavaScript(
                "var overlay = document.querySelector('.bloko-modal-overlay');" +
                        "if (overlay) overlay.remove();"
        );
        return this;
    }

    public void verifySearchResults() {
        $("[data-qa='vacancy-serp__results']").shouldBe(visible);
        $("[data-qa='vacancy-serp__results']").shouldHave(text("QA"));
    }

    private void executeJavaScript(String script) {
        JavascriptExecutor js = (JavascriptExecutor) WebDriverRunner.getWebDriver();
        js.executeScript(script);
    }
}