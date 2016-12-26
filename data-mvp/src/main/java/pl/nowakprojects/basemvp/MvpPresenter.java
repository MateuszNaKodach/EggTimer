package pl.nowakprojects.basemvp;

/**
 * Created by Mateusz on 25.12.2016.
 */
public interface MvpPresenter<T extends MvpView> {

    void initViewUserInterface();

    void initDataModel(Object model);

    void attachView(T view);

    void detachView();
}
