package com.example;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class AnimalTests {

    @Test
    public void getFamilyIsCorrect() {
        String expectedString = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

        MatcherAssert.assertThat("Некорректный перечень семейств",
                new Animal().getFamily(),
                equalTo(expectedString)
        );
    }

    @Test(expected = Exception.class)
    public void getFoodThrowsException() throws Exception {
        new Animal().getFood("");
    }
}
