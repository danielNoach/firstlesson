package com.danielnoach.firstlesson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    char activ;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.textViewResult);
    }

    public void buttonNumbersClick(View view) {

        if (view instanceof Button){

            Button button = (Button) view;
            String str = button.getText().toString();
            result.append(str);

        }


    }

    public void ButtonActClick(View view) {

        if (view instanceof Button){
            String str1 = result.getText().toString();
            num1 = Integer.parseInt(str1);
            Button button = (Button) view;
            activ = button.getText().toString().charAt(0);
            result.setText("");
        }
    }

    public void calculatefunc(View view) {
        if (view instanceof Button) {
            int res = 0;
            String str2 = result.getText().toString();
            num2 = Integer.parseInt(str2);

            switch (activ){
                case '+':
                    res = num1 + num2;
                    break;

                case '-':
                    res = num1 - num2;
                    break;

                case '/':
                    if (num2 != 0){
                        res = num1 / num2;
                    }

                    else{
                        result.setText("Error");
                        return;
                    }
                    break;


                case 'x':
                    res = num1 * num2;
                    break;
            }

            result.setText(String.valueOf(res));
        }
    }

    public void clearcalc(View view) {
        result.setText("");
    }
}