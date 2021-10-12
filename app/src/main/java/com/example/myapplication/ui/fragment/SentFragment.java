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
import android.widget.EditText;

import com.example.myapplication.R;


public class SentFragment extends Fragment {

    static final String SEND_KEY = "key";
    private EditText editText;
    private Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sent, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        editText = view.findViewById(R.id.sendEt);
        btn = view.findViewById(R.id.sendBtn);

        btn.setOnClickListener(v ->{
            Bundle bundle = new Bundle();
            String txt = editText.getText().toString();
            bundle.putString(SEND_KEY,txt);
            Navigation.findNavController(view).navigate(R.id.getFragment, bundle);
        });

    }
}