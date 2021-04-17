package com.praktikummp.listtemandekat.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.praktikummp.listtemandekat.R;
import com.praktikummp.listtemandekat.adapter.RecyclerViewFriendAdapter;
import com.praktikummp.listtemandekat.model.Friend;
import com.praktikummp.listtemandekat.presenter.MainPresenterImpl;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView, Button.OnClickListener {

    private MainContract.Presenter mainPresenter;

    private RecyclerView recyclerViewFriend;
    private EditText txtInputName, txtInputPhone;
    private Button btnSaveFriend;
    private RecyclerViewFriendAdapter recyclerViewFriendAdapter;
    private Object MainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainPresenter = new MainPresenterImpl(this);
        initViews();
    }

    private void initViews(){
        txtInputName = findViewById(R.id.txtInputName);
        txtInputPhone = findViewById(R.id.txtInputPhone);
        btnSaveFriend = findViewById(R.id.btnSaveFriend);
        btnSaveFriend.setOnClickListener(this);
        recyclerViewFriend = findViewById(R.id.recyclerViewFriend);
    }

    @Override
    public void showFriend(List<Friend> friendList) {
        recyclerViewFriendAdapter = new RecyclerViewFriendAdapter(this, friendList);
        recyclerViewFriend.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewFriend.setAdapter(recyclerViewFriendAdapter);
        recyclerViewFriendAdapter.notifyDataSetChanged();
    }

    @Override
    public void clearInput() {
        txtInputName.setText("");
        txtInputPhone.setText("");
        txtInputName.requestFocus();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSaveFriend:
                mainPresenter.saveFriend(new Friend(txtInputName.getText().toString(), txtInputPhone.getText().toString()));
                break;
        }
    }
}