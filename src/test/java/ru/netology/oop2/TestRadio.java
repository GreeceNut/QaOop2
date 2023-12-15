package ru.netology.oop2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

 @Test
 public void shouldSetWave () {
     Radio radio = new Radio();

     radio.setCurrentWave(5);

     int expected =5;
     int actual = radio.getCurrentWave();

     Assertions.assertEquals(expected, actual);
 }

 @Test
 public void nextTest (){
         Radio radio = new Radio();

         radio.setNextWave(10);

         int expected = 0;
         int actual = radio.getCurrentWave();

         Assertions.assertEquals(expected,actual);
 }
    @Test
    public void prevTest (){
        Radio radio = new Radio();

        radio.setPrevWave(10);

        int expected = 9;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void minusVolumeTest (){
        Radio radio = new Radio();

        radio.setMinusVolume(50);

        int expected = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void plusVolumeTest (){
        Radio radio = new Radio();

        radio.setPlusVolume(50);

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
}
