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

public class FragmentQ1 extends Fragment {

    Button btnNext1;
    RatingBar ratingBar1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_q1, container, false);
        findByViewIds(view);
        addListeners(view);

        return view;
    }

    private void addListeners(View view) {
        btnSubmitAddListener();
    }

    private void findByViewIds(View view) {
        btnNext1 = view.findViewById(R.id.btnNext1);
        ratingBar1 = view.findViewById(R.id.ratingBar1);
    }

    private void btnSubmitAddListener() {
        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).changeFragment(new FragmentQ2());
            }
        });
    }
}
