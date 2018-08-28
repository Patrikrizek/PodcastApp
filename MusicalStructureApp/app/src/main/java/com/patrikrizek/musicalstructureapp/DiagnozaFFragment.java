package com.patrikrizek.musicalstructureapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DiagnozaFFragment {

    // toto pak vymazat
    private void getActivity() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.podcast_list, container, false);

        final ArrayList<Podcast> podcasts = new ArrayList<Podcast>();
        podcasts.add(new Podcast("Na štěstí se musí pracovat, samo nepřijde", "Diagnóza F | Rádio Wave | 27/07/2018", R.raw.buchty_2018_08_08));
        podcasts.add(new Podcast("Streetworker nehodnotí jestli si za problémy může člověk nebo ne", "Diagnóza F | Rádio Wave | 20/07/2018", R.raw.buchty_2018_07_25));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PodcastAdapter adapter = new PodcastAdapter(getActivity(), podcasts, R.color.category_buchty);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter((ListAdapter) adapter);
        return rootView;
    }

}






