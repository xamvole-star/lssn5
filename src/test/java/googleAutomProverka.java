import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;


public class googleAutomProverka {

    @Test
    void InvisibleAutomatisation() {
        // Настройка браузера
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen =true; // чтобы бразуер не закрылся, для поиска Css селекторов итд
        Configuration.pageLoadStrategy = "eager"; //стратегия загрузки, не дожидаемся полной загрузки

//скрыть факт автоматизации
        ChromeOptions options = new ChromeOptions(); // создаем новый объект для обхода ботов
        options.addArguments("--disable-blink-features=AutomationControlled");
        Configuration.browserCapabilities = options;

//Основной тест
        open("https://google.com");
<<<<<<< HEAD
        $("[aria-label='Найти']").setValue("It`s my life").pressEnter();
=======
        $("[aria-label='Найти']").setValue("ЖОпа с ручкой").pressEnter();
        System.out.println("This is the best test"); // suit
>>>>>>> ffc94335e56a97b5983a1bc0d9c3e5a6f8137cd5
        int i = 3;
        Assertions.assertTrue(i>2);
        // System.out.println("This is the best test");
    }
}
