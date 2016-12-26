package pl.nowakprojects.eggtimer;

import pl.nowakprojects.basemvp.MvpPresenter;

/**
 * Created by Mateusz on 26.12.2016.
 */

class EggTimerPresenter implements MvpPresenter<EggTimerView> {

    private EggTimerView view;
    private EggTimer eggTimer;

    EggTimerPresenter(EggTimerView view){
        attachView(view);
        initDataModel(new EggTimer());
    }

    @Override
    public void initViewUserInterface() {
        view.setupTimerSlider();
        view.setTimerControlButton();
        updateTimerStateTextView();
    }

    @Override
    public void initDataModel(Object model) {
        this.eggTimer = (EggTimer) model;
    }

    int getTimerMaxSeconds(){
        return eggTimer.getMaxTimeInSeconds();
    }

    int getTimerCurrentTimeInSeconds(){
        return eggTimer.getCurrentTimeInSeconds();
    }

    public int getCurrentMinutes(){
        return eggTimer.getCurrentMinutes();
    }

    public int getCurrentSeconds(){
        return eggTimer.getCurrentSeconds();
    }

    void setTimerCurrentTime(int currentTime){
        eggTimer.setCurrentTimeInSeconds(currentTime);
    }

    void updateTimerStateTextView() {
        view.setTimerStateTextView(eggTimer.getCurrentMinutes(),eggTimer.getCurrentSeconds());
    }


    @Override
    public void attachView(EggTimerView view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view=null;
    }

}
