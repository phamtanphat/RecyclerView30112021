package com.example.recyclerview30112021;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder>{

    List<FoodModel> listFoods;

    public FoodAdapter(List<FoodModel> listFoods){
        this.listFoods = listFoods;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        if (listFoods == null || listFoods.size() == 0){
            return 0;
        }
        return listFoods.size();
    }

    class FoodViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView txtName , txtAddress , txtService , txtDiscount , txtDistance;
        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imageViewFood);
            txtName = itemView.findViewById(R.id.textViewName);
            txtAddress = itemView.findViewById(R.id.textViewAddress);
            txtService = itemView.findViewById(R.id.textViewService);
            txtDiscount = itemView.findViewById(R.id.textViewDiscount);
            txtDistance = itemView.findViewById(R.id.textViewDistance);
        }
    }


}

