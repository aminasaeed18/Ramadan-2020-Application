package com.example.ramazan2020;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

public class Dua extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);
        this.setTitle("Dua");
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.pdf);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RamadanPdf.class);
                startActivity(intent);
            }
        });
        MyListData[] myListData = new MyListData[] {
                new MyListData("Dua's for Sehri and Iftiyari", R.drawable.duaaa),
                new MyListData("Dua after breaking the fast", R.drawable.afterbreaking),
                new MyListData("Dua's for first, second and third part of Ramazan", R.drawable.duafirstpart),
                new MyListData("Tasbeeh-e-Taraweeh", R.drawable.duatarawee),
                new MyListData("Salaatul Tasbeeh", R.drawable.atasbee),
                new MyListData("Dua for Shab-e-Qadir", R.drawable.shaddua),
                new MyListData("Daily Ramadan Dua", R.drawable.dailydua),
                new MyListData("Dua for our children", R.drawable.children),
                new MyListData("Dua to seek Allah’s help from hardships", R.drawable.help),
                new MyListData("Dua to Seek Patience", R.drawable.sabr),
                new MyListData("Dua to seek Allah’s guidance", R.drawable.guide),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}



