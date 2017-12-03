package com.example.hp.androidfirstapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomList extends AppCompatActivity {
ListView clist;
TextView name,type,versionnumber,feature;
    ArrayList<DataModel> dataModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
        clist=(ListView)findViewById(R.id.customlist);
dataModels=new ArrayList<>();
        dataModels.add(new DataModel("KitKat","Andrioid","4",""));
        dataModels.add(new DataModel("Donut","Android","3",""));
        dataModels.add(new DataModel("Marshmellow","ndroid","","3"));
        Custadapter cust=new Custadapter(CustomList.this,0);
        clist.setAdapter(cust);
        clist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                dataModels.get(i);
                Toast.makeText(CustomList.this, "Name:" + dataModels.get(i).getName() + "\n" + "Type:" + dataModels.get(i).getType(), Toast.LENGTH_SHORT).show();
                //Snacckbar.make(view,"Name:"+dataModels.get(i).getName()+"/"+"Type:"+dataModels.get(i).getType(),Snackbar.LENGTH_SHORT).show();
//snack bar is use to dispaly the msg. it will display and vanish after some second
            }
        });



    }

    class Custadapter extends ArrayAdapter{

        public Custadapter(Context context, int resource) {
            super(context, resource);
        }

        @Override
        public int getCount() {
            return dataModels.size();
        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
          //  return super.getView(position, convertView, parent);

            if(convertView==null){
                LayoutInflater inflater=LayoutInflater.from(CustomList.this);//layout is set to the custom layout
                convertView=inflater.inflate(R.layout.customlayout,null);// convertview is used to view the list
                 name=(TextView)convertView.findViewById(R.id.name);
                type=(TextView)convertView.findViewById(R.id.type);
                versionnumber=(TextView)convertView.findViewById(R.id.versionnumber);
                feature=(TextView)convertView.findViewById(R.id.feature);


            }
            name.setText(dataModels.get(position).getName());
            name.setText(dataModels.get(position).getType());
            name.setText(dataModels.get(position).getVersion_number());
            name.setText(dataModels.get(position).getFeature());

            return convertView;
        }
    }



}
