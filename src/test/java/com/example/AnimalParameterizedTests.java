package com.example;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(Parameterized.class)
public class AnimalParameterizedTests {

    private final String animalKind;
    private final List<String> expectedListOfFood;

    public AnimalParameterizedTests(String animalKind, List<String> expectedListOfFood) {
        this.animalKind = animalKind;
        this.expectedListOfFood = expectedListOfFood;
    }

    @Parameterized.Parameters(name = "Класс Animal. Тип животного: {0}")
    public static Object[][] setParamsForTest() {
        return new Object[][] {
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Травоядное", List.of("Трава", "Различные растения")}
        };
    }

    @Test
    public void getFoodIsCorrect() throws Exception {
        MatcherAssert.assertThat("Неправильный набор еды",
                new Animal().getFood(animalKind),
                equalTo(this.expectedListOfFood)
        );
    }

}
