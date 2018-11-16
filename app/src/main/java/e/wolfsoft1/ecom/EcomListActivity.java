package e.wolfsoft1.ecom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;



import adapter.Ecom_ListRecycleAdapter;
import model.EcomlistModel;

public class EcomListActivity extends AppCompatActivity {


    private ArrayList<EcomlistModel> kwikListModelClasses;
    private RecyclerView recyclerView;
    private Ecom_ListRecycleAdapter bAdapter;

    private String txt[]={"1.Home_ecom","2.Categories_ecom","3.Search-Results_ecom","4.Product-Page_ecom"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecom_list);


        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(EcomListActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        kwikListModelClasses = new ArrayList<>();

        for (int i = 0; i < txt.length; i++) {
            EcomlistModel beanClassForRecyclerView_contacts = new EcomlistModel(txt[i]);
            kwikListModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new Ecom_ListRecycleAdapter(EcomListActivity.this,kwikListModelClasses);
        recyclerView.setAdapter(bAdapter);


    }
}
