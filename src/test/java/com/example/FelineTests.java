package com.example;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class FelineTests {

    @Test
    public void getFamilyIsCorrect() {
        String expectedFelineFamilyName = "Кошачьи";
        MatcherAssert.assertThat("Некорректное название семейства кошачьих",
                new Feline().getFamily(),
                equalTo(expectedFelineFamilyName)
        );
    }

    @Test
    public void getKittensInputCountIsCorrect() {
        int expectedCount = 5;
        MatcherAssert.assertThat("Некорректное количество котят",
                new Feline().getKittens(expectedCount),
                equalTo(expectedCount)
        );
    }

    @Test
    public void getKittensDefaultIsCorrect() {
        int expectedCount = 1;
        MatcherAssert.assertThat("Некорректное количество котят",
                new Feline().getKittens(),
                equalTo(expectedCount)
        );
    }

    @Test
    public void eatMeatIsCorrect() throws Exception {
        Feline feline = new Feline();

        MatcherAssert.assertThat("Неправильный список еды",
                feline.eatMeat(),
                equalTo(feline.getFood("Хищник"))
        );
    }
}
