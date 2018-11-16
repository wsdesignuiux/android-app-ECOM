package adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.ArrayList;

import e.wolfsoft1.ecom.R;
import model.CategoriesModel;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.MyViewHolder>{

    private Context context;

    int myPos = 0;
    ArrayList<CategoriesModel> todotodaytaskModelArrayList;

    public CategoriesAdapter(Context context, ArrayList<CategoriesModel> todotodaytaskModelArrayList) {
        this.context = context;
        this.todotodaytaskModelArrayList = todotodaytaskModelArrayList;
    }

    @NonNull
    @Override
    public CategoriesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_categories, parent, false);
        return new CategoriesAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesAdapter.MyViewHolder holder, int position) {
        CategoriesModel modelfoodrecycler = todotodaytaskModelArrayList.get(position);

        holder.text.setText(modelfoodrecycler.getText());

        holder.ll1.setBackgroundResource(R.drawable.whats_new);

        if (position == 0){
            holder.ll1.setBackgroundResource(R.drawable.whats_new);

            // holder.hoteltext1.setBackgroundResource(Color.parseColor("ffffff"));
        }else if(position == 1){

            holder.ll1.setBackgroundResource(R.drawable.topwear);
            // holder.hoteltext1.setBackgroundColor(Color.parseColor("#00000000"));
        }else if(position == 2) {

            holder.ll1.setBackgroundResource(R.drawable.footwear);
        }else if(position == 3) {

            holder.ll1.setBackgroundResource(R.drawable.active);

        }else if(position == 4) {

            holder.ll1.setBackgroundResource(R.drawable.accessories);

        }



    }

    @Override
    public int getItemCount() {
        return todotodaytaskModelArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView text;
        FrameLayout ll1;
        public MyViewHolder(View itemView) {
            super(itemView);

            text = itemView.findViewById(R.id.text);
            ll1 = itemView.findViewById(R.id.ll1);

        }
    }
}
