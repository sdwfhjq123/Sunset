package com.yinhao.sunset;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SunsetActivity extends SingleFragmentActivtiy {

    @Override
    public Fragment createFragment() {
        return SunsetFragment.newInstance();
    }
}
