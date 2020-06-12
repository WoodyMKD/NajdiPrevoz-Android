package android.najdiprevoz.ui.fragments;

import android.najdiprevoz.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class SearchFragment extends Fragment {

        // spinerot dzaam
    String[] gradoviList;
    Spinner spinerFrom;
    Spinner spinerTo;
    ArrayAdapter<String> adapter;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    Button button;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        View v = inflater.inflate(R.layout.fragment_search, container, false);
        // spiner-ot za searchot
        spinerFrom = (Spinner) v.findViewById(R.id.spinnerFrom);
        spinerTo = (Spinner) v.findViewById(R.id.spinnerTo);
        gradoviList = getResources().getStringArray(R.array.gradovi);
        adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, gradoviList);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinerFrom.setAdapter(adapter);
        spinerTo.setAdapter(adapter);

        button = v.findViewById(R.id.search);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("from",spinerFrom.getSelectedItem().toString());
                bundle.putString("to",spinerTo.getSelectedItem().toString());
                FirstFragment fragment = new FirstFragment();
                fragment.setArguments(bundle);

                getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
//                NavHostFragment.findNavController(SearchFragment.this)
//                        .navigate(R.id.action_searchFragment_to_FirstFragment);

            }
        });



        return v;
    }
}
