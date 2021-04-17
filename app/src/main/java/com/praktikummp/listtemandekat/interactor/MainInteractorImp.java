package com.praktikummp.listtemandekat.interactor;

import com.praktikummp.listtemandekat.interactor.MainInteractor;
import com.praktikummp.listtemandekat.model.Friend;

import java.util.ArrayList;
import java.util.List;

public class MainInteractorImp implements MainInteractor {

    private List<Friend> friendList = new ArrayList<>();

    @Override
    public void saveFriend(Friend friend) {
        friendList.add(friend);
    }

    @Override
    public List<Friend> getAllFriends() {
        return friendList;
    }

}
