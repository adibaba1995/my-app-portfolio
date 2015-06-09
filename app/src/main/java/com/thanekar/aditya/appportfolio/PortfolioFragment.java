package com.thanekar.aditya.appportfolio;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

/**
 * Created by GAURI on 6/8/2015.
 */
public class PortfolioFragment extends Fragment {

    private Button spotify, scores, library, buildBigger, reader, capstone;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_portfolio, container, false);

        spotify = (Button)view.findViewById(R.id.spotify);
        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast(getString(R.string.launchspotify));
            }
        });
        scores = (Button)view.findViewById(R.id.scores);
        scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast(getString(R.string.launchscores));
            }
        });
        library = (Button)view.findViewById(R.id.library);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast(getString(R.string.launchlibrary));
            }
        });
        buildBigger = (Button)view.findViewById(R.id.buildBigger);
        buildBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast(getString(R.string.launchbuildbigger));
            }
        });
        reader = (Button)view.findViewById(R.id.reader);
        reader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast(getString(R.string.launchreader));
            }
        });
        capstone = (Button)view.findViewById(R.id.capstone);
        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast(getString(R.string.launchcapstone));
            }
        });

        return view;
    }

    private void displayToast(String message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }
}
