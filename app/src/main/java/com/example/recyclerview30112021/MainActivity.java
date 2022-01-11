package com.example.recyclerview30112021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
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
    boolean mIsLoading;
    boolean mIsLastPage;
    int mTotalPage = 10;
    int mCurrentPage = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRcvFood = findViewById(R.id.recyclerViewFood);

        mFoodModels = (ArrayList<FoodModel>) FoodModel.getMock();

        mFoodAdapter = new FoodAdapter(mFoodModels);
        mFoodAdapter.addLoading();
        mRcvFood.setHasFixedSize(true);
        mRcvFood.setAdapter(mFoodAdapter);


        mFoodAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onClick(int position) {
                mFoodModels.remove(position);
                mFoodAdapter.notifyItemRemoved(position);
            }
        });

        mRcvFood.addOnScrollListener(new PaginationScrollListener((LinearLayoutManager) mRcvFood.getLayoutManager()) {
            @Override
            public boolean isLastPage() {
                return mIsLastPage;
            }

            @Override
            public boolean isLoading() {
                return mIsLoading;
            }

            @Override
            public void loadMore() {
                mIsLoading = true;
                mCurrentPage += 1;
                loadNextPage();
            }
        });
    }
    private void loadNextPage(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mFoodAdapter.removeLoading();
                int position = mFoodModels.size() - 1;
                mFoodModels.addAll(FoodModel.getMock());
                mFoodAdapter.notifyItemRangeChanged(position, mFoodModels.size());
                mIsLoading = false;

                if (mCurrentPage < mTotalPage){
                    mFoodAdapter.addLoading();
                }else{
                    mIsLastPage = true;
                }
            }
        },1500);
    }

}
