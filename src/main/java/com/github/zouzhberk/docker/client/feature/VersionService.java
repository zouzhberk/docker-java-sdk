package com.github.zouzhberk.docker.client.feature;

import com.github.zouzhberk.docker.client.domain.VersionEntity;
import io.reactivex.Single;
import retrofit2.http.GET;

/**
 * Created by zouzhberk on 9/20/16.
 */
public interface VersionService
{

    @GET("version")
    public Single<VersionEntity> version();
}
