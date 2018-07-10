package catrisse.marc.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpRecyclerView();
    }

    void setUpRecyclerView(){ //configuramos el recyclerview
        //enlazamos en recycler
        recyclerView = findViewById(R.id.recycler_view);
        //creamos el linear layout que va a usar el recycler para ordenar las cardviews(view holders)
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyCustomAdapter adapter = new MyCustomAdapter(); //adapter definido por nostros
        ArrayList<String> data = new ArrayList<>(); //nuestro dataset
        iniDataSet(data);
        adapter.dataset = data; //asignamos el dataset del adapter
        recyclerView.setAdapter(adapter);
    }
    //MOAR INFO => https://developer.android.com/guide/topics/ui/layout/recyclerview

    private void iniDataSet(ArrayList<String> data) {
        data.add("1");
        data.add("2");
        data.add("3");
        data.add("4");
        data.add("5");
        data.add("6");
        data.add("7");
    }
}
