package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.HhHomePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class HhSearchTest extends TestBase {

    HhHomePage hhHomePage = new HhHomePage();

    @Test
    @Tag("simple")
    void searchQaVacancies() {
        step("Открыть главную страницу HeadHunter", () -> {
            hhHomePage.openPage();
            $("[data-qa='main-page-anonymous-header']").shouldHave(text("Работа найдётся для каждого"));
        });

        step("Выполнить поиск вакансий по запросу 'QA'", () -> {
            hhHomePage.jobSearchInput("QA")
                    .submitButton();
        });

        step("Проверить, что отобразились результаты поиска", () -> {
            hhHomePage.removeHhBanner().verifySearchResults();
        });
    }
}

//    @Test
//    @Tag("simple")
//    void filterByExperience() {
//
//    }