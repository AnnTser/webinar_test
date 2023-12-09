package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    SelenideElement
    titleLabel = $(".promo__title promo__title--name"),
    ecosystemList = $(".ecosystem__list"),
    support = $(".header-top__list-item"),
    createWebinarButton = $(".btn.block-with-numbers__btn._big btn--red a"),
    ofertaLink = $(".footer__column-list-item"),
    signButton = $(".header-bottom__btn");


    public MainPage openPage (String value) {
        open(value);
        titleLabel.shouldHave(text("МТС Линк"));
        return this;
    }

//    public RegistrationPage removeBanners() {
//        executeJavaScript("$('#fixedban').remove()");
//        executeJavaScript("$('footer').remove()");
//        return this;
//    }

    public MainPage setProducts (String value) {
        ecosystemList.$(byText(value)).click();
        return this;
    }
    public MainPage goSupport () {
        support.shouldHave(text("Поддержка 24/7"));

        return this;
    }

    public MainPage checkRedButton () {
        createWebinarButton.shouldHave(text("Создать вебинар"));

        return this;
    }
    public MainPage checkOfertaFile (String value) {
        ofertaLink.$(byText(value)).click();

        return this;
    }
    public MainPage checkSignButton () {
        signButton.should(exist).click();
        return this;
    }

}
