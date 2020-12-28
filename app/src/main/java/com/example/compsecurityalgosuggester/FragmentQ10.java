package com.example.compsecurityalgosuggester;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentQ10 extends Fragment {

    Button btnPrev10;
    Button btnEndSurvey;
    RatingBar ratingBar10;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_q10, container, false);
        findByViewIds(view);
        addListeners(view);

        return view;
    }

    private void addListeners(View view) {
        btnSubmitAddListener();
    }

    private void findByViewIds(View view) {
        btnPrev10 = view.findViewById(R.id.btnPrev10);
        btnEndSurvey = view.findViewById(R.id.btnEndSurvey);
        ratingBar10 = view.findViewById(R.id.ratingBar10);
    }

    private void btnSubmitAddListener() {
        btnEndSurvey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //((MainActivity) getActivity()).endSurvey();
            }
        });
    }
}
