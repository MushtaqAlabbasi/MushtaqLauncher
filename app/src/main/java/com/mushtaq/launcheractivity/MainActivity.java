package com.mushtaq.launcheractivity;
import androidx.fragment.app.Fragment;


public class MainActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return LauncherFragment.newInstance();
    }
}
