package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import e.wolfsoft1.ecom.Categories_Ecom;
import e.wolfsoft1.ecom.HomeActivity;
import e.wolfsoft1.ecom.Productpage_ecom;
import e.wolfsoft1.ecom.R;
import e.wolfsoft1.ecom.Search_Result_Ecom;
import fragment.Home;
import model.EcomlistModel;


public class Ecom_ListRecycleAdapter extends RecyclerView.Adapter<Ecom_ListRecycleAdapter.MyViewHolder> {

    Context context;


    private List<EcomlistModel> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title);


        }

    }


    public Ecom_ListRecycleAdapter(Context context, List<EcomlistModel> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public Ecom_ListRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_ecom_list, parent, false);


        return new Ecom_ListRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        EcomlistModel lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    Intent i = new Intent(context, HomeActivity.class);
                    context.startActivity(i);
                }else if(position == 1) {
                    Intent i = new Intent(context, Categories_Ecom.class);
                    context.startActivity(i);
                }else if(position == 2) {
                    Intent i = new Intent(context, Search_Result_Ecom.class);
                    context.startActivity(i);
                }else if(position == 3) {
                    Intent i = new Intent(context, Productpage_ecom.class);
                    context.startActivity(i);
                }

            }

        });


    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


