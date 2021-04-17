package com.praktikummp.listtemandekat.interactor;

import com.praktikummp.listtemandekat.model.Friend;

import java.util.List;

public interface MainInteractor {
    void saveFriend(Friend friend);
    List<Friend> getAllFriends();
}
