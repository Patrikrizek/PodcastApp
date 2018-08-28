package com.patrikrizek.musicalstructureapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionPageAdapter extends FragmentPagerAdapter {
    private Context contextTab;

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return contextTab.getString(R.string.player);
        } else if (position == 1) {
            return contextTab.getString(R.string.all);
        } else if (position == 2) {
            return contextTab.getString(R.string.buchty);
        } else if (position == 3) {
            return contextTab.getString(R.string.diagnoza_f);
        } else {
            return contextTab.getString(R.string.new_podcasts);
        }
    }

    public CategoryAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        contextTab = context;
    }

    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlayerFragment();
        } else if (position == 1) {
            return new AllFragement();
        } else if (position == 2) {
            return new BuchtyFragment();
        } else if (position == 3) {
            return new DiagnozaFFragment();
        } else {
            return new NewFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

}
