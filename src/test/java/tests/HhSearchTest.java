package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.HhHomePage;

public class HhSearchTest extends TestBase {

    HhHomePage hhHomePage = new HhHomePage();

    @Test
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