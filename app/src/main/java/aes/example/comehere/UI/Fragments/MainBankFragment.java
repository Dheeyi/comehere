package aes.example.comehere.UI.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import aes.example.comehere.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainBankFragment extends Fragment {


    public MainBankFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_bank, container, false);
    }

}
