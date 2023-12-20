package ru.netology.oop2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

    @Test
    public void shouldSetWave() {                   // Тест рамзмещение волны
        Radio radio = new Radio();

        radio.setCurrentWave(9);

        int expected = 9;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroWaveInMinus() {            //Тест на волну ниже минимума
        Radio radio = new Radio();

        radio.setCurrentWave(-5);

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroWaveInPlus() {             //Тест на волну выше макса
        Radio radio = new Radio();

        radio.setCurrentWave(10);

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next08Test() {                       //Следующая волна 0-8
        Radio radio = new Radio();
        radio.setCurrentWave(8);

        radio.nextWave();

        int expected = 9;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextAboveMaxTest() {                    // следущая волна выше макс
        Radio radio = new Radio();

        radio.setCurrentWave(10);


        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextBelowMinTest() {                    // следующая волна ниже мин
        Radio radio = new Radio();
        radio.setCurrentWave(-1);


        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void next9To0Test() {                        //Следующая волна 9-0
        Radio radio = new Radio();
        radio.setCurrentWave(9);

        radio.nextWave();

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev19Test() {                          //Предыдущая волна 1-9
        Radio radio = new Radio();
        radio.setCurrentWave(5);

        radio.prevWave();

        int expected = 4;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev0to9Test() {                        //Предыдушая волна 0-9
        Radio radio = new Radio();
        radio.setCurrentWave(0);

        radio.prevWave();

        int expected = 9;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevAboveMaxTest() {                    //Предыдущая волна выше макса
        Radio radio = new Radio();
        radio.setCurrentWave(10);


        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevBelowMinTest() {                    // предыдущая волна ниже минимума
        Radio radio = new Radio();
        radio.setCurrentWave(-1);


        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolumeTest() {                     // Тест на звук -
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.minusVolume();

        int expected = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolumeBelowMinTest() {             // Тест на звук - ниже мин
        Radio radio = new Radio();
        radio.setCurrentVolume(-5);

        radio.minusVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolumeAboveMaxTest() {             // тест на звук - выше макс
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        radio.minusVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusVolumeTest() {                      // тест на звук +
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.plusVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusVolumeBelowMinTest() {              // тест на звук + ниже мин
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.plusVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusVolumeAboveMaxTest() {              // тест на звук + выше макс
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        radio.plusVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
