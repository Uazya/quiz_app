package com.example.android.quiz_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String correctAnswer1 = "correct";
    String correctAnswer4 = "correct";

    public void getResultAnswer1(View v){
        TextView tv = (TextView) findViewById(R.id.result_q1);
        EditText et = (EditText) findViewById(R.id.answer_question_1);
        String answer1 = et.getText().toString();
        if(answer1.equals(correctAnswer1)){
            tv.setText("Correct");
        } else tv.setText("Incorrect");

        getResultAnswer2(v);
        getResultAnswer3(v);
        getResultAnswer4(v);
    }

    public void getResultAnswer2(View v){
        TextView tv = (TextView) findViewById(R.id.result_q2);
        RadioButton rb = (RadioButton) findViewById(R.id.radio_1);

        if(rb.isChecked()){
            tv.setText("Correct");
        } else tv.setText("Incorrect");
    }

    public void getResultAnswer3(View v){
        CheckBox box1 = (CheckBox) findViewById(R.id.answer_question_3_1);
        CheckBox box2 = (CheckBox) findViewById(R.id.answer_question_3_2);

        boolean res = box1.isChecked() && box2.isChecked();

        TextView tv = (TextView) findViewById(R.id.result_q3);

        if(res) {
            tv.setText("Correct");
        } else tv.setText("Incorrect");
    }

    public void getResultAnswer4(View v){
        TextView tv = (TextView) findViewById(R.id.result_q4);
        EditText et = (EditText) findViewById(R.id.answer_question_4);
        String answer1 = et.getText().toString();
        if(answer1.equals(correctAnswer4)){
            tv.setText("Correct");
        } else tv.setText("Incorrect");
    }
}
