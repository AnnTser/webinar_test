package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import utils.Utils;

import static com.codeborne.selenide.Configuration.baseUrl;
import static io.qameta.allure.Allure.step;
@Tag("MainPage")
public class MainPageTest extends TestBase {
    MainPage mainPage = new MainPage();
    Utils utils = new Utils();

    @Test
    @DisplayName("Проверка наличия списка продуктов на главной странице")
    public void checkProductList() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage(baseUrl);
        });
        step("Проверить наличие списка продуктов в экосистеме", () -> {
            mainPage.setProducts(utils.productList);
        });
    }

    @Test
    @DisplayName("Проверка наличия кнопки Создать Вебинар на главной странице")
    public void checkWebinarButton() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage(baseUrl);
        });
        step("Проверить наличие кнопки Создать Вебинар", () -> {
            mainPage.checkRedButton();
        });

    }

    @Test
    @DisplayName("Проверка кликабельности кнопки Войти на главной странице")
    public void checkSignButton() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage(baseUrl);
        });
        step("Найти кнопку Войти и кликнуть", () -> {
            mainPage.checkSignButton();
        });

    }

    @Test
    @DisplayName("Проверка скачиваемости Оферты на главной странице")
    public void checkOferta() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage(baseUrl);
        });
        step("Найти ссылку Оферта", () -> {
            mainPage.checkOfertaLink();
        });
        step("Скачать файл оферты", () -> {
            mainPage.downloadOfertaLink(true);

        });
    }


}
