package com.github.zouzhberk.docker.client.feature;

import com.github.zouzhberk.docker.client.domain.ContainerDetailEntity;
import com.github.zouzhberk.docker.client.domain.ContainerEntity;
import io.reactivex.Flowable;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;
import java.util.Map;

/**
 * Created by zouzhberk on 9/20/16.
 */
public interface ContainerService
{

    @GET("containers/json")
    public Single<List<ContainerEntity>> list();

    @GET("containers/{id}/json")
    public Single<ContainerDetailEntity> inspect(@Path("id") String id);

    @GET("containers/{id}/top?ps_args=aux")
    public Single<Map<String,Object>> top(@Path("id") String id);
}
