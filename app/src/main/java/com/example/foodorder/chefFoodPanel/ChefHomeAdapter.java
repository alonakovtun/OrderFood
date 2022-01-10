//package com.example.foodorder.chefFoodPanel;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.foodorder.R;
//import com.example.foodorder.UpdateDishModel;
//
//import java.util.List;
//
//public class ChefHomeAdapter extends RecyclerView.Adapter<ChefHomeAdapter.ViewHolder> {
//
//    private Context mcont;
//    private List<UpdateDishModel> updateDishModelList;
//
//    public ChefHomeAdapter(Context mcont, List<UpdateDishModel> updateDishModelList) {
//        this.mcont = mcont;
//        this.updateDishModelList = updateDishModelList;
//    }
//
//    @NonNull
//    @Override
//    public ChefHomeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(mcont).inflate(R.layout.chefmenu_update_delete, parent, false);
//        return new ChefHomeAdapter.ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ChefHomeAdapter.ViewHolder holder, int position) {
//        final UpdateDishModel updateDishModel = updateDishModelList.get(position);
//        holder.dishes.setText(updateDishModel.getDishes());
//        updateDishModel.getRandomUID();
//    }
//
//    @Override
//    public int getItemCount() {
//        return updateDishModelList.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//        TextView dishes;
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//
//            dishes = itemView.findViewById(R.id.dish_name);
//        }
//    }
//}
