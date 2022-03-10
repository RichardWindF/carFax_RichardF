package com.example.carfax_richardf;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class MyListViewAdapter extends BaseAdapter
{
    Context context;
    List<Vehicle> mDatas=new ArrayList<>();

    public MyListViewAdapter(Context context, List<Vehicle> mDatas)
    {
        this.context = context;
        this.mDatas = mDatas;
    }

    @Override
    public int getCount()
    {
        return mDatas.size();
    }

    @Override
    public Vehicle getItem(int i)
    {
        return mDatas.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        ViewHolder viewHolder=null ;//= new ViewHolder();

        if (viewHolder == null)
        {
           // view = LayoutInflater.from(context).inflate(R.layout.activity_main_screen_listview, viewGroup, false);
            view = LayoutInflater.from(context).inflate(R.layout.item_vehicle, viewGroup, false);
            viewHolder = new ViewHolder();

            viewHolder.mPic = view.findViewById(R.id.vehicle_pic);
            viewHolder.mYear = view.findViewById(R.id.vehicle_year);
            viewHolder.mMake = view.findViewById(R.id.vehicle_make);
            viewHolder.mModel = view.findViewById(R.id.vehicle_model);
            viewHolder.mTrim = view.findViewById(R.id.vehicle_trim);
            viewHolder.mListPrice = view.findViewById(R.id.price);
            viewHolder.mMileage = view.findViewById(R.id.mileage);
            viewHolder.mLocation = view.findViewById(R.id.cv_local);

            view.setTag(viewHolder);
        }
        else
        {
            viewHolder= (ViewHolder) view.getTag();
        }


        viewHolder.mPic.setImageResource(mDatas.get(i).getvPhotoAdd());
        viewHolder.mYear.setText(mDatas.get(i).getYear());
        viewHolder.mMake.setText(mDatas.get(i).getMake());
        viewHolder.mModel.setText(mDatas.get(i).getModel());
        viewHolder.mTrim.setText(mDatas.get(i).getTrim());
        viewHolder.mListPrice.setText(String.valueOf(mDatas.get(i).getListPrice()));
        viewHolder.mMileage.setText(String.valueOf(mDatas.get(i).getMileage()));
        viewHolder.mLocation.setText(mDatas.get(i).getLocation());

        //-----------------------------------------------------
        view.findViewById(R.id.linearlayout_click).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent mIntent=new Intent(context,DetailActivity.class);
                context.startActivity(mIntent);
            }
        });

       view.findViewById(R.id.call_dealer_button).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                call("1 703-934-2664");
            }
        });





        //---------------------------------------------------------

        return view;
    }


    private void call(String phone)   //make call to dealer
    {
        final Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phone));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    public static class ViewHolder
    {
//        int vPhotoAdd;
//        int Year;
//        String make, model, trim;
//        float listPrice;
//        double mileage;
//        String location;
//        String phone;

        ImageView mPic;
        TextView mYear, mMake, mModel, mTrim, mListPrice, mMileage, mLocation;
        //String phone;
    }


}