package com.example.recyclerview30112021;

import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<FoodModel> listFoods;
    private OnItemClickListener onItemClickListener;

    private int ITEM_TYPE = 1;
    private int LOADING_TYPE = 0;

    private boolean isLoading = false;

    public FoodAdapter(List<FoodModel> listFoods) {
        this.listFoods = listFoods;
    }

    @Override
    public int getItemViewType(int position) {
        if (isLoading){
            if (position == listFoods.size() - 1){
                return LOADING_TYPE;
            }
        }
        return ITEM_TYPE;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view;
        if (viewType == ITEM_TYPE){
            view = layoutInflater.inflate(R.layout.item_food,parent,false);
            return new FoodViewHolder(view);
        }else{
            view = layoutInflater.inflate(R.layout.item_loading,parent,false);
            return new LoadingViewHolder(view);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//        FoodModel foodModel = listFoods.get(position);
//
//        holder.bind(foodModel);
    }

    @Override
    public int getItemCount() {
        if (listFoods == null || listFoods.size() == 0) {
            return 0;
        }
        return listFoods.size();
    }

    class FoodViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView txtName, txtAddress, txtService, txtDiscount, txtDistance;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imageViewFood);
            txtName = itemView.findViewById(R.id.textViewName);
            txtAddress = itemView.findViewById(R.id.textViewAddress);
            txtService = itemView.findViewById(R.id.textViewService);
            txtDiscount = itemView.findViewById(R.id.textViewDiscount);
            txtDistance = itemView.findViewById(R.id.textViewDistance);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onItemClickListener != null){
                        onItemClickListener.onClick(getAdapterPosition());
                    }
                }
            });
        }

        public void bind(FoodModel foodModel){
            img.setImageResource(foodModel.getImage());
            txtName.setText(foodModel.getName());
            txtAddress.setText(foodModel.getAddress());
            String service = "";
            for (ServiceEnum element : foodModel.getArrServiceEnum()){
                service += element.toString() + "/";
            }
            txtService.setText(service.substring(0,service.length() - 1));
            String textDiscount = "";
            switch (foodModel.getDiscount().getDiscountSessionEnum()){
                case ALL_TIME:
                    textDiscount = " <font color=#A9DEF1>"+foodModel.getDiscount().getDiscountSessionEnum().toString()+" - </font> <font color=#F9C29A>"+foodModel.getDiscount().getName()+"</font>";
                    break;
                case NIGHT:
                    textDiscount = " <font color=#B59198>"+foodModel.getDiscount().getDiscountSessionEnum().toString()+" - </font> <font color=#F9C29A>"+foodModel.getDiscount().getName()+"</font>";
                    break;
                case NOON:
                    textDiscount = " <font color=#BDE3BF>"+foodModel.getDiscount().getDiscountSessionEnum().toString()+" - </font> <font color=#F9C29A>"+foodModel.getDiscount().getName()+"</font>";
                    break;
            }
            txtDiscount.setText(Html.fromHtml(textDiscount));
            txtDistance.setText(foodModel.getDistance() + "km");
        }
    }

    class LoadingViewHolder extends RecyclerView.ViewHolder{

        public LoadingViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }

    public void addLoading(){
        isLoading = true;
        listFoods.add(null);
    }

    public void removeLoading(){
        isLoading = false;
        int position = listFoods.size() - 1;
        listFoods.remove(position);
        notifyItemRemoved(position);
    }
}

