package com.github.zouzhberk.docker.client.domain;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by zouzhberk on 9/20/16.
 */
public class VersionEntity
{

    /**
     * Version : 1.12.1
     * ApiVersion : 1.24
     * GitCommit : 23cf638
     * GoVersion : go1.6.3
     * Os : linux
     * Arch : amd64
     * KernelVersion : 3.13.0-34-generic
     * BuildTime : 2016-08-18T05:22:43.932726241+00:00
     */

    @SerializedName("Version")
    private String version;
    @SerializedName("ApiVersion")
    private String apiVersion;
    @SerializedName("GitCommit")
    private String gitCommit;
    @SerializedName("GoVersion")
    private String goVersion;
    @SerializedName("Os")
    private String os;
    @SerializedName("Arch")
    private String arch;
    @SerializedName("KernelVersion")
    private String kernelVersion;
    @SerializedName("BuildTime")
    private Date buildTime;

    public String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    public String getApiVersion()
    {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion)
    {
        this.apiVersion = apiVersion;
    }

    public String getGitCommit()
    {
        return gitCommit;
    }

    public void setGitCommit(String gitCommit)
    {
        this.gitCommit = gitCommit;
    }

    public String getGoVersion()
    {
        return goVersion;
    }

    public void setGoVersion(String goVersion)
    {
        this.goVersion = goVersion;
    }

    public String getOs()
    {
        return os;
    }

    public void setOs(String os)
    {
        this.os = os;
    }

    public String getArch()
    {
        return arch;
    }

    public void setArch(String arch)
    {
        this.arch = arch;
    }

    public String getKernelVersion()
    {
        return kernelVersion;
    }

    public void setKernelVersion(String kernelVersion)
    {
        this.kernelVersion = kernelVersion;
    }

    public Date getBuildTime()
    {
        return buildTime;
    }

    public void setBuildTime(Date buildTime)
    {
        this.buildTime = buildTime;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("VersionEntity{");
        sb.append("version='").append(version).append('\'');
        sb.append(", apiVersion='").append(apiVersion).append('\'');
        sb.append(", gitCommit='").append(gitCommit).append('\'');
        sb.append(", goVersion='").append(goVersion).append('\'');
        sb.append(", os='").append(os).append('\'');
        sb.append(", arch='").append(arch).append('\'');
        sb.append(", kernelVersion='").append(kernelVersion).append('\'');
        sb.append(", buildTime='").append(buildTime).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
