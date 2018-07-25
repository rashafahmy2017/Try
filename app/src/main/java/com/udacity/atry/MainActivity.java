package com.udacity.atry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<MyData> myDatas= new ArrayList<>();
        MyData myData;
        for (int i = 0; i <5 ; i++) {
              myData= new MyData("title"+i,"pster"+i,"date "+i,"",""+i," "+(i+2));
            myDatas.add(myData);
        }

        GridAdapter gridAdapter= new GridAdapter(MainActivity.this);
        gridAdapter.adapter(myDatas);
        ((ListView)findViewById(R.id.online_list)).setAdapter(gridAdapter);
        ((ListView)findViewById(R.id.offline_list )).setAdapter(gridAdapter);

    }
}
