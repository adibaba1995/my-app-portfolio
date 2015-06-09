package com.thanekar.aditya.appportfolio;

import android.app.Activity;
import android.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class PortfolioActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return new PortfolioFragment();
    }

}
