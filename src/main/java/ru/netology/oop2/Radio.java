package ru.netology.oop2;

public class Radio {

    private int minWave = 0;
    private int maxWave = 9;
    private int currentWave;   // Текущая волна

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;  // Текущий звук

    public Radio(int size) {
        maxWave = size - 1;
        if (maxWave <= 1){
            maxWave = 1;
        }
    }

    public Radio() {
        maxWave = getMaxWave();
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public int getMaxWave() {
        return maxWave;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentWave(int newCurrentWave) {  //Ограничение волн
        if (newCurrentWave < minWave) {
            return;
        }
        if (newCurrentWave > maxWave) {
            return;
        }
        currentWave = newCurrentWave;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void nextWave() {                   // Следущая волна
        if (currentWave < maxWave) {
            currentWave += 1;
        } else {
            currentWave = minWave;
        }
    }

    public void prevWave() {                   //Предыдущая волна
        if (currentWave > minWave) {
            currentWave -= 1;
        } else {
            currentWave = maxWave;
        }
    }


    public void plusVolume() {                           // Звук +
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
            return;
        }
        if (currentVolume < maxVolume) {
            currentVolume += 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void minusVolume() {                         // Звук -
        int minusVolume = currentVolume;
        if (minusVolume > maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        if (minusVolume > minVolume) {
            currentVolume = minusVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }

}
