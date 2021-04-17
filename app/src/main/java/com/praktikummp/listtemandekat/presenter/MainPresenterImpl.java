package com.praktikummp.listtemandekat.presenter;

import com.praktikummp.listtemandekat.interactor.MainInteractor;
import com.praktikummp.listtemandekat.interactor.MainInteractorImp;
import com.praktikummp.listtemandekat.model.Friend;
import com.praktikummp.listtemandekat.view.MainActivity;
import com.praktikummp.listtemandekat.view.MainView;

import java.util.List;

public class MainPresenterImpl implements MainPresenter {

    private MainInteractor mainView;
    private MainPresenter mainInteractor;
    private MainView view;

    public MainPresenterImpl(MainActivity mainView) {
        this.mainView = (MainInteractor) mainView;
        this.mainInteractor = (MainPresenter) new MainInteractorImp();
    }

    @Override
    public void saveFriend(Friend friend) {
        mainInteractor.saveFriend(friend);
        view.showFriend(mainInteractor.getAllFriends());
        view.clearInput();
    }

    @Override
    public List<Friend> getAllFriends() {
        return null;
    }
}
