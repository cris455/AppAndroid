package com.example.cristian.ieat.net;

import com.example.cristian.ieat.models.Producto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Cristian on 22/06/2017.
 */

public interface ProductosClient {

    @GET("platos")
    Call<List<Producto>> all();

}
