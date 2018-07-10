package catrisse.marc.recyclerviewexample;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.MyCustomViewHolder> {

    public ArrayList<String> dataset; //set de datos a mostrar

    public class MyCustomViewHolder extends RecyclerView.ViewHolder{ //vista de cada tarjeta a mostrar
        TextView textView; //textView que se encuentra en la cardview del view_item xml
        CardView cardView;

        public MyCustomViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            cardView = itemView.findViewById(R.id.card_view);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.v("I","holi");
                }
            });
            cardView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    Log.v("I","longClick");
                    dataset.add("1.2");
                    //notifyDataSetChanged(); actualizar dataset
                    //notifyItemInserted(int pos) .... más info => https://developer.android.com/reference/android/support/v7/widget/RecyclerView.Adapter#notifyItemChanged(int)
                    return true; //true para consumir el click
                }
            });
        }
        public void setItem(String aux){
            textView.setText(aux);
        }
    }


    @NonNull
    @Override
    public MyCustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_item, parent, false);
        return new MyCustomViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCustomViewHolder holder, int position) {
        String itemstr = dataset.get(position);
        holder.setItem(itemstr);

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
