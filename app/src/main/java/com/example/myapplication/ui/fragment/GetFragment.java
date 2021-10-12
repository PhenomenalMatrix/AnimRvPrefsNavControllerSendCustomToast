package com.example.myapplication.ui.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication.R;


public class GetFragment extends Fragment {

    private Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_get, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getArguments() != null){
            String txt =  getArguments().getString(SentFragment.SEND_KEY);
            Toast.makeText(requireContext(),txt,Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(requireContext(),"Error",Toast.LENGTH_LONG).show();
        }

        btn = view.findViewById(R.id.closeBtn);

        btn.setOnClickListener(v ->{
            Navigation.findNavController(view).navigateUp();
        });
    }
}