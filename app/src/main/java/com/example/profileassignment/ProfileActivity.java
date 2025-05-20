package com.example.profileassignment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {


    private ImageView back,profileimg,credview,creditview,lifestimeview,bankview,
            cashview,coinsview,winview, transview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        back = findViewById(R.id.close);
        profileimg = findViewById(R.id.profile_image);
        credview = findViewById(R.id.credview);
        creditview = findViewById(R.id.creditview);
        lifestimeview = findViewById(R.id.lifetimeview);
        bankview = findViewById(R.id.checkview);
        cashview = findViewById(R.id.cashview);
        coinsview = findViewById(R.id.coinsview);
        winview = findViewById(R.id.winview);
        transview = findViewById(R.id.transactionview);

        creditview.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
      /* Intent i = new Intent(this,Credit.class);
       startActivity(i);*/
    }
}