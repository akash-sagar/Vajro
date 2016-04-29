package com.example.akash.vajro;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Locale;

/**
 * Created by akash on 27-04-2016.
 */
public class Pager1 extends FragmentPagerAdapter {


    public Pager1(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                Tab1 t1 = new Tab1();
                return t1;
            case 1:
                Tab2 t2 = new Tab2();
                return t2;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return "Top stories";
            case 1:

                return "Members";
            case 2:

                return "Setting";
        }
        return null;
    }
}
