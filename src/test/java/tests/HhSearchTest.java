package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.HhHomePage;

public class HhSearchTest extends TestBase {

    HhHomePage hhHomePage = new HhHomePage();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Feature("Поиск вакансий")
    @Story("Поиск QA вакансий на hh.ru")
    @DisplayName("Поиск вакансий QA специалиста")
    @Tag("search")
    @Tag("regression")
    @Tag("simple")
    void searchQaVacancies() {
        hhHomePage.openPage()
                .verifyMainPageHeader()
                .setJobSearchInput("QA")
                .clickSubmitButton()
                .closeBanner()
                .verifySearchResults();
    }
}