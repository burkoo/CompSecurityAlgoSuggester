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

public class FragmentQ3 extends Fragment {

    Button btnPrev3;
    Button btnNext3;
    RatingBar ratingBar3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_q3, container, false);
        findByViewIds(view);
        addListeners(view);

        return view;
    }

    private void addListeners(View view) {
        btnSubmitAddListener();
    }

    private void findByViewIds(View view) {
        btnPrev3 = view.findViewById(R.id.btnPrev3);
        btnNext3 = view.findViewById(R.id.btnNext3);
        ratingBar3 = view.findViewById(R.id.ratingBar3);
    }

    private void btnSubmitAddListener() {
        btnNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).changeFragment(new FragmentQ4());
            }
        });
    }
}