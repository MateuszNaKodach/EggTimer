package pl.nowakprojects.eggtimer;

import java.util.Timer;
import java.util.TimerTask;

import pl.nowakprojects.util.Const;

/**
 * Created by Mateusz on 26.12.2016.
 */

public class EggTimer {

    private final int maxTimeInSeconds;
    private int currentTimeInSeconds;
    boolean activeTimer;

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

    public int getCurrentTimeInMiliSeconds() {
        return currentTimeInSeconds * 1000;
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

    public boolean isActiveTimer() {
        return activeTimer;
    }

    public void setActiveTimer(boolean activeTimer) {
        this.activeTimer = activeTimer;
    }

    private boolean isTimerFinished(){
        return getCurrentTimeInSeconds()==0;
    }

   /* void startTimer(final OnTimerActionListener onTimerActionListener){
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                currentTimeInSeconds--;
                onTimerActionListener.onTimerTick();
                if(isTimerFinished()) {
                    onTimerActionListener.onTimerFinish();
                    stopTimer();
                }
            }
        },Const.STANDARD_TIMER_DELAY,Const.ONE_SECOND_IN_MILIS);
    }


    void stopTimer(){
        if(timer!=null)
            timer.cancel();
    }*/

}
