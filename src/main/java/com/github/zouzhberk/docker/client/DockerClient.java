package com.github.zouzhberk.docker.client;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by berk (zouzhberk@163.com)) on 6/17/16.
 */
public class DockerClient
{

    private final Builder builder;
    private Retrofit retrofit;

    public static class Builder
    {
        public static Builder newBuilder()
        {
            return new Builder();
        }

        public Builder version(String version)
        {
            return this;
        }

        public Builder host(String host)
        {
            return this;
        }

        public DockerClient build()
        {
            DockerClient client = new DockerClient(this);
            return client;
        }
    }


    private DockerClient(Builder builder)
    {
        this.builder = builder;
        init();
    }


    private void init()
    {
        String baseUrl = "http://localhost:2375";
        retrofit = new Retrofit.Builder().baseUrl(baseUrl).addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public <T> T create(Class<T> clazz)
    {
        return retrofit.create(clazz);
    }


}
