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

public class FragmentQ8 extends Fragment {

    Button btnPrev8;
    Button btnNext8;
    RatingBar ratingBar8;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_q8, container, false);
        findByViewIds(view);
        addListeners(view);

        return view;
    }

    private void addListeners(View view) {
        btnNext8AddListener();
    }

    private void findByViewIds(View view) {
        btnPrev8 = view.findViewById(R.id.btnPrev8);
        btnNext8 = view.findViewById(R.id.btnNext8);
        ratingBar8 = view.findViewById(R.id.ratingBar8);
    }

    private void btnNext8AddListener() {
        btnNext8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).changeFragment(new FragmentQ9());
            }
        });
    }
}
