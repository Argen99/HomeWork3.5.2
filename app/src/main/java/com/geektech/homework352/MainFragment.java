package com.geektech.homework352;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class MainFragment extends Fragment {

    private ArrayList<String> addresses;
    private RecyclerView recyclerView;
    private AddressAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();
        recyclerView = view.findViewById(R.id.recycler);
        adapter = new AddressAdapter(addresses);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        addresses = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            addresses.add("ul. Manasa №" + i);

        }

    }
}