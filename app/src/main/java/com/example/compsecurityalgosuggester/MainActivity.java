package com.example.compsecurityalgosuggester;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    boolean q1Answer;
    boolean q2Answer;
    float q3Answer;
    float q4Answer;
    float q5Answer;
    float q6Answer;
    float q7Answer;
    float q8Answer;
    float q9Answer;
    float q10Answer;

    float surveyScore = 0;
    String currentResult;

    private static final String TAG = "mytag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportFragmentManager().getBackStackEntryCount() == 0){
            changeFragment(new FragmentMain());
        }
    }

    public void changeFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentPlace, fragment)
                .addToBackStack(null)
                .commit();
        getSupportFragmentManager().executePendingTransactions();
    }

    public void popBackFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.popBackStack();
    }

    public void endSurvey(){
        boolean hasPrevDB = false;

        if(q1Answer){
            surveyScore += 30;
        }

        if(q2Answer){
            hasPrevDB = true;
        }

        surveyScore += (q3Answer*2) + (q4Answer*2.5) + (q5Answer*1) + (q6Answer*1) + (q7Answer*1.5) + (q8Answer*0.5) + (q9Answer*1) + (q10Answer*0.5);

        if(hasPrevDB){
            if(surveyScore <= 30){
                currentResult = "Signature Based SVM";
            } else if ( surveyScore <= 70){
                currentResult = "Hybrid DT";
            } else if( surveyScore <= 130){
                currentResult = "Hybrid KNN";
            }
        } else {
            if(surveyScore <= 30){
                currentResult = "Anomaly Based SVM";
            } else if ( surveyScore <= 70){
                currentResult = "Anomaly Based DT";
            } else if( surveyScore <= 130){
                currentResult = "Anomaly Based KNN";
            }
        }

        Log.i(TAG, Float. toString(surveyScore));
        Log.i(TAG, currentResult);

        changeFragment(new FragmentResult());

    }

    public boolean getQ1Answer() {
        return q1Answer;
    }

    public void setQ1Answer(boolean q1Answer) {
        this.q1Answer = q1Answer;
    }

    public boolean getQ2Answer() {
        return q2Answer;
    }

    public void setQ2Answer(boolean q2Answer) {
        this.q2Answer = q2Answer;
    }

    public float getQ3Answer() {
        return q3Answer;
    }

    public void setQ3Answer(float q3Answer) {
        this.q3Answer = q3Answer;
    }

    public float getQ4Answer() {
        return q4Answer;
    }

    public void setQ4Answer(float q4Answer) {
        this.q4Answer = q4Answer;
    }

    public float getQ5Answer() {
        return q5Answer;
    }

    public void setQ5Answer(float q5Answer) {
        this.q5Answer = q5Answer;
    }

    public float getQ6Answer() {
        return q6Answer;
    }

    public void setQ6Answer(float q6Answer) {
        this.q6Answer = q6Answer;
    }

    public float getQ7Answer() {
        return q7Answer;
    }

    public void setQ7Answer(float q7Answer) {
        this.q7Answer = q7Answer;
    }

    public float getQ8Answer() {
        return q8Answer;
    }

    public void setQ8Answer(float q8Answer) {
        this.q8Answer = q8Answer;
    }

    public float getQ9Answer() {
        return q9Answer;
    }

    public void setQ9Answer(float q9Answer) {
        this.q9Answer = q9Answer;
    }

    public float getQ10Answer() {
        return q10Answer;
    }

    public void setQ10Answer(float q10Answer) {
        this.q10Answer = q10Answer;
    }

    public String getCurrentResult() {
        return currentResult;
    }

    public void setCurrentResult(String currentResult) {
        this.currentResult = currentResult;
    }

    public float getSurveyScore() {
        return surveyScore;
    }

    public void setSurveyScore(float surveyScore) {
        this.surveyScore = surveyScore;
    }
}