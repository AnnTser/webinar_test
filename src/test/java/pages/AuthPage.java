package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AuthPage {

    SelenideElement
            authLabel = $(".AuthContent_title__xRmXF"),
            userEmail = $("[data-testid = 'SignIn.field.email']"),
            userPassword = $("[data-testid = 'SignIn.field.password']"),
            checkBoxRememberMe = $("[data-testid = 'SignIn.field.remember-me']"),
            submitButton = $("[data-testid = 'SignIn.action.submit']"),
            loginSsoButton = $("[data-testid = 'SignIn.action.go-to-sso-signin']"),
            recoverPasswordButton = $("[data-testid = 'SignIn.action.go-to-password-recovery']"),
            createAccountButton = $("[data-testid = 'SignIn.action.go-to-signup']");


    public AuthPage openAuthPage() {
        open("https://events.webinar.ru/signin");
        authLabel.shouldHave(text("Log in"));
        return this;
    }


    public AuthPage checkUserEmail() {
        userEmail.should(exist);
        return this;
    }

    public AuthPage checkUserPassword() {
        userPassword.should(exist);

        return this;
    }

    public AuthPage checkRememberMe() {
        checkBoxRememberMe.should(exist);

        return this;
    }

    public AuthPage checkSubmitButton() {
        submitButton.should(exist);

        return this;
    }

    public AuthPage checkLoginSsoButtonButton() {
        loginSsoButton.should(exist);
        return this;
    }

    public AuthPage checkRecoverPasswordButton() {
        recoverPasswordButton.should(exist);
        return this;
    }

    public AuthPage checkCreateAccountButton() {
        createAccountButton.should(exist);
        return this;
    }

}
