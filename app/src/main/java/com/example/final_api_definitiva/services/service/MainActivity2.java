package com.example.final_api_definitiva.services.service;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.final_api_definitiva.R;
import com.example.final_api_definitiva.services.models.Pokemon;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity2 extends AppCompatActivity {
private Retrofit retrofit;
private ImageView FotoPokemon;
Bundle text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        FotoPokemon = findViewById(R.id.FotoPokemon);
        text = getIntent().getExtras();
        String dato=text.getString("text");
        retrofit= new Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();



        Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/"+dato+".png")
                .into(FotoPokemon);




    }
}