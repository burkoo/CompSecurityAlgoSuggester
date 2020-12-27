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

public class FragmentMain extends Fragment {

    Button btnSubmit;
    RatingBar ratingBar1;
    RatingBar ratingBar2;
    RatingBar ratingBar3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        findByViewIds(view);
        addListeners(view);

        return view;
    }

    private void addListeners(View view) {
        btnSubmitAddListener();
    }

    private void findByViewIds(View view) {
        btnSubmit = view.findViewById(R.id.btnSubmit);
        ratingBar1 = view.findViewById(R.id.ratingBar1);
        ratingBar2 = view.findViewById(R.id.ratingBar2);
        ratingBar3 = view.findViewById(R.id.ratingBar3);
    }

    private void btnSubmitAddListener() {
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(((MainActivity) getActivity()).getApplicationContext(),"Submit Clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
