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

public class FragmentQ6 extends Fragment {

    Button btnPrev6;
    Button btnNext6;
    RatingBar ratingBar6;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_q6, container, false);
        findByViewIds(view);
        addListeners(view);

        return view;
    }

    private void addListeners(View view) {
        btnNext6AddListener();
    }

    private void findByViewIds(View view) {
        btnPrev6 = view.findViewById(R.id.btnPrev6);
        btnNext6 = view.findViewById(R.id.btnNext6);
        ratingBar6 = view.findViewById(R.id.ratingBar6);
    }

    private void btnNext6AddListener() {
        btnNext6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).setQ6Answer(ratingBar6.getRating());
                ((MainActivity) getActivity()).changeFragment(new FragmentQ7());
            }
        });
    }
}
