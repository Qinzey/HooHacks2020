package com.example.myapplication1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
public class EuropeFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(EuropeFragment.this)
                        .navigate(R.id.action_europeFragment_to_FirstFragment);
            }
        });

        view.findViewById(R.id.Greece).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(EuropeFragment.this)
                        .navigate(R.id.action_europeFragment_to_greeceFragment);
            }
        });

        view.findViewById(R.id.England).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(EuropeFragment.this)
                        .navigate(R.id.action_europeFragment_to_englandFragment);
            }
        });

        view.findViewById(R.id.France).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(EuropeFragment.this)
                        .navigate(R.id.action_europeFragment_to_franceFragment);
            }
        });
    }
}