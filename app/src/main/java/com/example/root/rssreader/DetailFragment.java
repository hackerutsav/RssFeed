package com.example.root.rssreader;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by root on 3/25/15.
 */
public class DetailFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_rssitem_detail,container,false);
        return view;
    }
    public void setText(String item) {
        TextView view  = (TextView) getView().findViewById
    }
}
