package com.github.zouzhberk.docker.client.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

/**
 * Created by zouzhberk on 9/21/16.
 */
public class ContainerDetailEntity
{

    /**
     * Id : b99dcef30a7185625a7c2b7a5eff4835008d157f37001b5390f68c31b621432a
     * Created : 2016-09-21T14:38:04.81122172Z
     * Path : nginx
     * Args : ["-g","daemon off;"]
     * State : {"Status":"exited","Running":false,"Paused":false,"Restarting":false,"OOMKilled":false,"Dead":false,"Pid":0,"ExitCode":1,"Error":"","StartedAt":"2016-09-21T14:38:09.101409113Z","FinishedAt":"2016-09-21T15:05:21.304886109Z"}
     * Image : sha256:4a88d06e26f40b14f702c65c5915bd8e18600520352fa49ece8b5052db0e76fd
     * ResolvConfPath : /var/lib/docker/containers/b99dcef30a7185625a7c2b7a5eff4835008d157f37001b5390f68c31b621432a/resolv.conf
     * HostnamePath : /var/lib/docker/containers/b99dcef30a7185625a7c2b7a5eff4835008d157f37001b5390f68c31b621432a/hostname
     * HostsPath : /var/lib/docker/containers/b99dcef30a7185625a7c2b7a5eff4835008d157f37001b5390f68c31b621432a/hosts
     * LogPath : /var/lib/docker/containers/b99dcef30a7185625a7c2b7a5eff4835008d157f37001b5390f68c31b621432a/b99dcef30a7185625a7c2b7a5eff4835008d157f37001b5390f68c31b621432a-json.log
     * Name : /helloworld.1.6txj86ya8kz6equqbbstx77v5
     * RestartCount : 0.0
     * Driver : aufs
     * MountLabel :
     * ProcessLabel :
     * AppArmorProfile :
     * ExecIDs : null
     * HostConfig : {"Binds":null,"ContainerIDFile":"","LogConfig":{"Type":"json-file","Config":{}},"NetworkMode":"default","PortBindings":null,"RestartPolicy":{"Name":"","MaximumRetryCount":0},"AutoRemove":false,"VolumeDriver":"","VolumesFrom":null,"CapAdd":null,"CapDrop":null,"Dns":[],"DnsOptions":[],"DnsSearch":[],"ExtraHosts":null,"GroupAdd":null,"IpcMode":"","Cgroup":"","Links":null,"OomScoreAdj":0,"PidMode":"","Privileged":false,"PublishAllPorts":false,"ReadonlyRootfs":false,"SecurityOpt":null,"UTSMode":"","UsernsMode":"","ShmSize":6.7108864E7,"Runtime":"runc","ConsoleSize":[0,0],"Isolation":"","CpuShares":0,"Memory":0,"CgroupParent":"","BlkioWeight":0,"BlkioWeightDevice":null,"BlkioDeviceReadBps":null,"BlkioDeviceWriteBps":null,"BlkioDeviceReadIOps":null,"BlkioDeviceWriteIOps":null,"CpuPeriod":0,"CpuQuota":0,"CpusetCpus":"","CpusetMems":"","Devices":null,"DiskQuota":0,"KernelMemory":0,"MemoryReservation":0,"MemorySwap":0,"MemorySwappiness":-1,"OomKillDisable":false,"PidsLimit":0,"Ulimits":null,"CpuCount":0,"CpuPercent":0,"IOMaximumIOps":0,"IOMaximumBandwidth":0}
     * GraphDriver : {"Name":"aufs","Data":null}
     * Mounts : []
     * Config : {"Hostname":"b99dcef30a71","Domainname":"","User":"","AttachStdin":false,"AttachStdout":false,"AttachStderr":false,"ExposedPorts":{"443/tcp":{},"80/tcp":{}},"Tty":false,"OpenStdin":false,"StdinOnce":false,"Env":["PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin","NGINX_VERSION=1.11.4-1~jessie"],"Cmd":["nginx","-g","daemon off;"],"Image":"nginx:latest","Volumes":null,"WorkingDir":"","Entrypoint":null,"OnBuild":null,"Labels":{"com.docker.swarm.node.id":"6497nvjdw1herdj0r10wsnun5","com.docker.swarm.service.id":"ckyrbiz5fxjk7ud2zycbujnc6","com.docker.swarm.service.name":"helloworld","com.docker.swarm.task":"","com.docker.swarm.task.id":"6txj86ya8kz6equqbbstx77v5","com.docker.swarm.task.name":"helloworld.1"}}
     * NetworkSettings : {"Bridge":"","SandboxID":"c5e5d56038cfb9b44c70c6f70c608f5a3b7dfa220dce1a38697014308b1eb157","HairpinMode":false,"LinkLocalIPv6Address":"","LinkLocalIPv6PrefixLen":0,"Ports":{"443/tcp":null,"80/tcp":null},"SandboxKey":"/var/run/docker/netns/c5e5d56038cf","SecondaryIPAddresses":null,"SecondaryIPv6Addresses":null,"EndpointID":"","Gateway":"","GlobalIPv6Address":"","GlobalIPv6PrefixLen":0,"IPAddress":"","IPPrefixLen":0,"IPv6Gateway":"","MacAddress":"","Networks":{"ingress":{"IPAMConfig":{"IPv4Address":"10.255.0.2"},"Links":null,"Aliases":["b99dcef30a71"],"NetworkID":"4ut8m1g01sw5klqlbio47e7h4","EndpointID":"abe2e4f90d582791a1b31439ff458843f4cb07678e9ccd830163e34b56e25072","Gateway":"","IPAddress":"10.255.0.2","IPPrefixLen":16,"IPv6Gateway":"","GlobalIPv6Address":"","GlobalIPv6PrefixLen":0,"MacAddress":"02:42:0a:ff:00:02"}}}
     */

    @SerializedName("Id")
    private String Id;
    @SerializedName("Created")
    private String Created;
    @SerializedName("Path")
    private String Path;
    /**
     * Status : exited
     * Running : false
     * Paused : false
     * Restarting : false
     * OOMKilled : false
     * Dead : false
     * Pid : 0.0
     * ExitCode : 1.0
     * Error :
     * StartedAt : 2016-09-21T14:38:09.101409113Z
     * FinishedAt : 2016-09-21T15:05:21.304886109Z
     */

