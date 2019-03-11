package com.example.teodora.shoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView c1 = (CardView) findViewById(R.id.cardviewTshirts);
        CardView c2 = (CardView) findViewById(R.id.cardviewDress);
        CardView c3 = (CardView) findViewById(R.id.cardViewJeans);
        CardView c4 = (CardView) findViewById(R.id.cardViewJacket);
        CardView c5 = (CardView) findViewById(R.id.cardViewBags);
        CardView c6 = (CardView) findViewById(R.id.cardViewMarket);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIn = new Intent(getApplicationContext(), TshirtsActivity.class);
                startActivity(startIn);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIn = new Intent(getApplicationContext(), DressesActivity.class);
                startActivity(startIn);
            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIn = new Intent(getApplicationContext(), JeansActivity.class);
                startActivity(startIn);
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIn = new Intent(getApplicationContext(), JacketsActivity.class);
                startActivity(startIn);
            }
        });

        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIn = new Intent(getApplicationContext(), BagsActivity.class);
                startActivity(startIn);
            }
        });

        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIn = new Intent(getApplicationContext(), TshirtsActivity.class);
                startActivity(startIn);
            }
        });


    }
}
