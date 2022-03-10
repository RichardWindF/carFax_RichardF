package com.example.carfax_richardf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class DetailActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //-------------------------------

        findViewById(R.id.btn_call_dealer).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                call("1 703-934-2664");
            }
        });
    }


    private void call(String phone)   //make call to dealer
    {
        final Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phone));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}

//-----------------------------------------------------------------------------------------
