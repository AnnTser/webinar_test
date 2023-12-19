package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AuthPage;

import static io.qameta.allure.Allure.step;
@Tag("Auth")
public class AuthPageTest extends TestBase {
    AuthPage authPage = new AuthPage();

    @Test
    @DisplayName("Проверка открытия страницы авторизации и наличия надписи Вход")
    public void checkTitleTest() {
        step("Открыть страницу Авторизации", () -> {
            authPage.openAuthPage();
        });
    }

    @Test
    @DisplayName("Проверка наличия поля Почта")
    public void checkEmailTest() {
        step("Открыть страницу Авторизации", () -> {
            authPage.openAuthPage();
        });
        step("Поле почта есть на странице", () -> {
            authPage.checkUserEmail();
        });
    }

    @Test
    @DisplayName("Проверка наличия поля Пароль")
    public void checkPasswordTest() {
        step("Открыть страницу Авторизации", () -> {
            authPage.openAuthPage();
        });
        step("Поле Пароль есть на странице", () -> {
            authPage.checkUserPassword();
        });
    }

    @Test
    @DisplayName("Проверка наличия чекбокса Запомнить меня")
    public void checkRememberTest() {
        step("Открыть страницу Авторизации", () -> {
            authPage.openAuthPage();
        });
        step("Чекбокс Запомнить меня есть на странице", () -> {
            authPage.checkRememberMe();
        });
    }

    @Test
    @DisplayName("Проверка наличия кнопки Войти")
    public void checkSubmitTest() {
        step("Открыть страницу Авторизации", () -> {
            authPage.openAuthPage();
        });
        step("Кнопка Войти есть на странице", () -> {
            authPage.checkSubmitButton();
        });
    }

    @Test
    @DisplayName("Проверка наличия кнопки Войти через SSO")
    public void checkSSOButtonTest() {
        step("Открыть страницу Авторизации", () -> {
            authPage.openAuthPage();
        });
        step("Кнопка Войти через SSO есть на странице", () -> {
            authPage.checkLoginSsoButtonButton();
        });
    }

    @Test
    @DisplayName("Проверка наличия кнопки Восстановить пароль")
    public void checkRecoverTest() {
        step("Открыть страницу Авторизации", () -> {
            authPage.openAuthPage();
        });
        step("Кнопка Восстановить пароль есть на странице", () -> {
            authPage.checkRecoverPasswordButton();
        });
    }

    @Test
    @DisplayName("Проверка наличия кнопки Создать аккаунт")
    public void checkCreateAccountTest() {
        step("Открыть страницу Авторизации", () -> {
            authPage.openAuthPage();
        });
        step("Кнопка Создать аккаунт есть на странице", () -> {
            authPage.checkCreateAccountButton();
        });
    }
}