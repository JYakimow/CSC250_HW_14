package com.example.csc250_hw_14;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
    public void onButtonClicked(View v)
    {
        if(v.getId() == R.id.button_1)
        {
            System.out.println("Button 1 pressed");
            TextView FName = this.findViewById(R.id.FName);
            FName.setText(R.string.First_Name);
        }
        else if(v.getId() == R.id.button_2)
        {
            System.out.println("Button 2 pressed");
            TextView LName = this.findViewById(R.id.LName);
            LName.setText(R.string.Last_Name);
        }
    }
    */
}