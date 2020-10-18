package com.wzc.leo_dispatch;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);
        BadViewPager pager = findViewById(R.id.viewpager);
        List<Map<String, String>> strings = new ArrayList<>();
        Map<String, String> map;
        for (int i = 0; i < 20; i++) {
            map = new HashMap<>();
            map.put("key", "strings" + i);
            strings.add(map);
        }
        MyPagerAdapter adapter = new MyPagerAdapter(this, strings);
        pager.setAdapter(adapter);
    }
}
