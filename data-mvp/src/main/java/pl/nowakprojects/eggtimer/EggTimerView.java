package pl.nowakprojects.eggtimer;

import pl.nowakprojects.basemvp.MvpView;

/**
 * Created by Mateusz on 26.12.2016.
 */

interface EggTimerView extends MvpView {
    void setupTimerSlider();
    void setTimerStateTextView(int minutes, int seconds);
    void setTimerControlButton();
    void playTimerAlarm();
    void startTimer();
    void stopTimer();
}
