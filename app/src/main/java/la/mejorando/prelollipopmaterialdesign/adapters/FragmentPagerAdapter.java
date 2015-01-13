package la.mejorando.prelollipopmaterialdesign.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import java.util.ArrayList;

import la.mejorando.prelollipopmaterialdesign.fragments.HelloFragment;
import la.mejorando.prelollipopmaterialdesign.fragments.PusheenFragment;
import la.mejorando.prelollipopmaterialdesign.models.Pusheen;


public class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {

    private final String [] TITLES = {"Home", "Pusheen", "Stormy","Home", "Pusheen", "Stormy","Home", "Pusheen", "Stormy"};
    private final int FRAGMENT_COUNT = 9;


    public FragmentPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }

    @Override
    public Fragment getItem(int position) {



          return new PusheenFragment();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }


}