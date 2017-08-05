package com.example.sanros.mysqlretrofitfieldsrepo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by sanros on 4/08/17.
 */

public class ApiClient {
    public static final String BASE_URL = "http://10.0.2.2/contactapp/";
    public static Retrofit retrofit = null;

    public static  Retrofit getApiClient()
    {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).
                    addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}