package com.example.repotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("tag1","msg1") ; //intial version 1.0.0.0

        Log.i("tag2","msg2") ; //version 1.0.1.0
        Log.i("tag3","msg3") ; //version 1.0.1.0

        Log.i("tag4","msg4") ; //version 1.0.2.0
        Log.i("tag4","msg4") ; //version 1.0.2.0
        Log.i("tag4","msg4") ; //version 1.0.2.0
        Log.i("tag4","msg4") ; //version 1.0.2.0


        //commited once more
    }
}
