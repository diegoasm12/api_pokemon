package com.example.final_api_definitiva.services.Api;

import com.example.final_api_definitiva.services.models.Pokemon;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Query;

public interface Pokeapi {
@GET("Pokemon/")
    Call<Pokemon> listaPokemon(@Query("id") int id);
}
