package com.example.compsecurityalgosuggester;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentResult extends Fragment {

    TextView textSurveyScore;
    TextView textResult;
    TextView textPrevDB;

    Button btnMain;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result, container, false);
        findByViewIds(view);
        addListeners();

        if(((MainActivity)getActivity()).getQ2Answer()){
            textPrevDB.setText("Previos DB : YES");
        } else {
            textPrevDB.setText("Previos DB : NO");
        }

        textSurveyScore.setText("Your survey score : " + Float.toString(((MainActivity)getActivity()).getSurveyScore()));
        textResult.setText(((MainActivity)getActivity()).getCurrentResult());

        return view;
    }

    private void addListeners() {
        btnMainAddListener();
    }

    private void btnMainAddListener() {
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setSurveyScore(0);
                ((MainActivity)getActivity()).changeFragment(new FragmentMain());
            }
        });
    }

    private void findByViewIds(View view) {
        btnMain = view.findViewById(R.id.btnMain);
        textPrevDB = view.findViewById(R.id.textPrevDB);
        textSurveyScore = view.findViewById(R.id.textSurveyScore);
        textResult = view.findViewById(R.id.textResult);
    }

}