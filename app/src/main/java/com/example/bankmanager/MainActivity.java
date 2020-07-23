package com.example.bankmanager;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_user_menu:
                    return true;
                case R.id.navigation_budget:
                    displayBudget();
                    return true;
                case R.id.navigation_categorie:
                    displayCategorie();
                    return true;
                case R.id.navigation_account:
                    displayAccount();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void displayBudget()
    {
        mTextMessage.setText(R.string.title_budget);
    }

    private void displayCategorie()
    {
        mTextMessage.setText(R.string.title_categorie);
    }

    private void displayAccount()
    {
        mTextMessage.setText(R.string.title_account);
    }


}
