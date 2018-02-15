package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.quizapp.R;

public class MainActivity extends AppCompatActivity {
    int quiz_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void first_question(View v) {
        EditText answer = (EditText) findViewById(R.id.harrys_owl);
        Editable text = answer.getText();
        String newtxt=text.toString();
        if (newtxt=="Hedwig"){quiz_score=quiz_score+1;}
        else return;
    }
    public void second_question(View v) {
        CheckBox GeorgeCheckBox = (CheckBox) findViewById(R.id.George);
        CheckBox LunaCheckBox = (CheckBox) findViewById(R.id.Luna);
        CheckBox WilliamCheckBox = (CheckBox) findViewById(R.id.William);
        CheckBox PercyCheckBox = (CheckBox) findViewById(R.id.Percy);
        if(GeorgeCheckBox.isChecked()&&(!(LunaCheckBox.isChecked()))&&WilliamCheckBox.isChecked()&&PercyCheckBox.isChecked()) {
            quiz_score=quiz_score+1;
        }
        else return;
    }
    public void third_question(View v){
        boolean checked = ((RadioButton) v).isChecked();

        switch(v.getId()) {
            case R.id.edward:
                if (checked) {
                    quiz_score=quiz_score+1;
                }
            case R.id.neville:
                if (checked)
                    break;
        }
    }

    public void fourth_question(View v){
        boolean checked = ((RadioButton) v).isChecked();

        switch(v.getId()) {
            case R.id.doe_patronus:
                if (checked) {
                    quiz_score=quiz_score+1;
                }
            case R.id.stag_patronus:
                if (checked){
                    break;}
            case R.id.snake_patronus:
                if(checked){
                    break;
                }
        }
    }
    public void fifth_question(View v){
        boolean checked = ((RadioButton) v).isChecked();

        switch(v.getId()) {
            case R.id.crookshanks_cat:
                if (checked) {
                    quiz_score=quiz_score+1;
                }
            case R.id.crookshanks_owl:
                if (checked){
                    break;}
            case R.id.crookshanks_rat:
                if(checked){
                    break;
                }
        }
    }
    public void sixth_question(View v) {
        CheckBox snitchCheckBox = (CheckBox) findViewById(R.id.snitch);
        CheckBox quaffleCheckBox = (CheckBox) findViewById(R.id.quaffle);
        CheckBox bludgersCheckBox = (CheckBox) findViewById(R.id.bludgers);
        CheckBox thestralCheckBox = (CheckBox) findViewById(R.id.thestral);
        if(snitchCheckBox.isChecked()&&(!(thestralCheckBox.isChecked()))&&quaffleCheckBox.isChecked()&&bludgersCheckBox.isChecked()) {
            quiz_score=quiz_score+1;
        }
        else return;
    }
    public void seventh_question(View v){
        boolean checked = ((RadioButton) v).isChecked();

        switch(v.getId()) {
            case R.id.albus_false:
                if (checked) {
                    quiz_score=quiz_score+1;
                }
            case R.id.albus_true:
                if (checked){
                    break;}
        }
    }
    public void submit_btn(View v){
        Context context = getApplicationContext();
        String score=String.valueOf(quiz_score);
        CharSequence text = "You scored"+score+"/7";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}