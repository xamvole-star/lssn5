import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class lessn5 {
/* будем повторять 3 урок и делать ключи ssh для гита

*/


    @Test
    void GithubProverkaLesson3() {
        //Configuration.browserSize = "1900x1200";
        Configuration.holdBrowserOpen =true;

        open("https://github.com");

        // Разворачиваем окно на весь экран и получаем размер в виде сообщения
        getWebDriver().manage().window().maximize();
        System.out.println("Real size: " + getWebDriver().manage().window().getSize());




        $("[class*='HeaderSearch-module__searchSlot']").shouldHave(text("Search")).click();
        $("[aria-label*='Search or jump to']").setValue("selenide").pressEnter();
        $("[data-testid='results-list']").$("a[href*='/selenide/selenide']").hover().click();
        $("[alt*='@vinogradoff']").hover().shouldBe(Condition.visible);


    }
}
