package com.example.jeewantha.kongcept;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RecyclerInterface {

    String JSONURL = "https://api.myjson.com/bins/";

    @GET("mq3r4.json")
    Call<String> getString();
}
