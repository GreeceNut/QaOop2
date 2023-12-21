package ru.netology.oop2;

public class Radio {

    private int currentWave;   // Текущая волна
    private int currentVolume;  // Текущий звук

    public int getCurrentWave() {
        return currentWave;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentWave(int newCurrentWave) {  //Ограничение волн
        if (newCurrentWave < 0) {
            return;
        }
        if (newCurrentWave > 9) {
            return;
        }
        currentWave = newCurrentWave;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void nextWave() {                   // Следущая волна
        if (currentWave < 9) {
            currentWave += 1;
        } else {
            currentWave = 0;
        }
    }

    public void prevWave() {                   //Предыдущая волна
        if (currentWave > 0) {
            currentWave -= 1;
        } else {
            currentWave = 9;
        }
    }


    public void plusVolume() {                           // Звук +
        if (currentVolume < 0) {
            currentVolume = 0;
            return;
        }
        if (currentVolume < 100) {
            currentVolume += 1;
        } else {
            currentVolume = 100;
        }
    }

    public void minusVolume() {                         // Звук -
        int minusVolume = currentVolume;
        if (minusVolume > 100) {
            currentVolume = 100;
            return;
        }
        if (minusVolume > 0) {
            currentVolume = minusVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

}
