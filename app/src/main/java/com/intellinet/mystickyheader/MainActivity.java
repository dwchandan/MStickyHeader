package com.intellinet.mystickyheader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import ca.barrenechea.widget.recyclerview.decoration.DividerDecoration;
import ca.barrenechea.widget.recyclerview.decoration.StickyHeaderDecoration;

public class MainActivity extends AppCompatActivity  {

    private RecyclerView mList;
    private StickyHeaderDecoration decor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mList = (RecyclerView)findViewById(R.id.list);
        mList.setHasFixedSize(true);
        mList.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        final StickyTestAdapter adapter = new StickyTestAdapter(MainActivity.this);
        decor = new StickyHeaderDecoration(adapter);
        mList.setAdapter(adapter);
        mList.addItemDecoration(decor, 0);
    }

}
