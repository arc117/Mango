package com.manik.aakash.mango;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.view.View;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MangoApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickOk(View view)
    {
        Toast.makeText(getApplicationContext(),"Thanks for clicking",Toast.LENGTH_LONG).show();
        Log.i(TAG,"Thanks for clicking");
    }


}
