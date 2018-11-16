package fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import adapter.CategoriesAdapter;
import e.wolfsoft1.ecom.R;
import model.CategoriesModel;

public class Categories extends Fragment {

    String[] text = {"WHAT’S NEW","TOP WEAR","FOOTWEAR","ACTIVE WEAR","ACCESSORIES"};

    private CategoriesAdapter homepageAdapter;
    private RecyclerView recyclerview;
    private ArrayList<CategoriesModel> todotodaytaskModelArrayList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.categories, container, false);

        recyclerview = view.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        todotodaytaskModelArrayList = new ArrayList<>();


        for (int i = 0; i < text.length; i++) {
            CategoriesModel view1 = new CategoriesModel(text[i]);
            todotodaytaskModelArrayList.add(view1);
        }
        homepageAdapter = new CategoriesAdapter(getActivity(), todotodaytaskModelArrayList);
        recyclerview.setAdapter(homepageAdapter);

        return view;
    }
}
