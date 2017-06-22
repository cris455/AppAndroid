package com.example.cristian.ieat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.cristian.ieat.adapters.ProductoAdapter;
import com.example.cristian.ieat.models.Producto;
import com.example.cristian.ieat.net.ProductosClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ProductoAdapter adapter;
    List<Producto> lista;
    ProductosClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.list);
        lista = new ArrayList<>();
        adapter = new ProductoAdapter(getLayoutInflater(),lista);
        list.setAdapter(adapter);

        client = ((App) getApplication()).retrofit.create(ProductosClient.class);
        loadProd();
    }

    public void loadProd(){
        Call<List<Producto>> req = client.all();
        req.enqueue(new Callback<List<Producto>>() {
            @Override
            public void onResponse(Call<List<Producto>> call, Response<List<Producto>> response) {
                if (response.isSuccessful()){
                    List<Producto> data = response.body();
                    adapter.setData(data);
                }
            }

            @Override
            public void onFailure(Call<List<Producto>> call, Throwable t) {

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadProd();
    }
}
