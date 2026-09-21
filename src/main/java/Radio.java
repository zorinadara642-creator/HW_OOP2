public class Radio {

    public int currentStation;
    public int currentVolume;
    public int stationsCount;

    public Radio() {
        this(10);
    }

    public Radio(int stationsCount) {
        this.stationsCount = stationsCount;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > stationsCount - 1) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void next() {
        if (currentStation == stationsCount - 1) {
            currentStation = 0;
            return;
        }
        currentStation = currentStation + 1;
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = stationsCount - 1;
            return;
        }
        currentStation = currentStation - 1;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
