package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.ProductPage;
import fragment.ProductPage1;

public class ProductpageAdapter extends FragmentStatePagerAdapter {
    public ProductpageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ProductPage tab1 = new ProductPage();
                return tab1;
            case 1:
                ProductPage1 tab2 = new ProductPage1();
                return tab2;
            case 2:
                ProductPage tab3 = new ProductPage();
                return tab3;
            case 3:
                ProductPage1 tab4 = new ProductPage1();
                return tab4;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
