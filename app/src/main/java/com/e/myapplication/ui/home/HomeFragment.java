package com.e.myapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.e.myapplication.Adapter.AllEmployeeAdapter;
import com.e.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private RecyclerView recyclerView;
    private List<String> movieList = new ArrayList<>();
    private AllEmployeeAdapter mAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = (RecyclerView) root.findViewById(R.id.allEmployeeRecyclerView);

        mAdapter = new AllEmployeeAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();

        return root;
    }

    private void prepareMovieData() {
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");
        movieList.add("Dummy employee name");


        mAdapter.notifyDataSetChanged();
    }
}