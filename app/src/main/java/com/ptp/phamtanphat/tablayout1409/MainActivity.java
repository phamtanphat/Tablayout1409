package com.ptp.phamtanphat.tablayout1409;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    CustomViewPager customViewPager;
    ArrayList<Fragment> mangfragment;
    ArrayList<String> mangtitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);

        mangfragment = new ArrayList<>();
        mangfragment.add(new Fragment_People());
        mangfragment.add(new Fragment_Calls());
        mangfragment.add(new Fragment_Group());

        mangtitle = new ArrayList<>();
        mangtitle.add("People");
        mangtitle.add("Calls");
        mangtitle.add("Group");
        customViewPager = new CustomViewPager(getSupportFragmentManager(),mangfragment,mangtitle);
        viewPager.setAdapter(customViewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.iconpeople);
        tabLayout.getTabAt(1).setIcon(R.drawable.iconcall);
        tabLayout.getTabAt(2).setIcon(R.drawable.icongroup);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Toast.makeText(MainActivity.this, tab.getText(), Toast.LENGTH_SHORT).show();

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
