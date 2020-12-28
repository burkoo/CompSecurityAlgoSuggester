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

    Button btnYes1;
    Button btnNo1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_q1, container, false);
        findByViewIds(view);
        addListeners(view);

        return view;
    }

    private void addListeners(View view) {
        btnYes2AddListener();
        btnNo2AddListener();
    }

    private void findByViewIds(View view) {
        btnNo1 = view.findViewById(R.id.btnNo1);
        btnYes1 = view.findViewById(R.id.btnYes1);
    }

    private void btnYes2AddListener() {
        btnYes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).setQ1Answer(true);
                ((MainActivity) getActivity()).changeFragment(new FragmentQ2());
            }
        });
    }
    private void btnNo2AddListener() {
        btnNo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).setQ1Answer(false);
                ((MainActivity) getActivity()).changeFragment(new FragmentQ2());
            }
        });
    }
}
