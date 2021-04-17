package com.praktikummp.listtemandekat.view;

import com.praktikummp.listtemandekat.model.Friend;

import java.util.List;

public interface MainView {
    void showFriend(List<Friend> friendList);
    void clearInput();
}
