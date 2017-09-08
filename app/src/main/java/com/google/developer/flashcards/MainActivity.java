package com.google.developer.flashcards;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView cardRecyclerView = (RecyclerView) findViewById(R.id.card_recycler_view);
        cardRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager cardLayoutManager = new LinearLayoutManager(this);
        cardRecyclerView.setLayoutManager(cardLayoutManager);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(this);
    }

    /* FAB Click Events */
    @Override
    public void onClick(View v) {
        Intent addCard = new Intent(this, AddCardActivity.class);
        MainActivity.this.startActivity(addCard);
    }
}
