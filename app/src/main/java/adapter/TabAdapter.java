package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.Categories;
import fragment.Home;


/**
 * Created by wolfsoft3 on 24/7/18.
 */

public class TabAdapter extends FragmentPagerAdapter {
    int numoftabs;

    public TabAdapter(FragmentManager fm, int  mnumoftabs ) {
        super(fm);
        this.numoftabs = mnumoftabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Home tab1 = new Home();
                return tab1;

            case 1:
                        Categories tab2 = new Categories();
                return tab2;

            case 2:
                Home tab3 = new Home();
                return tab3;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
            return numoftabs;
    }
}
