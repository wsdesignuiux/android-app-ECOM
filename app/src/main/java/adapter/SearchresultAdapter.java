package adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import e.wolfsoft1.ecom.R;
import model.CategoriesModel;
import model.SearchresultModel;

public class SearchresultAdapter extends RecyclerView.Adapter<SearchresultAdapter.MyViewHolder>{

    int myPos = 0;
    private Context context;


    ArrayList<SearchresultModel> todotodaytaskModelArrayList;

    public SearchresultAdapter(Context context, ArrayList<SearchresultModel> todotodaytaskModelArrayList) {
        this.context = context;
        this.todotodaytaskModelArrayList = todotodaytaskModelArrayList;
    }

    @NonNull
    @Override
    public SearchresultAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_search_result, parent, false);
        return new SearchresultAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final SearchresultAdapter.MyViewHolder holder, final int position) {
        SearchresultModel modelfoodrecycler = todotodaytaskModelArrayList.get(position);

        holder.image.setImageResource(modelfoodrecycler.getImage());

//holder.favimg.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//
//    }


        holder.favimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.favimg.setImageResource(R.drawable.fav_blue);



            }
        });
//});
//
//        if (myPos == position){
//            holder.favimg.setImageResource(R.drawable.fav_blue);
//
//
//
//        }else {
////            holder.favimg.setImageResource(R.drawable.fav);
//        }
//
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                myPos = position;
//                notifyDataSetChanged();
//
//            }
//
//
//        });




    }

    @Override
    public int getItemCount() {
        return todotodaytaskModelArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image,favimg;
        public MyViewHolder(View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            favimg = itemView.findViewById(R.id.favimg);


        }
    }
}
