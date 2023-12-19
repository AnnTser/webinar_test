package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    SelenideElement
            titleLabel = $x("//*[@class='promo__title promo__title--name']"),
            ecosystemList = $(".ecosystem__list"),
            support = $(".header-top__list-item"),
            createWebinarButton = $(byText("Создать вебинар")),
            ofertaLink = $(".footer__menu").$(byText("Оферта")),
            downloadFile = $("a[href*='/legal/license-agreement.pdf']"),
            signButton = $(".header-bottom__btn");


    public MainPage openPage(String value) {
        open(value);
        titleLabel.shouldHave(text("МТС Линк "));
        return this;
    }


    public MainPage setProducts(String value) {
        ecosystemList.$(byText(value)).should(appear);
        return this;
    }


    public MainPage checkRedButton() {
        createWebinarButton.shouldHave(text("Создать вебинар"));

        return this;
    }

    public MainPage checkOfertaLink() {
        ofertaLink.shouldHave(text("Оферта"));

        return this;
    }

    public MainPage downloadOfertaLink(Boolean value) throws FileNotFoundException {
        ofertaLink.shouldHave(text("Оферта"));
        File file = downloadFile.download();
        Assertions.assertTrue(file.exists());

        return this;
    }

    public MainPage checkSignButton() {
        signButton.should(exist).click();
        return this;
    }

}
