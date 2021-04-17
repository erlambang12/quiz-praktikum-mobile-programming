package com.praktikummp.listtemandekat.presenter;

import com.praktikummp.listtemandekat.model.Friend;

import java.util.List;

public interface MainPresenter {
    void saveFriend(Friend friend);

    List<Friend> getAllFriends();
}
