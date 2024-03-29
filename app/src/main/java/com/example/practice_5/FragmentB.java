package com.example.practice_5;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import java.util.ArrayList;
import java.util.List;

public class FragmentB extends Fragment {
    public FragmentB() {
        super(R.layout.fragment_b);
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        return view;
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String cat_name = this.getArguments().getString("cat_name");
        TextView catName = requireView().findViewById(R.id.t_name);
        catName.setText(cat_name);

        Button button_createCat = requireView().findViewById(R.id.b_create_cat);
        button_createCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText age = (EditText) getActivity().findViewById(R.id.e_age);
                String cat_age = age.getText().toString();
                Spinner type = (Spinner) getActivity().findViewById(R.id.c_type);
                String cat_type = type.getSelectedItem().toString();

                Bundle bundle = new Bundle();
                bundle.putString("cat_name", cat_name);
                bundle.putString("cat_type", cat_type);
                bundle.putString("cat_age", cat_age);
                Navigation.findNavController(view).navigate(R.id.action_BFragment_to_CFragment, bundle);
            }
        });
    }
    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
    }
    public void onStart() {
        super.onStart();
    }
    public void onResume() {
        super.onResume();
    }
    public void onPause() {
        super.onPause();
    }
    public void onStop() {
        super.onStop();
    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }
    public void onDestroyView() {
        super. onDestroyView();
    }
    public void onDestroy() {
        super.onDestroy();
    }
}
