package com.nsy209.yca.battleforlife.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nsy209.yca.battleforlife.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button buttonLogon;
    private Button buttonCreateAccount;
    private Button buttonQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogon = (Button) findViewById(R.id.buttonLogon);
        buttonCreateAccount = (Button) findViewById(R.id.buttonCreateAccount);
        buttonQuit = (Button ) findViewById(R.id.buttonQuit);

    }

    @Override
    public void onClick(View viewButton) {
        Intent intentMainMenu;
        Intent intentCreateAccount;

        switch(viewButton.getId()) {

            case R.id.buttonLogon:
                intentMainMenu = new Intent(this, BFLMainMenuActivity.class);
                startActivity(intentMainMenu);
                break;

            case R.id.buttonCreateAccount:
                intentCreateAccount = new Intent(this, BFLAccountCreationActivity.class);
                startActivity(intentCreateAccount);
                break;

            case R.id.buttonQuit:
                onStop();
                break;
        }
    }
}
