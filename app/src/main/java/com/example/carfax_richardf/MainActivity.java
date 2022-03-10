package com.example.carfax_richardf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * Date: Mar-9-2022
 * Name:  Richard Feng
 * 1: use OkHttp to get JSon data from
 * "https://carfax-for-consumers.firebaseio.com/assignment.json"
 * successed
 * <p>
 * 2: use GSon to parse JSon data to List
 * --un-successful
 * <p>
 * 3: use ListView +CardView to show the interface and data with user
 * --successed
 * <p>
 * 4: call system (cell phone) dial interface to call dealer
 * --successed
 *
 * 5: listView item setOnClickListener() work usually and it can make
 *    the 1st Activity to 2nd Activity
 *    --successed
 */


public class MainActivity extends AppCompatActivity
{

     // private CardView mLinearLayoutClick;

    private ListView mListView;
    private List<Vehicle> mDatas = new ArrayList<>();
    private MyListViewAdapter mLVAdapter;

    //------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //--------------------------------------------
        //----------------------------------------------------------------
        // mTv = (TextView) findViewById(R.id.tv_okhttp);
        //okHttpClient = new OkHttpClient();
        //mLinearLayoutClick = findViewById(R.id.linearlayout_click);
        //-------------------------------------------
        mListView =(ListView) findViewById(R.id.id_lv_car);
        mDatas = DataUtil.generateVehicleList();
        mLVAdapter = new MyListViewAdapter(this, mDatas);

        mListView.setAdapter(mLVAdapter);
    }

}
//-------------------------------------------------------------



//---------------------------------------





























