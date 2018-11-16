package e.wolfsoft1.ecom;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import adapter.ProductpageAdapter;
import adapter.TabAdapter;
import adapter.TabproductpageAdapter;
import me.relex.circleindicator.CircleIndicator;

public class Productpage_ecom extends AppCompatActivity {

    private ViewPager v1;
    private ProductpageAdapter a;
    private CircleIndicator indicator;

    ImageView favimg1;

    ViewPager viewpager1;
    TabLayout tablayout1;
    TabproductpageAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productpage_ecom);




        v1 = (ViewPager)findViewById(R.id.v1);
        CircleIndicator indicator = (CircleIndicator)findViewById(R.id.indicator);
        a = new ProductpageAdapter(getSupportFragmentManager());
        v1.setAdapter(a);
        indicator.setViewPager(v1);
        a.registerDataSetObserver(indicator.getDataSetObserver());

        tablayout1 = findViewById(R.id.tablayout1);

        viewpager1 = findViewById(R.id.viewpager1);

//        setCustomFontAndStyle(tabLayout1, 0);
        tablayout1.setTabGravity(TabLayout.GRAVITY_FILL);


        tablayout1.addTab(tablayout1.newTab().setText("INFO"));
        tablayout1.addTab(tablayout1.newTab().setText("SIZE CHART"));




        adapter = new TabproductpageAdapter(getSupportFragmentManager(), tablayout1.getTabCount());
        viewpager1.setAdapter(adapter);
        viewpager1.setOffscreenPageLimit(2);
        viewpager1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout1));
        tablayout1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager1.setCurrentItem(tab.getPosition());

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
