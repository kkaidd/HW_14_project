package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.HhHomePage;

public class HhSearchTest extends TestBase {

    HhHomePage hhHomePage = new HhHomePage();

    @ValueSource(strings = {
            "Java", "Python", "Аналитик"
    })
    @ParameterizedTest(name = "{displayName}: Для запроса {0} в результирующем поле должно быть значение {0}")
    @Severity(SeverityLevel.NORMAL)
    @Feature("Поиск вакансий")
    @Story("Поиск вакансий на hh.ru")
    @DisplayName("Поиск вакансий IT специалиста")
    @Tag("parametrized")
    @Tag("simple")
    void searchVariousVacancies(String profession) {
        hhHomePage.openPage()
                .verifyMainPageHeader()
                .setJobSearchInput(profession)
                .clickSubmitButton()
                .closeBanner()
                .verifySearchResults(profession);
    }
}