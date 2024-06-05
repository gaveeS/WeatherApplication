package com.example.e2145305_weather_application;
import retrofit2.Call;
        import retrofit2.http.GET;
        import retrofit2.http.Query;

public interface ServiceInterface {
    @GET("weather")
    Call<ClimateResponse> getCurrentWeather(@Query("lat") double lat, @Query("lon") double lon, @Query("appid") String appid, @Query("units") String units);
}
