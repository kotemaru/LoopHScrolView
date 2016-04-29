// Copyright (c) kotemaru.org  (APL/2.0)
package org.kotemaru.android.loophscrollview;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.kotemaru.android.fw.widget.LoopHScrollView;

public class TestFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        LoopHScrollView scrollView = (LoopHScrollView) view.findViewById(R.id.loopHScrollView);
        //LayoutInflater inflater = LayoutInflater.from(getActivity());
        ViewGroup child = (ViewGroup) inflater.inflate(R.layout.loop_scroll_item, null, false);
        scrollView.setChildViewGroup(child);
        return view;
    }
}
