package com.example.myapplication1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
public class AsiaFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sixth, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {

            NavHostFragment.findNavController(AsiaFragment.this)
                    .navigate(R.id.action_asiaFragment_to_FirstFragment);
        }
    });

        view.findViewById(R.id.Japan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(AsiaFragment.this)
                        .navigate(R.id.action_asiaFragment_to_japanFragment);
            }
        });

        view.findViewById(R.id.China).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(AsiaFragment.this)
                        .navigate(R.id.action_asiaFragment_to_chinaFragment);
            }
        });

        view.findViewById(R.id.India).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(AsiaFragment.this)
                        .navigate(R.id.action_asiaFragment_to_indiaFragment);
            }
        });


    }
}