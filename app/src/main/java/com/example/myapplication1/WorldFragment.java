package com.example.myapplication1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
public class WorldFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.NorthAmerica).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(WorldFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
        view.findViewById(R.id.SouthAmerica).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(WorldFragment.this)
                        .navigate(R.id.action_FirstFragment_to_ThirdFragment);
            }
        });
        view.findViewById(R.id.Europe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(WorldFragment.this)
                        .navigate(R.id.action_FirstFragment_to_europeFragment);
            }
        });
        view.findViewById(R.id.Africa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(WorldFragment.this)
                        .navigate(R.id.action_FirstFragment_to_africaFragment);
            }
        });
        view.findViewById(R.id.Asia).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(WorldFragment.this)
                        .navigate(R.id.action_FirstFragment_to_asiaFragment);
            }
        });
        view.findViewById(R.id.Australia).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(WorldFragment.this)
                        .navigate(R.id.action_FirstFragment_to_australiaFragment);
            }
        });
        view.findViewById(R.id.Antarctica).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(WorldFragment.this)
                        .navigate(R.id.action_FirstFragment_to_antarcticaFragment);
            }
        });
        FloatingActionButton fab = view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Press any button to get started and explore!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
