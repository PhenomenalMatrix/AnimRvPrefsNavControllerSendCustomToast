package com.example.myapplication.ui.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.adapters.MainAdapter;

import java.util.ArrayList;

public class RecyclerFragment extends Fragment {

    private RecyclerView recyclerView;
    private MainAdapter adapter;
    private ArrayList<String> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycler, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        list = new ArrayList<>();
        list.add("asdasdasS");
        list.add("asdasdas");
        list.add("asdasdas");
        list.add("asdasdas");
        list.add("asdasdas");
        list.add("asdasdas");
        list.add("asdasdas");
        list.add("asdasdas");
        list.add("asdasdas");
        list.add("asdasdas");
        list.add("asdasdas");
        list.add("asdasdas");
        list.add("asdasdas");
        list.add("asdasdas");
        list.add("asdasdasS");
        adapter = new MainAdapter();
        recyclerView = view.findViewById(R.id.recyclerMain);
        adapter.setList(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.startLayoutAnimation();
    }
}