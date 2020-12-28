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

public class FragmentQ7 extends Fragment {

    Button btnPrev7;
    Button btnNext7;
    RatingBar ratingBar7;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_q7, container, false);
        findByViewIds(view);
        addListeners(view);

        return view;
    }

    private void addListeners(View view) {
        btnNext7AddListener();
    }

    private void findByViewIds(View view) {
        btnPrev7 = view.findViewById(R.id.btnPrev7);
        btnNext7 = view.findViewById(R.id.btnNext7);
        ratingBar7 = view.findViewById(R.id.ratingBar7);
    }

    private void btnNext7AddListener() {
        btnNext7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).setQ7Answer(ratingBar7.getRating());
                ((MainActivity) getActivity()).changeFragment(new FragmentQ8());
            }
        });
    }
}
