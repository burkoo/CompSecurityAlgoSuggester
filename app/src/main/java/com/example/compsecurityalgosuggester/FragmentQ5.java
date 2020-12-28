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

public class FragmentQ5 extends Fragment {

    Button btnPrev5;
    Button btnNext5;
    RatingBar ratingBar5;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_q5, container, false);
        findByViewIds(view);
        addListeners(view);

        return view;
    }

    private void addListeners(View view) {
        btnNext5AddListener();
        btnPrev5AddListener();
    }

    private void findByViewIds(View view) {
        btnPrev5 = view.findViewById(R.id.btnPrev5);
        btnNext5 = view.findViewById(R.id.btnNext5);
        ratingBar5 = view.findViewById(R.id.ratingBar5);
    }

    private void btnNext5AddListener() {
        btnNext5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).changeFragment(new FragmentQ6());
            }
        });
    }

    private void btnPrev5AddListener() {
        btnPrev5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).popBackFragment();
            }
        });
    }
}
