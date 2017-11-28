package com.example.android.herobuilder;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link RaceFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link RaceFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RaceFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    // Spinner and AdapterView
    Spinner mRaceSpinner;
    ArrayAdapter<CharSequence> mRaceListAdapter;

    ListView mRacialTraitsListView;
    ArrayAdapter<String> mRacialTraitsListAdapter;

    public RaceFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RaceFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RaceFragment newInstance(String param1, String param2) {
        RaceFragment fragment = new RaceFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_race, container, false);

        // Initialize Spinner
        mRaceSpinner = (Spinner) rootView.findViewById(R.id.race_spinner);
        mRaceSpinner.setOnItemSelectedListener(this);

        // Initialize ArrayAdapter with race options
        mRaceListAdapter = ArrayAdapter.createFromResource(this.getActivity(),
                R.array.race_options, android.R.layout.simple_spinner_item);
        mRaceSpinner.setAdapter(mRaceListAdapter);

        // Set OnItemSelectedListener
        mRaceSpinner.setOnItemSelectedListener(this);

        mRacialTraitsListView = (ListView) rootView.findViewById(R.id.racial_traits_listview);

        // Inflate the layout for this fragment
        return rootView;
    }

    /** Event Handlers **/

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id){
        ArrayList<String> traitsList;

        // Populate Racial Trait list based on race selected.
        switch(position){
            case 0: traitsList = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.dwarf_racial_traits)));
                    break;
            case 1: traitsList = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.elf_racial_traits)));
                    break;
            case 2: traitsList = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.halfling_racial_traits)));
                    break;
            default: traitsList = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.human_racial_traits)));
                    break;
        }

        if(mRacialTraitsListAdapter == null) {
            mRacialTraitsListAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, traitsList);
            mRacialTraitsListView.setAdapter(mRacialTraitsListAdapter);
        } else {
            mRacialTraitsListAdapter.clear();
            mRacialTraitsListAdapter.addAll(traitsList);
            mRacialTraitsListAdapter.notifyDataSetChanged();
        }
    }

    public void onNothingSelected(AdapterView<?> parent){
        // Should never be called.
    }
}
