package com.example;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTests {

    @Mock
    Feline feline;

    @Test
    public void getKittensIsAlwaysZero() throws Exception{
        MatcherAssert.assertThat("У льва Алекса не может быть котят",
                new LionAlex(feline).getKittens(),
                equalTo(0)
        );
    }

    @Test
    public void getPlaceOfLivingIsCorrect() throws Exception {
        MatcherAssert.assertThat("Лев Алекс живёт не там",
                new LionAlex(feline).getPlaceOfLiving(),
                equalTo("Нью-Йоркский зоопарк")
        );
    }

    @Test
    public void getFriendsIsCorrect() throws Exception {
        List<String> expectedList = List.of(
                "Зебра Марти",
                "Бегемотиха Глория",
                "Жираф Мелман"
        );
        MatcherAssert.assertThat("Неправильный список друзей",
                new LionAlex(feline).getFriends(),
                equalTo(expectedList)
        );
    }
}
