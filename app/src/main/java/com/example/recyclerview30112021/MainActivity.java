package com.example.recyclerview30112021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRcvFood;
    FoodAdapter mFoodAdapter;
    ArrayList<FoodModel> mFoodModels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRcvFood = findViewById(R.id.recyclerViewFood);

        mFoodModels = (ArrayList<FoodModel>) FoodModel.getMock();

        mFoodAdapter = new FoodAdapter(mFoodModels);

        mRcvFood.setHasFixedSize(true);
        mRcvFood.setAdapter(mFoodAdapter);


        mFoodAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onClick(int position) {
                mFoodModels.remove(position);
                mFoodAdapter.notifyItemRemoved(position);
            }
        });

    }

}
