package com.raisjayadevelop.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class CustomListActivity extends AppCompatActivity {

    private ListView lvCustom;
    private String[] players = new String[]{
            "Edinson Cavani", "Cristiano Ronaldo", "Jadon Sancho",
            "Paul Pogba", "Bruno Fernandes", "Donny van de Beek",
            "Luke Shaw", "Raphael varane", "Victor Lindelof","Aaron Wan-Bissaka",
            "David de Gea"
    };

    private String[] pos = new String[]{
            "Forward", "Forward", "Forward",
            "Midfilder", "Midfilder", "Midfilder",
            "Defender", "Defender", "Defender","Defender",
            "Goal Keeper"
    };

    private int[] num = {21,7,25,34,18,6,29,2,19,23,1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        lvCustom = findViewById(R.id.list_custom);
        emyuAdapter adapter = new emyuAdapter(this, players, pos, num);
        lvCustom.setAdapter(adapter);
    }
}