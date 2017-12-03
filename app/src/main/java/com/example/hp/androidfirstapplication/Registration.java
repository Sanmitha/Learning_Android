package com.example.hp.androidfirstapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class Registration extends AppCompatActivity {
    EditText emaild, address, Phone;
    Spinner State, city, country;
    Button Register;
    ImageView image;
    Button button;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(Registration.this, "Main2 Onscreat Method Called", Toast.LENGTH_SHORT).show();

        emaild = (EditText) findViewById(R.id.emailid);
        address = (EditText) findViewById(R.id.address);
        State = (Spinner) findViewById(R.id.state);
        country=(Spinner)findViewById((R.id.country));
        city=(Spinner)findViewById(R.id.city);
        Phone = (EditText) findViewById(R.id.phone);
        //addListenerOnButton();

  /*  public void addListenerOnButton() {

        image = (ImageView) findViewById(R.id.image);

        button = (Button) findViewById(R.id.btnChangeImage);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                image.setImageResource(R.drawable.android3d);
            }

        });*/
        final String[] states = new String[]{"Select State", "Karnataka", "Kerala"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, states);
        State.setAdapter(adapter);
        //country.setAdapter(adapter);

        State.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int sid = State.getSelectedItemPosition();
                Toast.makeText(Registration.this, "You have selected state:" + states[sid], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

       final String[] countries=new String[]{"Select Country","India"};
        ArrayAdapter<String>adapter1=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,countries);
        country.setAdapter(adapter1);
        country.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int cid = country.getSelectedItemPosition();
                Toast.makeText(Registration.this, "You have selected state:" + countries[cid], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        /*final String[] countries = new String[]{"Select Country", "India", "US"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, countries);

        //ArrayAdapter<String>adapter1=new ArrayAdapter<~>(this,R.layout.support_simple_spinner_dropdown_item,countries);
        country.setAdapter(adapter1);
        //country.setAdapter(adapter1);
        country.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int cid = country.getSelectedItemPosition();
                Toast.makeText(Main2Activity.this, "You have selected Country:" + countries[cid], Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });*/

        final String[]cities=new String[]{"Select City","Bngalore","Mangalore"};
                //ArrayAdapter<String>adapter2=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,cities);
       // ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities);
ArrayAdapter<String>adapter3=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,cities);
        //ArrayAdapter<String>adapter2=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,countries);
        city.setAdapter(adapter3);
        city.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?>adapterView,View view,int i,long l)
            {
                int cid1=city.getSelectedItemPosition();
                Toast.makeText(Registration.this,"You have selected City:"+cities[cid1],Toast.LENGTH_SHORT).show();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Register = (Button) findViewById(R.id.Register);


        Register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String number = "^[0-9-1+]{10,13}$";
                String phonenumber = Phone.getText().toString();

                String emailInput = emaild.getText().toString().trim();
                String emailPattern = "[_A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*@[A-za-z0-9]+(\\.[A-Za-z0-0-9]+)*(\\.[A-Za-z]{2,})$";
                if(((emailInput.matches(emailPattern))&& ((Phone.getText().toString().length() < 10 || Phone.getText().toString().length() > 13 || phonenumber.matches(number) == false)) )){
                    Toast.makeText(Registration.this, "Enter Valid email id", Toast.LENGTH_SHORT).show();

                        Toast.makeText(Registration.this, "Enter Valid phone number", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(Registration.this, Main3Activity.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(Registration.this, "Invalid email address", Toast.LENGTH_SHORT).show();
                    //emaild.setBackground(R.drawable.download);

                }


            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main2 Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }

    /*@Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(Main2Activity.this,"Main2 Onstart Method Called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(Main2Activity.this," Main2 OnResume Method Called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(Main2Activity.this,"Main2 OnRestart Method Called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(Main2Activity.this,"Main2 OnPause Method Called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(Main2Activity.this,"Main2 Onstop Method Called",Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(Main2Activity.this,"Main2 OnDestroy Method Called",Toast.LENGTH_SHORT).show();

    }*/
}
