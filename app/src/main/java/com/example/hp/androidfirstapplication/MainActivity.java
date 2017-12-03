package com.example.hp.androidfirstapplication;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Main1 OnCreate Method Called",Toast.LENGTH_SHORT).show();

        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        submit=(Button)findViewById(R.id.subbutton);

        submit.setOnClickListener(new View.OnClickListener()


        {

            @Override
            public void onClick(View view) {
                String name = username.getText().toString();
                String pass = password.getText().toString();
                if (name.equals("Codeshala") && pass.equals("android")) {
                    Intent intent = new Intent(MainActivity.this, CustomList.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Invalid Credential", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

    //To Check the Life Cycle for android
    //@Override
   /* protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this,"Main1 Onstart Method Called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this,"Main1 OnResume Method Called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this,"Main1 OnRestart Method Called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this,"Main1 OnPause Method Called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this,"Main1 Onstop Method Called",Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this,"Main1 OnDestroy Method Called",Toast.LENGTH_SHORT).show();

    }*/

}
