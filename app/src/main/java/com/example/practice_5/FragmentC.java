package com.example.practice_5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentC extends Fragment {
    public FragmentC() {
        super(R.layout.fragment_c);
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_c, container, false);
        return view;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String cat_name = this.getArguments().getString("cat_name");
        TextView catName = requireView().findViewById(R.id.t_name);
        String cat_Name = "Имя: " + cat_name;
        catName.setText(cat_Name);

        String cat_type = this.getArguments().getString("cat_type");
        TextView catType = requireView().findViewById(R.id.t_type);
        String cat_Type = "Тип: " + cat_type;
        catType.setText(cat_Type);

        String cat_age = this.getArguments().getString("cat_age");
        TextView catAge = requireView().findViewById(R.id.t_age);
        catAge.setText(cat_age);
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
