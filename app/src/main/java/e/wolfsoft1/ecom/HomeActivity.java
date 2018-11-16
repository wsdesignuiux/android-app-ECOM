package e.wolfsoft1.ecom;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import adapter.TabAdapter;

public class HomeActivity extends AppCompatActivity {


    ViewPager viewPager1;
    TabLayout tabLayout1;
    TabAdapter adapter;

    Spinner sp_car_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        sp_car_name = findViewById(R.id.sp_car_name);
        //sp_car_model = (Spinner)view.findViewById(R.id.sp_car_model);

        List<String> list = new ArrayList<String>();
        list.add("WOMEN ");
        list.add("KID ");
        list.add("PRODUCT");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(HomeActivity.this, R.layout.spinner_item, R.id.spinner_text, list);
        sp_car_name.setAdapter(dataAdapter);

        tabLayout1 = findViewById(R.id.tablayout1);

        viewPager1 = findViewById(R.id.viewpager1);

//        setCustomFontAndStyle(tabLayout1, 0);
        tabLayout1.setTabGravity(TabLayout.GRAVITY_FILL);


        tabLayout1.addTab(tabLayout1.newTab().setText("HOME"));
        tabLayout1.addTab(tabLayout1.newTab().setText("CATEGORIES"));
        tabLayout1.addTab(tabLayout1.newTab().setText("BRANDS"));




        adapter = new TabAdapter(getSupportFragmentManager(), tabLayout1.getTabCount());
        viewPager1.setAdapter(adapter);
        viewPager1.setOffscreenPageLimit(3);
        viewPager1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout1));
        tabLayout1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager1.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
