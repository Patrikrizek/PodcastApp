package com.patrikrizek.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PodcastAdapter extends ArrayAdapter<Podcast> {

    public PodcastAdapter(Context context, ArrayList<Podcast> podcasts) {
        super(context, 0, podcasts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView == LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

    Podcast currentPodcast = getItem(position);

    TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
    titleTextView.setText(currentPodcast.getPodcastTitle());

    TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_text_view);
    dateTextView.setText(currentPodcast.getPodcastDate());

    return listItemView;
    }
}
