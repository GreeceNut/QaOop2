package ru.netology.oop2;

public class Radio {

    private int currentWave;   // Текущая волна

    public int getCurrentWave() {
        return currentWave;
    }

    public void setCurrentWave(int newCurrentWave) {  //Ограничение волн
        if (newCurrentWave < 0) {
            return;
        }
        if (newCurrentWave > 9) {
            return;
        }
 //       if (newCurrentWave == 1){
 //           currentWave = newCurrentWave;
 //           return;
 //       }
 //       if (newCurrentWave == 9){
 //          currentWave = newCurrentWave;
 //           return;
 //       }
        currentWave = newCurrentWave;
    }

    public void nextWave() {                   // Следущая волна
//        int nextWave = currentWave;
        if (currentWave < 9) {
            currentWave += 1;
        }
        else {
            currentWave = 0;
        }
        //     setCurrentWave(currentWave);
        //        this.currentWave = nextWave;
    }

    public void prevWave() {                   //Предыдущая волна
//        int prevWave = currentWave;
        if (currentWave > 0) {
            currentWave -= 1;
        }
         else {
             currentWave = 9;
        }

//        setCurrentWave(prevWave);
    }
//   public void setNextWave(int newNextWave) {
//     if (newNextWave < 9) {
//         currentWave = newNextWave + 1;
//         return;
//     }
//     if (newNextWave == 9) {
//         currentWave = 0;
//     }
//     currentWave = newNextWave;
// }

    //  public void setPrevWave(int newPrevWave) {
    //      if (newPrevWave > 0) {
    //          currentWave = newPrevWave - 1;
    //          return;
    //      }
    //      if (newPrevWave == 0) {
    //          currentWave = 9;
    //          return;
    //      }
    //      currentWave = newPrevWave;
    //  }

    private int currentVolume;                   // Текущий звук

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void plusVolume() {                           // Звук +
//        int plusVolume = currentVolume;
        if (currentVolume < 0) {
            currentVolume = 0;
            return;
        }
        if (currentVolume < 100) {
            currentVolume += 1;
        }
        else{
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
        }
        else {
            currentVolume = 0;
        }
    }

//   public void PlusVolume(int newPlusVolume) {
//       if (newPlusVolume < 0) {
//           currentVolume = 0;
//           return;
//       }
//       if (newPlusVolume < 100) {
//           currentVolume = newPlusVolume + 1;
//           return;
//       }
//       if (newPlusVolume > 100) {
//           currentVolume = 100;
//           return;
//       }
//
//       currentVolume = newPlusVolume;
//   }
//
//   public void setMinusVolume(int newMinusVolume) {
//       if (newMinusVolume > 100) {
//           currentVolume = 100;
//           return;
//       }
//       if (newMinusVolume > 0) {
//           currentVolume = newMinusVolume - 1;
//           return;
//       }
//       if (newMinusVolume < 0) {
//           currentVolume = 0;
//           return;
//       }
//
//       currentVolume = newMinusVolume;
//   }
}
