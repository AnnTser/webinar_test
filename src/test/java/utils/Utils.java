package utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Utils {

    public Faker faker = new Faker(new Locale("ru"));

    public String productList = setProduct(),
            userEmail = faker.internet().emailAddress();


    public String setProduct() {
        String[] arrayProduct = {"Встречи", "Вебинары", "Курсы", "Чаты", "Доски", "Comdi"};

        return faker.options().option(arrayProduct);
    }



}