    @SerializedName("State")
    private StateEntity State;
    @SerializedName("Image")
    private String Image;
    @SerializedName("ResolvConfPath")
    private String ResolvConfPath;
    @SerializedName("HostnamePath")
    private String HostnamePath;
    @SerializedName("HostsPath")
    private String HostsPath;
    @SerializedName("LogPath")
    private String LogPath;
    @SerializedName("Name")
    private String Name;
    @SerializedName("RestartCount")
    private double RestartCount;
    @SerializedName("Driver")
    private String Driver;
    @SerializedName("MountLabel")
    private String MountLabel;
    @SerializedName("ProcessLabel")
    private String ProcessLabel;
    @SerializedName("AppArmorProfile")
    private String AppArmorProfile;
    @SerializedName("ExecIDs")
    private Object ExecIDs;
    /**
     * Binds : null
     * ContainerIDFile :
     * LogConfig : {"Type":"json-file","Config":{}}
     * NetworkMode : default
     * PortBindings : null
     * RestartPolicy : {"Name":"","MaximumRetryCount":0}
     * AutoRemove : false
     * VolumeDriver :
     * VolumesFrom : null
     * CapAdd : null
     * CapDrop : null
     * Dns : []
     * DnsOptions : []
     * DnsSearch : []
     * ExtraHosts : null
     * GroupAdd : null
     * IpcMode :
     * Cgroup :
     * Links : null
     * OomScoreAdj : 0.0
     * PidMode :
     * Privileged : false
     * PublishAllPorts : false
     * ReadonlyRootfs : false
     * SecurityOpt : null
     * UTSMode :
     * UsernsMode :
     * ShmSize : 6.7108864E7
     * Runtime : runc
     * ConsoleSize : [0,0]
     * Isolation :
     * CpuShares : 0.0
     * Memory : 0.0
     * CgroupParent :
     * BlkioWeight : 0.0
     * BlkioWeightDevice : null
     * BlkioDeviceReadBps : null
     * BlkioDeviceWriteBps : null
     * BlkioDeviceReadIOps : null
     * BlkioDeviceWriteIOps : null
     * CpuPeriod : 0.0
     * CpuQuota : 0.0
     * CpusetCpus :
     * CpusetMems :
     * Devices : null
     * DiskQuota : 0.0
     * KernelMemory : 0.0
     * MemoryReservation : 0.0
     * MemorySwap : 0.0
     * MemorySwappiness : -1.0
     * OomKillDisable : false
     * PidsLimit : 0.0
     * Ulimits : null
     * CpuCount : 0.0
     * CpuPercent : 0.0
     * IOMaximumIOps : 0.0
     * IOMaximumBandwidth : 0.0
     */

    @SerializedName("HostConfig")
    private HostConfigEntity HostConfig;
    /**
     * Name : aufs
     * Data : null
     */

    @SerializedName("GraphDriver")
    private GraphDriverEntity GraphDriver;
    /**
     * Hostname : b99dcef30a71
     * Domainname :
     * User :
     * AttachStdin : false
     * AttachStdout : false
     * AttachStderr : false
     * ExposedPorts : {"443/tcp":{},"80/tcp":{}}
     * Tty : false
     * OpenStdin : false
     * StdinOnce : false
     * Env : ["PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin","NGINX_VERSION=1.11.4-1~jessie"]
     * Cmd : ["nginx","-g","daemon off;"]
     * Image : nginx:latest
     * Volumes : null
     * WorkingDir :
     * Entrypoint : null
     * OnBuild : null
     * Labels : {"com.docker.swarm.node.id":"6497nvjdw1herdj0r10wsnun5","com.docker.swarm.service.id":"ckyrbiz5fxjk7ud2zycbujnc6","com.docker.swarm.service.name":"helloworld","com.docker.swarm.task":"","com.docker.swarm.task.id":"6txj86ya8kz6equqbbstx77v5","com.docker.swarm.task.name":"helloworld.1"}
     */

    @SerializedName("Config")
    private ConfigEntity Config;
    /**
     * Bridge :
     * SandboxID : c5e5d56038cfb9b44c70c6f70c608f5a3b7dfa220dce1a38697014308b1eb157
     * HairpinMode : false
     * LinkLocalIPv6Address :
     * LinkLocalIPv6PrefixLen : 0.0
     * Ports : {"443/tcp":null,"80/tcp":null}
     * SandboxKey : /var/run/docker/netns/c5e5d56038cf
     * SecondaryIPAddresses : null
     * SecondaryIPv6Addresses : null
     * EndpointID :
     * Gateway :
     * GlobalIPv6Address :
     * GlobalIPv6PrefixLen : 0.0
     * IPAddress :
     * IPPrefixLen : 0.0
     * IPv6Gateway :
     * MacAddress :
     * Networks : {"ingress":{"IPAMConfig":{"IPv4Address":"10.255.0.2"},"Links":null,"Aliases":["b99dcef30a71"],"NetworkID":"4ut8m1g01sw5klqlbio47e7h4","EndpointID":"abe2e4f90d582791a1b31439ff458843f4cb07678e9ccd830163e34b56e25072","Gateway":"","IPAddress":"10.255.0.2","IPPrefixLen":16,"IPv6Gateway":"","GlobalIPv6Address":"","GlobalIPv6PrefixLen":0,"MacAddress":"02:42:0a:ff:00:02"}}
     */

    @SerializedName("NetworkSettings")
    private NetworkSettingsEntity NetworkSettings;
    @SerializedName("Args")
    private List<String> Args;
    @SerializedName("Mounts")
    private List<?> Mounts;

    public String getId()
    {
        return Id;
    }

    public void setId(String Id)
    {
        this.Id = Id;
    }

    public String getCreated()
    {
        return Created;
    }

    public void setCreated(String Created)
    {
        this.Created = Created;
    }

    public String getPath()
    {
        return Path;
    }

    public void setPath(String Path)
    {
        this.Path = Path;
    }

    public StateEntity getState()
    {
        return State;
    }

    public void setState(StateEntity State)
    {
        this.State = State;
    }

