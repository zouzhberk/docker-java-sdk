package com.github.zouzhberk.docker.client.domain;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zouzhberk on 9/22/16.
 */
public class ContainerTopEntity
{
    @SerializedName("Processes")
    private List<String[]> Processes;
    @SerializedName("Titles")
    private String[] Titles;

    public List<String[]> getProcesses()
    {
        return Processes;
    }

    public void setProcesses(List<String[]> Processes)
    {
        this.Processes = Processes;
    }

    public String[] getTitles()
    {
        return Titles;
    }

    public void setTitles(String[] Titles)
    {
        this.Titles = Titles;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("ContainerTopEntity{");
        sb.append("Processes=").append(Processes);
        sb.append(", Titles=").append(Arrays.toString(Titles));
        sb.append('}');
        return sb.toString();
    }
}
