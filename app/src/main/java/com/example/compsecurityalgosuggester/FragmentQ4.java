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

public class FragmentQ4 extends Fragment {

    Button btnPrev4;
    Button btnNext4;
    RatingBar ratingBar4;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_q4, container, false);
        findByViewIds(view);
        addListeners(view);

        return view;
    }

    private void addListeners(View view) {
        btnNext4AddListener();
        btnPrev4AddListener();
    }

    private void findByViewIds(View view) {
        btnPrev4 = view.findViewById(R.id.btnPrev4);
        btnNext4 = view.findViewById(R.id.btnNext4);
        ratingBar4 = view.findViewById(R.id.ratingBar4);
    }

    private void btnNext4AddListener() {
        btnNext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).setQ4Answer(ratingBar4.getRating());
                ((MainActivity) getActivity()).changeFragment(new FragmentQ5());
            }
        });
    }
    private void btnPrev4AddListener() {
        btnPrev4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).popBackFragment();
            }
        });
    }
}