    public String getImage()
    {
        return Image;
    }

    public void setImage(String Image)
    {
        this.Image = Image;
    }

    public String getResolvConfPath()
    {
        return ResolvConfPath;
    }

    public void setResolvConfPath(String ResolvConfPath)
    {
        this.ResolvConfPath = ResolvConfPath;
    }

    public String getHostnamePath()
    {
        return HostnamePath;
    }

    public void setHostnamePath(String HostnamePath)
    {
        this.HostnamePath = HostnamePath;
    }

    public String getHostsPath()
    {
        return HostsPath;
    }

    public void setHostsPath(String HostsPath)
    {
        this.HostsPath = HostsPath;
    }

    public String getLogPath()
    {
        return LogPath;
    }

    public void setLogPath(String LogPath)
    {
        this.LogPath = LogPath;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public double getRestartCount()
    {
        return RestartCount;
    }

    public void setRestartCount(double RestartCount)
    {
        this.RestartCount = RestartCount;
    }

    public String getDriver()
    {
        return Driver;
    }

    public void setDriver(String Driver)
    {
        this.Driver = Driver;
    }

    public String getMountLabel()
    {
        return MountLabel;
    }

    public void setMountLabel(String MountLabel)
    {
        this.MountLabel = MountLabel;
    }

    public String getProcessLabel()
    {
        return ProcessLabel;
    }

    public void setProcessLabel(String ProcessLabel)
    {
        this.ProcessLabel = ProcessLabel;
    }

    public String getAppArmorProfile()
    {
        return AppArmorProfile;
    }

    public void setAppArmorProfile(String AppArmorProfile)
    {
        this.AppArmorProfile = AppArmorProfile;
    }

    public Object getExecIDs()
    {
        return ExecIDs;
    }

    public void setExecIDs(Object ExecIDs)
    {
        this.ExecIDs = ExecIDs;
    }

    public HostConfigEntity getHostConfig()
    {
        return HostConfig;
    }

    public void setHostConfig(HostConfigEntity HostConfig)
    {
        this.HostConfig = HostConfig;
    }

    public GraphDriverEntity getGraphDriver()
    {
        return GraphDriver;
    }

    public void setGraphDriver(GraphDriverEntity GraphDriver)
    {
        this.GraphDriver = GraphDriver;
    }

    public ConfigEntity getConfig()
    {
        return Config;
    }

    public void setConfig(ConfigEntity Config)
    {
        this.Config = Config;
    }

    public NetworkSettingsEntity getNetworkSettings()
    {
        return NetworkSettings;
    }

    public void setNetworkSettings(NetworkSettingsEntity NetworkSettings)
    {
        this.NetworkSettings = NetworkSettings;
    }

    public List<String> getArgs()
    {
        return Args;
    }

    public void setArgs(List<String> Args)
    {
        this.Args = Args;
    }

    public List<?> getMounts()
    {
        return Mounts;
    }

    public void setMounts(List<?> Mounts)
    {
        this.Mounts = Mounts;
    }

    public static class StateEntity
    {
        @SerializedName("Status")
        private String Status;
        @SerializedName("Running")
        private boolean Running;
        @SerializedName("Paused")
        private boolean Paused;
        @SerializedName("Restarting")
        private boolean Restarting;
        @SerializedName("OOMKilled")
        private boolean OOMKilled;
        @SerializedName("Dead")
        private boolean Dead;
        @SerializedName("Pid")
        private double Pid;
        @SerializedName("ExitCode")
        private double ExitCode;
        @SerializedName("Error")
        private String Error;
        @SerializedName("StartedAt")
        private String StartedAt;
        @SerializedName("FinishedAt")
        private String FinishedAt;

        public String getStatus()
        {
            return Status;
        }

        public void setStatus(String Status)
        {
            this.Status = Status;
        }

        public boolean isRunning()
        {
            return Running;
        }

        public void setRunning(boolean Running)
        {
            this.Running = Running;
        }

        public boolean isPaused()
        {
            return Paused;
        }

        public void setPaused(boolean Paused)
        {
            this.Paused = Paused;
        }

        public boolean isRestarting()
        {
            return Restarting;
        }

        public void setRestarting(boolean Restarting)
        {
            this.Restarting = Restarting;
        }

        public boolean isOOMKilled()
        {
            return OOMKilled;
        }

        public void setOOMKilled(boolean OOMKilled)
        {
            this.OOMKilled = OOMKilled;
        }

        public boolean isDead()
        {
            return Dead;
        }

        public void setDead(boolean Dead)
        {
            this.Dead = Dead;
        }

        public double getPid()
        {
            return Pid;
        }

        public void setPid(double Pid)
        {
            this.Pid = Pid;
        }

        public double getExitCode()
        {
            return ExitCode;
        }

        public void setExitCode(double ExitCode)
        {
            this.ExitCode = ExitCode;
        }

        public String getError()
        {
            return Error;
        }

        public void setError(String Error)
        {
            this.Error = Error;
        }

        public String getStartedAt()
        {
            return StartedAt;
        }

        public void setStartedAt(String StartedAt)
        {
            this.StartedAt = StartedAt;
        }

        public String getFinishedAt()
        {
            return FinishedAt;
        }

        public void setFinishedAt(String FinishedAt)
        {
            this.FinishedAt = FinishedAt;
        }
    }

    public static class HostConfigEntity
    {
        @SerializedName("Binds")
        private Object Binds;
        @SerializedName("ContainerIDFile")
        private String ContainerIDFile;
        /**
         * Type : json-file
         * Config : {}
         */

        @SerializedName("LogConfig")
        private LogConfigEntity LogConfig;
        @SerializedName("NetworkMode")
        private String NetworkMode;
        @SerializedName("PortBindings")
        private Object PortBindings;
        /**
         * Name :
         * MaximumRetryCount : 0.0
         */

        @SerializedName("RestartPolicy")
        private RestartPolicyEntity RestartPolicy;
        @SerializedName("AutoRemove")
        private boolean AutoRemove;
        @SerializedName("VolumeDriver")
        private String VolumeDriver;
        @SerializedName("VolumesFrom")
        private Object VolumesFrom;
        @SerializedName("CapAdd")
        private Object CapAdd;
        @SerializedName("CapDrop")
        private Object CapDrop;
        @SerializedName("ExtraHosts")
        private Object ExtraHosts;
        @SerializedName("GroupAdd")
        private Object GroupAdd;
        @SerializedName("IpcMode")
        private String IpcMode;
        @SerializedName("Cgroup")
        private String Cgroup;
        @SerializedName("Links")
        private Object Links;
        @SerializedName("OomScoreAdj")
        private double OomScoreAdj;
        @SerializedName("PidMode")
        private String PidMode;
        @SerializedName("Privileged")
        private boolean Privileged;
        @SerializedName("PublishAllPorts")
        private boolean PublishAllPorts;
        @SerializedName("ReadonlyRootfs")
        private boolean ReadonlyRootfs;
        @SerializedName("SecurityOpt")
        private Object SecurityOpt;
        @SerializedName("UTSMode")
        private String UTSMode;
        @SerializedName("UsernsMode")
        private String UsernsMode;
        @SerializedName("ShmSize")
        private double ShmSize;
        @SerializedName("Runtime")
        private String Runtime;
        @SerializedName("Isolation")
        private String Isolation;
        @SerializedName("CpuShares")
        private double CpuShares;
        @SerializedName("Memory")
        private double Memory;
        @SerializedName("CgroupParent")
        private String CgroupParent;
        @SerializedName("BlkioWeight")
        private double BlkioWeight;
        @SerializedName("BlkioWeightDevice")
        private Object BlkioWeightDevice;
        @SerializedName("BlkioDeviceReadBps")
        private Object BlkioDeviceReadBps;
        @SerializedName("BlkioDeviceWriteBps")
        private Object BlkioDeviceWriteBps;
        @SerializedName("BlkioDeviceReadIOps")
        private Object BlkioDeviceReadIOps;
        @SerializedName("BlkioDeviceWriteIOps")
        private Object BlkioDeviceWriteIOps;
        @SerializedName("CpuPeriod")
        private double CpuPeriod;
        @SerializedName("CpuQuota")
        private double CpuQuota;
        @SerializedName("CpusetCpus")
        private String CpusetCpus;
        @SerializedName("CpusetMems")
        private String CpusetMems;
        @SerializedName("Devices")
        private Object Devices;
        @SerializedName("DiskQuota")
        private double DiskQuota;
        @SerializedName("KernelMemory")
        private double KernelMemory;
        @SerializedName("MemoryReservation")
        private double MemoryReservation;
        @SerializedName("MemorySwap")
        private double MemorySwap;
        @SerializedName("MemorySwappiness")
        private double MemorySwappiness;
        @SerializedName("OomKillDisable")
        private boolean OomKillDisable;
        @SerializedName("PidsLimit")
        private double PidsLimit;
        @SerializedName("Ulimits")
        private Object Ulimits;
        @SerializedName("CpuCount")
        private double CpuCount;
        @SerializedName("CpuPercent")
        private double CpuPercent;
        @SerializedName("IOMaximumIOps")
        private double IOMaximumIOps;
        @SerializedName("IOMaximumBandwidth")
        private double IOMaximumBandwidth;
        @SerializedName("Dns")
        private List<?> Dns;
        @SerializedName("DnsOptions")
        private List<?> DnsOptions;
        @SerializedName("DnsSearch")
        private List<?> DnsSearch;
        @SerializedName("ConsoleSize")
        private List<Double> ConsoleSize;

        public Object getBinds()
        {
            return Binds;
        }

        public void setBinds(Object Binds)
        {
            this.Binds = Binds;
        }

        public String getContainerIDFile()
        {
            return ContainerIDFile;
        }

        public void setContainerIDFile(String ContainerIDFile)
        {
            this.ContainerIDFile = ContainerIDFile;
        }

        public LogConfigEntity getLogConfig()
        {
            return LogConfig;
        }

        public void setLogConfig(LogConfigEntity LogConfig)
        {
            this.LogConfig = LogConfig;
        }

        public String getNetworkMode()
        {
            return NetworkMode;
        }

        public void setNetworkMode(String NetworkMode)
        {
            this.NetworkMode = NetworkMode;
        }

        public Object getPortBindings()
        {
            return PortBindings;
        }

        public void setPortBindings(Object PortBindings)
        {
            this.PortBindings = PortBindings;
        }

        public RestartPolicyEntity getRestartPolicy()
        {
            return RestartPolicy;
        }

        public void setRestartPolicy(RestartPolicyEntity RestartPolicy)
        {
            this.RestartPolicy = RestartPolicy;
        }

        public boolean isAutoRemove()
        {
            return AutoRemove;
        }

        public void setAutoRemove(boolean AutoRemove)
        {
            this.AutoRemove = AutoRemove;
        }

        public String getVolumeDriver()
        {
            return VolumeDriver;
        }

        public void setVolumeDriver(String VolumeDriver)
        {
            this.VolumeDriver = VolumeDriver;
        }

        public Object getVolumesFrom()
        {
            return VolumesFrom;
        }

        public void setVolumesFrom(Object VolumesFrom)
        {
            this.VolumesFrom = VolumesFrom;
        }

        public Object getCapAdd()
        {
            return CapAdd;
        }

        public void setCapAdd(Object CapAdd)
        {
            this.CapAdd = CapAdd;
        }

        public Object getCapDrop()
        {
            return CapDrop;
        }

        public void setCapDrop(Object CapDrop)
        {
            this.CapDrop = CapDrop;
        }

        public Object getExtraHosts()
        {
            return ExtraHosts;
        }

        public void setExtraHosts(Object ExtraHosts)
        {
            this.ExtraHosts = ExtraHosts;
        }

        public Object getGroupAdd()
        {
            return GroupAdd;
        }

        public void setGroupAdd(Object GroupAdd)
        {
            this.GroupAdd = GroupAdd;
        }

        public String getIpcMode()
        {
            return IpcMode;
        }

        public void setIpcMode(String IpcMode)
        {
            this.IpcMode = IpcMode;
        }

        public String getCgroup()
        {
            return Cgroup;
        }

        public void setCgroup(String Cgroup)
        {
            this.Cgroup = Cgroup;
        }

        public Object getLinks()
        {
            return Links;
        }

        public void setLinks(Object Links)
        {
            this.Links = Links;
        }

        public double getOomScoreAdj()
        {
            return OomScoreAdj;
        }

        public void setOomScoreAdj(double OomScoreAdj)
        {
            this.OomScoreAdj = OomScoreAdj;
        }

        public String getPidMode()
        {
            return PidMode;
        }

        public void setPidMode(String PidMode)
        {
            this.PidMode = PidMode;
        }

        public boolean isPrivileged()
        {
            return Privileged;
        }

        public void setPrivileged(boolean Privileged)
        {
            this.Privileged = Privileged;
        }

        public boolean isPublishAllPorts()
        {
            return PublishAllPorts;
        }

        public void setPublishAllPorts(boolean PublishAllPorts)
        {
            this.PublishAllPorts = PublishAllPorts;
        }

        public boolean isReadonlyRootfs()
        {
            return ReadonlyRootfs;
        }

        public void setReadonlyRootfs(boolean ReadonlyRootfs)
        {
            this.ReadonlyRootfs = ReadonlyRootfs;
        }

        public Object getSecurityOpt()
        {
            return SecurityOpt;
        }

        public void setSecurityOpt(Object SecurityOpt)
        {
            this.SecurityOpt = SecurityOpt;
        }

        public String getUTSMode()
        {
            return UTSMode;
        }

        public void setUTSMode(String UTSMode)
        {
            this.UTSMode = UTSMode;
        }

        public String getUsernsMode()
        {
            return UsernsMode;
        }

        public void setUsernsMode(String UsernsMode)
        {
            this.UsernsMode = UsernsMode;
        }

        public double getShmSize()
        {
            return ShmSize;
        }

        public void setShmSize(double ShmSize)
        {
            this.ShmSize = ShmSize;
        }

        public String getRuntime()
        {
            return Runtime;
        }

        public void setRuntime(String Runtime)
        {
            this.Runtime = Runtime;
        }

        public String getIsolation()
        {
            return Isolation;
        }

        public void setIsolation(String Isolation)
        {
            this.Isolation = Isolation;
        }

        public double getCpuShares()
        {
            return CpuShares;
        }

        public void setCpuShares(double CpuShares)
        {
            this.CpuShares = CpuShares;
        }

        public double getMemory()
        {
            return Memory;
        }

        public void setMemory(double Memory)
        {
            this.Memory = Memory;
        }

        public String getCgroupParent()
        {
            return CgroupParent;
        }

        public void setCgroupParent(String CgroupParent)
        {
            this.CgroupParent = CgroupParent;
        }

        public double getBlkioWeight()
        {
            return BlkioWeight;
        }

        public void setBlkioWeight(double BlkioWeight)
        {
            this.BlkioWeight = BlkioWeight;
        }

        public Object getBlkioWeightDevice()
        {
            return BlkioWeightDevice;
        }

        public void setBlkioWeightDevice(Object BlkioWeightDevice)
        {
            this.BlkioWeightDevice = BlkioWeightDevice;
        }

        public Object getBlkioDeviceReadBps()
        {
            return BlkioDeviceReadBps;
        }

        public void setBlkioDeviceReadBps(Object BlkioDeviceReadBps)
        {
            this.BlkioDeviceReadBps = BlkioDeviceReadBps;
        }

        public Object getBlkioDeviceWriteBps()
        {
            return BlkioDeviceWriteBps;
        }

        public void setBlkioDeviceWriteBps(Object BlkioDeviceWriteBps)
        {
            this.BlkioDeviceWriteBps = BlkioDeviceWriteBps;
        }

        public Object getBlkioDeviceReadIOps()
        {
            return BlkioDeviceReadIOps;
        }

        public void setBlkioDeviceReadIOps(Object BlkioDeviceReadIOps)
        {
            this.BlkioDeviceReadIOps = BlkioDeviceReadIOps;
        }

        public Object getBlkioDeviceWriteIOps()
        {
            return BlkioDeviceWriteIOps;
        }

        public void setBlkioDeviceWriteIOps(Object BlkioDeviceWriteIOps)
        {
            this.BlkioDeviceWriteIOps = BlkioDeviceWriteIOps;
        }

        public double getCpuPeriod()
        {
            return CpuPeriod;
        }

        public void setCpuPeriod(double CpuPeriod)
        {
            this.CpuPeriod = CpuPeriod;
        }

        public double getCpuQuota()
        {
            return CpuQuota;
        }

        public void setCpuQuota(double CpuQuota)
        {
            this.CpuQuota = CpuQuota;
        }

        public String getCpusetCpus()
        {
            return CpusetCpus;
        }

        public void setCpusetCpus(String CpusetCpus)
        {
            this.CpusetCpus = CpusetCpus;
        }

        public String getCpusetMems()
        {
            return CpusetMems;
        }

        public void setCpusetMems(String CpusetMems)
        {
            this.CpusetMems = CpusetMems;
        }

        public Object getDevices()
        {
            return Devices;
        }

        public void setDevices(Object Devices)
        {
            this.Devices = Devices;
        }

        public double getDiskQuota()
        {
            return DiskQuota;
        }

        public void setDiskQuota(double DiskQuota)
        {
            this.DiskQuota = DiskQuota;
        }

        public double getKernelMemory()
        {
            return KernelMemory;
        }

        public void setKernelMemory(double KernelMemory)
        {
            this.KernelMemory = KernelMemory;
        }

        public double getMemoryReservation()
        {
            return MemoryReservation;
        }

        public void setMemoryReservation(double MemoryReservation)
        {
            this.MemoryReservation = MemoryReservation;
        }

        public double getMemorySwap()
        {
            return MemorySwap;
        }

        public void setMemorySwap(double MemorySwap)
        {
            this.MemorySwap = MemorySwap;
        }

        public double getMemorySwappiness()
        {
            return MemorySwappiness;
        }

        public void setMemorySwappiness(double MemorySwappiness)
        {
            this.MemorySwappiness = MemorySwappiness;
        }

        public boolean isOomKillDisable()
        {
            return OomKillDisable;
        }

        public void setOomKillDisable(boolean OomKillDisable)
        {
            this.OomKillDisable = OomKillDisable;
        }

        public double getPidsLimit()
        {
            return PidsLimit;
        }

        public void setPidsLimit(double PidsLimit)
        {
            this.PidsLimit = PidsLimit;
        }

        public Object getUlimits()
        {
            return Ulimits;
        }

        public void setUlimits(Object Ulimits)
        {
            this.Ulimits = Ulimits;
        }

        public double getCpuCount()
        {
            return CpuCount;
        }

        public void setCpuCount(double CpuCount)
        {
            this.CpuCount = CpuCount;
        }

        public double getCpuPercent()
        {
            return CpuPercent;
        }

        public void setCpuPercent(double CpuPercent)
        {
            this.CpuPercent = CpuPercent;
        }

        public double getIOMaximumIOps()
        {
            return IOMaximumIOps;
        }

        public void setIOMaximumIOps(double IOMaximumIOps)
        {
            this.IOMaximumIOps = IOMaximumIOps;
        }

        public double getIOMaximumBandwidth()
        {
            return IOMaximumBandwidth;
        }

        public void setIOMaximumBandwidth(double IOMaximumBandwidth)
        {
            this.IOMaximumBandwidth = IOMaximumBandwidth;
        }

        public List<?> getDns()
        {
            return Dns;
        }

        public void setDns(List<?> Dns)
        {
            this.Dns = Dns;
        }

        public List<?> getDnsOptions()
        {
            return DnsOptions;
        }

        public void setDnsOptions(List<?> DnsOptions)
        {
            this.DnsOptions = DnsOptions;
        }

        public List<?> getDnsSearch()
        {
            return DnsSearch;
        }

        public void setDnsSearch(List<?> DnsSearch)
        {
            this.DnsSearch = DnsSearch;
        }

        public List<Double> getConsoleSize()
        {
            return ConsoleSize;
        }

        public void setConsoleSize(List<Double> ConsoleSize)
        {
            this.ConsoleSize = ConsoleSize;
        }

        public static class LogConfigEntity
        {
            @SerializedName("Type")
            private String Type;

            public String getType()
            {
                return Type;
            }

            public void setType(String Type)
            {
                this.Type = Type;
            }
        }

        public static class RestartPolicyEntity
        {
            @SerializedName("Name")
            private String Name;
            @SerializedName("MaximumRetryCount")
            private double MaximumRetryCount;

            public String getName()
            {
                return Name;
            }

            public void setName(String Name)
            {
                this.Name = Name;
            }

            public double getMaximumRetryCount()
            {
                return MaximumRetryCount;
            }

            public void setMaximumRetryCount(double MaximumRetryCount)
            {
                this.MaximumRetryCount = MaximumRetryCount;
            }
        }
    }

    public static class GraphDriverEntity
    {
        @SerializedName("Name")
        private String Name;
        @SerializedName("Data")
        private Object Data;

        public String getName()
        {
            return Name;
        }

        public void setName(String Name)
        {
            this.Name = Name;
        }

        public Object getData()
        {
            return Data;
        }

        public void setData(Object Data)
        {
            this.Data = Data;
        }
    }

    public static class ConfigEntity
    {
        @SerializedName("Hostname")
        private String Hostname;
        @SerializedName("Domainname")
        private String Domainname;
        @SerializedName("User")
        private String User;
        @SerializedName("AttachStdin")
        private boolean AttachStdin;
        @SerializedName("AttachStdout")
        private boolean AttachStdout;
        @SerializedName("AttachStderr")
        private boolean AttachStderr;
        /**
         * 443/tcp : {}
         * 80/tcp : {}
         */

        @SerializedName("ExposedPorts")
        private Map ExposedPorts;
        @SerializedName("Tty")
        private boolean Tty;
        @SerializedName("OpenStdin")
        private boolean OpenStdin;
        @SerializedName("StdinOnce")
        private boolean StdinOnce;
        @SerializedName("Image")
        private String Image;
        @SerializedName("Volumes")
        private Object Volumes;
        @SerializedName("WorkingDir")
        private String WorkingDir;
        @SerializedName("Entrypoint")
        private Object Entrypoint;
        @SerializedName("OnBuild")
        private Object OnBuild;
        /**
         * com.docker.swarm.node.id : 6497nvjdw1herdj0r10wsnun5
         * com.docker.swarm.service.id : ckyrbiz5fxjk7ud2zycbujnc6
         * com.docker.swarm.service.name : helloworld
         * com.docker.swarm.task :
         * com.docker.swarm.task.id : 6txj86ya8kz6equqbbstx77v5
         * com.docker.swarm.task.name : helloworld.1
         */

        @SerializedName("Labels")
        private Map Labels;
        @SerializedName("Env")
        private List<String> Env;
        @SerializedName("Cmd")
        private List<String> Cmd;

        public String getHostname()
        {
            return Hostname;
        }

        public void setHostname(String Hostname)
        {
            this.Hostname = Hostname;
        }

        public String getDomainname()
        {
            return Domainname;
        }

        public void setDomainname(String Domainname)
        {
            this.Domainname = Domainname;
        }

        public String getUser()
        {
            return User;
        }

        public void setUser(String User)
        {
            this.User = User;
        }

        public boolean isAttachStdin()
        {
            return AttachStdin;
        }

        public void setAttachStdin(boolean AttachStdin)
        {
            this.AttachStdin = AttachStdin;
        }

        public boolean isAttachStdout()
        {
            return AttachStdout;
        }

        public void setAttachStdout(boolean AttachStdout)
        {
            this.AttachStdout = AttachStdout;
        }

        public boolean isAttachStderr()
        {
            return AttachStderr;
        }

        public void setAttachStderr(boolean AttachStderr)
        {
            this.AttachStderr = AttachStderr;
        }

        public Map getExposedPorts()
        {
            return ExposedPorts;
        }

        public void setExposedPorts(Map ExposedPorts)
        {
            this.ExposedPorts = ExposedPorts;
        }

        public boolean isTty()
        {
            return Tty;
        }

        public void setTty(boolean Tty)
        {
            this.Tty = Tty;
        }

        public boolean isOpenStdin()
        {
            return OpenStdin;
        }

        public void setOpenStdin(boolean OpenStdin)
        {
            this.OpenStdin = OpenStdin;
        }

        public boolean isStdinOnce()
        {
            return StdinOnce;
        }

        public void setStdinOnce(boolean StdinOnce)
        {
            this.StdinOnce = StdinOnce;
        }

        public String getImage()
        {
            return Image;
        }

        public void setImage(String Image)
        {
            this.Image = Image;
        }

        public Object getVolumes()
        {
            return Volumes;
        }

        public void setVolumes(Object Volumes)
        {
            this.Volumes = Volumes;
        }

        public String getWorkingDir()
        {
            return WorkingDir;
        }

        public void setWorkingDir(String WorkingDir)
        {
            this.WorkingDir = WorkingDir;
        }

        public Object getEntrypoint()
        {
            return Entrypoint;
        }

        public void setEntrypoint(Object Entrypoint)
        {
            this.Entrypoint = Entrypoint;
        }

        public Object getOnBuild()
        {
            return OnBuild;
        }

        public void setOnBuild(Object OnBuild)
        {
            this.OnBuild = OnBuild;
        }

        public Map getLabels()
        {
            return Labels;
        }

        public void setLabels(Map Labels)
        {
            this.Labels = Labels;
        }

        public List<String> getEnv()
        {
            return Env;
        }

        public void setEnv(List<String> Env)
        {
            this.Env = Env;
        }

        public List<String> getCmd()
        {
            return Cmd;
        }

        public void setCmd(List<String> Cmd)
        {
            this.Cmd = Cmd;
        }


    }

    public static class NetworkSettingsEntity
    {
        @SerializedName("Bridge")
        private String Bridge;
        @SerializedName("SandboxID")
        private String SandboxID;
        @SerializedName("HairpinMode")
        private boolean HairpinMode;
        @SerializedName("LinkLocalIPv6Address")
        private String LinkLocalIPv6Address;
        @SerializedName("LinkLocalIPv6PrefixLen")
        private double LinkLocalIPv6PrefixLen;
        /**
         * 443/tcp : null
         * 80/tcp : null
         */

        @SerializedName("Ports")
        private Map Ports;
        @SerializedName("SandboxKey")
        private String SandboxKey;
        @SerializedName("SecondaryIPAddresses")
        private Object SecondaryIPAddresses;
        @SerializedName("SecondaryIPv6Addresses")
        private Object SecondaryIPv6Addresses;
        @SerializedName("EndpointID")
        private String EndpointID;
        @SerializedName("Gateway")
        private String Gateway;
        @SerializedName("GlobalIPv6Address")
        private String GlobalIPv6Address;
        @SerializedName("GlobalIPv6PrefixLen")
        private double GlobalIPv6PrefixLen;
        @SerializedName("IPAddress")
        private String IPAddress;
        @SerializedName("IPPrefixLen")
        private double IPPrefixLen;
        @SerializedName("IPv6Gateway")
        private String IPv6Gateway;
        @SerializedName("MacAddress")
        private String MacAddress;
        /**
         * ingress : {"IPAMConfig":{"IPv4Address":"10.255.0.2"},"Links":null,"Aliases":["b99dcef30a71"],"NetworkID":"4ut8m1g01sw5klqlbio47e7h4","EndpointID":"abe2e4f90d582791a1b31439ff458843f4cb07678e9ccd830163e34b56e25072","Gateway":"","IPAddress":"10.255.0.2","IPPrefixLen":16,"IPv6Gateway":"","GlobalIPv6Address":"","GlobalIPv6PrefixLen":0,"MacAddress":"02:42:0a:ff:00:02"}
         */

        @SerializedName("Networks")
        private NetworksEntity Networks;

        public String getBridge()
        {
            return Bridge;
        }

        public void setBridge(String Bridge)
        {
            this.Bridge = Bridge;
        }

        public String getSandboxID()
        {
            return SandboxID;
        }

        public void setSandboxID(String SandboxID)
        {
            this.SandboxID = SandboxID;
        }

        public boolean isHairpinMode()
        {
            return HairpinMode;
        }

        public void setHairpinMode(boolean HairpinMode)
        {
            this.HairpinMode = HairpinMode;
        }

        public String getLinkLocalIPv6Address()
        {
            return LinkLocalIPv6Address;
        }

        public void setLinkLocalIPv6Address(String LinkLocalIPv6Address)
        {
            this.LinkLocalIPv6Address = LinkLocalIPv6Address;
        }

        public double getLinkLocalIPv6PrefixLen()
        {
            return LinkLocalIPv6PrefixLen;
        }

        public void setLinkLocalIPv6PrefixLen(double LinkLocalIPv6PrefixLen)
        {
            this.LinkLocalIPv6PrefixLen = LinkLocalIPv6PrefixLen;
        }

        public Map getPorts()
        {
            return Ports;
        }

        public void setPorts(Map Ports)
        {
            this.Ports = Ports;
        }

        public String getSandboxKey()
        {
            return SandboxKey;
        }

        public void setSandboxKey(String SandboxKey)
        {
            this.SandboxKey = SandboxKey;
        }

        public Object getSecondaryIPAddresses()
        {
            return SecondaryIPAddresses;
        }

        public void setSecondaryIPAddresses(Object SecondaryIPAddresses)
        {
            this.SecondaryIPAddresses = SecondaryIPAddresses;
        }

        public Object getSecondaryIPv6Addresses()
        {
            return SecondaryIPv6Addresses;
        }

        public void setSecondaryIPv6Addresses(Object SecondaryIPv6Addresses)
        {
            this.SecondaryIPv6Addresses = SecondaryIPv6Addresses;
        }

        public String getEndpointID()
        {
            return EndpointID;
        }

        public void setEndpointID(String EndpointID)
        {
            this.EndpointID = EndpointID;
        }

        public String getGateway()
        {
            return Gateway;
        }

        public void setGateway(String Gateway)
        {
            this.Gateway = Gateway;
        }

        public String getGlobalIPv6Address()
        {
            return GlobalIPv6Address;
        }

        public void setGlobalIPv6Address(String GlobalIPv6Address)
        {
            this.GlobalIPv6Address = GlobalIPv6Address;
        }

        public double getGlobalIPv6PrefixLen()
        {
            return GlobalIPv6PrefixLen;
        }

        public void setGlobalIPv6PrefixLen(double GlobalIPv6PrefixLen)
        {
            this.GlobalIPv6PrefixLen = GlobalIPv6PrefixLen;
        }

        public String getIPAddress()
        {
            return IPAddress;
        }

        public void setIPAddress(String IPAddress)
        {
            this.IPAddress = IPAddress;
        }

        public double getIPPrefixLen()
        {
            return IPPrefixLen;
        }

        public void setIPPrefixLen(double IPPrefixLen)
        {
            this.IPPrefixLen = IPPrefixLen;
        }

        public String getIPv6Gateway()
        {
            return IPv6Gateway;
        }

        public void setIPv6Gateway(String IPv6Gateway)
        {
            this.IPv6Gateway = IPv6Gateway;
        }

        public String getMacAddress()
        {
            return MacAddress;
        }

        public void setMacAddress(String MacAddress)
        {
            this.MacAddress = MacAddress;
        }

        public NetworksEntity getNetworks()
        {
            return Networks;
        }

        public void setNetworks(NetworksEntity Networks)
        {
            this.Networks = Networks;
        }

        public static class Map
        {
            @SerializedName("443/tcp")
            private Object value443;
            @SerializedName("80/tcp")
            private Object value80;

            public Object getValue443()
            {
                return value443;
            }

            public void setValue443(Object value443)
            {
                this.value443 = value443;
            }

            public Object getValue80()
            {
                return value80;
            }

            public void setValue80(Object value80)
            {
                this.value80 = value80;
            }
        }

        public static class NetworksEntity
        {
            /**
             * IPAMConfig : {"IPv4Address":"10.255.0.2"}
             * Links : null
             * Aliases : ["b99dcef30a71"]
             * NetworkID : 4ut8m1g01sw5klqlbio47e7h4
             * EndpointID : abe2e4f90d582791a1b31439ff458843f4cb07678e9ccd830163e34b56e25072
             * Gateway :
             * IPAddress : 10.255.0.2
             * IPPrefixLen : 16.0
             * IPv6Gateway :
             * GlobalIPv6Address :
             * GlobalIPv6PrefixLen : 0.0
             * MacAddress : 02:42:0a:ff:00:02
             */

            @SerializedName("ingress")
            private IngressEntity ingress;

            public IngressEntity getIngress()
            {
                return ingress;
            }

            public void setIngress(IngressEntity ingress)
            {
                this.ingress = ingress;
            }

            public static class IngressEntity
            {
                /**
                 * IPv4Address : 10.255.0.2
                 */

                @SerializedName("IPAMConfig")
                private IPAMConfigEntity IPAMConfig;
                @SerializedName("Links")
                private Object Links;
                @SerializedName("NetworkID")
                private String NetworkID;
                @SerializedName("EndpointID")
                private String EndpointID;
                @SerializedName("Gateway")
                private String Gateway;
                @SerializedName("IPAddress")
                private String IPAddress;
                @SerializedName("IPPrefixLen")
                private double IPPrefixLen;
                @SerializedName("IPv6Gateway")
                private String IPv6Gateway;
                @SerializedName("GlobalIPv6Address")
                private String GlobalIPv6Address;
                @SerializedName("GlobalIPv6PrefixLen")
                private double GlobalIPv6PrefixLen;
                @SerializedName("MacAddress")
                private String MacAddress;
                @SerializedName("Aliases")
                private List<String> Aliases;

                public IPAMConfigEntity getIPAMConfig()
                {
                    return IPAMConfig;
                }

                public void setIPAMConfig(IPAMConfigEntity IPAMConfig)
                {
                    this.IPAMConfig = IPAMConfig;
                }

                public Object getLinks()
                {
                    return Links;
                }

                public void setLinks(Object Links)
                {
                    this.Links = Links;
                }

                public String getNetworkID()
                {
                    return NetworkID;
                }

                public void setNetworkID(String NetworkID)
                {
                    this.NetworkID = NetworkID;
                }

                public String getEndpointID()
                {
                    return EndpointID;
                }

                public void setEndpointID(String EndpointID)
                {
                    this.EndpointID = EndpointID;
                }

                public String getGateway()
                {
                    return Gateway;
                }

                public void setGateway(String Gateway)
                {
                    this.Gateway = Gateway;
                }

                public String getIPAddress()
                {
                    return IPAddress;
                }

                public void setIPAddress(String IPAddress)
                {
                    this.IPAddress = IPAddress;
                }

                public double getIPPrefixLen()
                {
                    return IPPrefixLen;
                }

                public void setIPPrefixLen(double IPPrefixLen)
                {
                    this.IPPrefixLen = IPPrefixLen;
                }

                public String getIPv6Gateway()
                {
                    return IPv6Gateway;
                }

                public void setIPv6Gateway(String IPv6Gateway)
                {
                    this.IPv6Gateway = IPv6Gateway;
                }

                public String getGlobalIPv6Address()
                {
                    return GlobalIPv6Address;
                }

                public void setGlobalIPv6Address(String GlobalIPv6Address)
                {
                    this.GlobalIPv6Address = GlobalIPv6Address;
                }

                public double getGlobalIPv6PrefixLen()
                {
                    return GlobalIPv6PrefixLen;
                }

                public void setGlobalIPv6PrefixLen(double GlobalIPv6PrefixLen)
                {
                    this.GlobalIPv6PrefixLen = GlobalIPv6PrefixLen;
                }

                public String getMacAddress()
                {
                    return MacAddress;
                }

                public void setMacAddress(String MacAddress)
                {
                    this.MacAddress = MacAddress;
                }

                public List<String> getAliases()
                {
                    return Aliases;
                }

                public void setAliases(List<String> Aliases)
                {
                    this.Aliases = Aliases;
                }

                public static class IPAMConfigEntity
                {
                    @SerializedName("IPv4Address")
                    private String IPv4Address;

                    public String getIPv4Address()
                    {
                        return IPv4Address;
                    }

                    public void setIPv4Address(String IPv4Address)
                    {
                        this.IPv4Address = IPv4Address;
                    }
                }
            }
        }
    }
}
