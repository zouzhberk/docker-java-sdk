package com.github.zouzhberk.docker.client;

/**
 * Created by berk (zouzhberk@163.com)) on 6/17/16.
 */
public class DockerClient
{

    public static class Builder
    {

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
            DockerClient client = new DockerClient();
            return client;
        }
    }

}
