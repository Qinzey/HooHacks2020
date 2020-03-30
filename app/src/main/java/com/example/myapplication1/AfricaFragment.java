package com.example.myapplication1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
public class AfricaFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fifth, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(AfricaFragment.this)
                        .navigate(R.id.action_africaFragment_to_FirstFragment);
            }
        });

            view.findViewById(R.id.SouthAfrica).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    NavHostFragment.findNavController(AfricaFragment.this)
                            .navigate(R.id.action_africaFragment_to_southafricaFragment);
                }
            });

            view.findViewById(R.id.Egypt).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    NavHostFragment.findNavController(AfricaFragment.this)
                            .navigate(R.id.action_africaFragment_to_egyptFragment);
                }
            });

            view.findViewById(R.id.Nigeria).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    NavHostFragment.findNavController(AfricaFragment.this)
                            .navigate(R.id.action_africaFragment_to_nigeriaFragment);
                }
            });

    }

}