package com.example.aula7.tareas_asincronas;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar) findViewById(R.id.id_pb_loaddata);
        textView = (TextView) findViewById(R.id.id_tv_data);
    }

    public Boolean isOnLine(){
        //obtener el servicio de la conectividad en android
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        //obtener la informancion del estado de la red
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
    }

    public  void  loadData(){

    }

}