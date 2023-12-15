package ru.netology.oop2;
public class Radio {

    private int currentWave;

    public int getCurrentWave() {
        return currentWave;
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave < 0) {
            return;
        }
        if (newCurrentWave > 9) {
            return;
        }
        currentWave = newCurrentWave;
    }

    public void setNextWave(int newNextWave) {
        if (newNextWave < 9) {
            currentWave = newNextWave + 1;
            return;
        }
        if (newNextWave == 9) {
            currentWave = 0;
            return;
        }
        currentWave = newNextWave;
    }

    public void setPrevWave(int newPrevWave) {
        if (newPrevWave > 0) {
            currentWave = newPrevWave - 1;
            return;
        }
        if (newPrevWave == 0) {
            currentWave = 9;
            return;
        }
        currentWave = newPrevWave;
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setPlusVolume(int newPlusVolume) {
        if (newPlusVolume < 0) {
            currentVolume = 0;
            return;
        }
        if (newPlusVolume < 100) {
            currentVolume = newPlusVolume + 1;
            return;
        }
        if (newPlusVolume > 100) {
            currentVolume = 100;
            return;
        }

        currentVolume = newPlusVolume;
    }

    public void setMinusVolume(int newMinusVolume) {
        if (newMinusVolume > 100) {
            currentVolume = 100;
            return;
        }
        if (newMinusVolume > 0) {
            currentVolume = newMinusVolume - 1;
            return;
        }
        if (newMinusVolume < 0) {
            currentVolume = 0;
            return;
        }

        currentVolume = newMinusVolume;
    }
}