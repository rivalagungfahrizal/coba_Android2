package com.bnviewpager.kontak_teman.View;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bnviewpager.kontak_teman.R;

/*Tanggal Pengerjaan : 14/8/2019
  Nim                : 10116135
  Nama               : Rival Agung Fahrizal
  Kelas              : IF-3
* */

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentDalam2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentDalam2 extends Fragment {
    public static final String PAGE_TITLE = "Inner Tab1";


    public FragmentDalam2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment
     * @return A new instance of fragment Fragment1.
     */
    public static FragmentDalam2 newInstance() {
        FragmentDalam2 fragment = new FragmentDalam2();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dalam_fragment2, container, false);
    }
}
