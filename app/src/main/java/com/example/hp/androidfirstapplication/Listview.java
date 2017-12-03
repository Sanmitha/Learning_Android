package com.example.hp.androidfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Listview extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        String[] mobilearray={"SmsSung","Redmi","Lenovo"};
        ArrayAdapter adapter=new ArrayAdapter<String>(this,R.layout.activity_own_list,mobilearray);
        ListView list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

    }
}
