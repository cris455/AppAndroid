package com.example.cristian.ieat;

import android.app.Application;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Cristian on 22/06/2017.
 */

public class App extends Application {

   Retrofit retrofit;


    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
            .baseUrl("https://iosapp-moviles-ieat.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create(new Gson()))
            .build();

    }

}
