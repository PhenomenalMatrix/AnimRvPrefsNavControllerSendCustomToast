package com.example.myapplication.ui.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.Prefs;
import com.example.myapplication.R;

public class PrefsFragment extends Fragment {

    private EditText editText;
    private Button btn, showBtn;
    private Prefs prefs;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_prefs, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        editText = view.findViewById(R.id.saveEt);
        btn = view.findViewById(R.id.saveBtn);
        showBtn = view.findViewById(R.id.showBtn);
        prefs = new Prefs(requireActivity());

        btn.setOnClickListener(v ->{
            prefs.saveDate(editText.getText().toString());
        });

        showBtn.setOnClickListener(v -> {
//            Toast.makeText(requireContext(),prefs.getData(),Toast.LENGTH_LONG).show();
            View layout = getLayoutInflater().inflate((R.layout.item_custom_toast),null);
            TextView toastTv = layout.findViewById(R.id.toastTv);
            toastTv.setText(prefs.getData());
            Toast toast = new Toast(requireContext());
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        });
    }
}