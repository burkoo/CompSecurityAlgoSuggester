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

public class FragmentQ9 extends Fragment {

    Button btnPrev9;
    Button btnNext9;
    RatingBar ratingBar9;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_q9, container, false);
        findByViewIds(view);
        addListeners(view);

        return view;
    }

    private void addListeners(View view) {
        btnNext9AddListener();
    }

    private void findByViewIds(View view) {
        btnPrev9 = view.findViewById(R.id.btnPrev9);
        btnNext9 = view.findViewById(R.id.btnNext9);
        ratingBar9 = view.findViewById(R.id.ratingBar9);
    }

    private void btnNext9AddListener() {
        btnNext9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).changeFragment(new FragmentQ10());
            }
        });
    }
}
