package pl.nowakprojects.eggtimer;

import java.util.Timer;

import pl.nowakprojects.util.Const;

/**
 * Created by Mateusz on 26.12.2016.
 */

public class EggTimer {

    private final int maxTimeInSeconds;
    private int currentTimeInSeconds;

    {
        maxTimeInSeconds = Const.MAX_EGGTIMER_SECONDS;
        currentTimeInSeconds = Const.INITALIZE_EGGTIMER_SECONDS;
    }

    public int getMaxTimeInSeconds() {
        return maxTimeInSeconds;
    }

    public int getCurrentTimeInSeconds() {
        return currentTimeInSeconds;
    }

    public int getCurrentMinutes(){
        return currentTimeInSeconds / 60;
    }

    public int getCurrentSeconds(){
        return currentTimeInSeconds - getCurrentMinutes() * 60;
    }

    public void setCurrentTimeInSeconds(int currentTimeInSeconds) {
        this.currentTimeInSeconds = currentTimeInSeconds;
    }
}
