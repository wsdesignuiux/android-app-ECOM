package e.wolfsoft1.ecom;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import adapter.SearchresultAdapter;
import model.SearchresultModel;

public class Search_Result_Ecom extends AppCompatActivity {
    private ArrayList<SearchresultModel> todotodaytaskModelArrayList;
    private RecyclerView recyclerview;
    private SearchresultAdapter bAdapter;

    Integer[] image = {R.drawable.b4,R.drawable.b5,R.drawable.b6,R.drawable.b7,R.drawable.b4,R.drawable.b5};


    Spinner sp_car_name2,sp_car_name3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search__result__ecom);

        sp_car_name2 = findViewById(R.id.sp_car_name2);
        //sp_car_model = (Spinner)view.findViewById(R.id.sp_car_model);

        List<String> list = new ArrayList<String>();
        list.add("LATEST ");
        list.add("LATEST ");
        list.add("LATEST");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(Search_Result_Ecom.this, R.layout.spinner_item_search, R.id.spinner_text, list);
        sp_car_name2.setAdapter(dataAdapter);


        sp_car_name3 = findViewById(R.id.sp_car_name3);
        //sp_car_model = (Spinner)view.findViewById(R.id.sp_car_model);

        List<String> list1 = new ArrayList<String>();
        list1.add("FILTERS ");
        list1.add("FILTERS ");
        list1.add("FILTERS");

        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(Search_Result_Ecom.this, R.layout.spinner_item_result, R.id.spinner_text, list1);
        sp_car_name3.setAdapter(dataAdapter1);



        recyclerview = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(Search_Result_Ecom.this,2);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        todotodaytaskModelArrayList = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            SearchresultModel beanClassForRecyclerView_contacts = new SearchresultModel(image[i]);
            todotodaytaskModelArrayList.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new SearchresultAdapter(Search_Result_Ecom.this,todotodaytaskModelArrayList);
        recyclerview.setAdapter(bAdapter);

    }
}
