package catrisse.marc.recyclerviewexample;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
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

                }
            });
            cardView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {

                    return true; //true para consumir el click
                }
            });
        }
    }


    @NonNull
    @Override
    public MyCustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyCustomViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
