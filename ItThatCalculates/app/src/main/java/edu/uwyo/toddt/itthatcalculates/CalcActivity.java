package edu.uwyo.toddt.itthatcalculates;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class CalcActivity extends AppCompatActivity implements CalcFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, new CalcFragment())
                .commit();
    }

    @Override
    public void onFragmentInteraction(String name){
        Log.d("CalcActivity", "Logged Name: " + name);
    }
}
