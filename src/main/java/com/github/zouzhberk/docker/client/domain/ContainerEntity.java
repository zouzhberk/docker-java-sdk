package com.github.zouzhberk.docker.client.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

/**
 * Created by zouzhberk on 9/20/16.
 */
public class ContainerEntity
{

    /**
     * Id : 380d39631a06e258b86a0e51e030076d13fd280a90bc1a65958c52fac6231329
     * Names : ["/helloworld.1.b356quvy1l1c5ch9w2s9wfmzo"]
     * Image : nginx:latest
     * ImageID : sha256:4a88d06e26f40b14f702c65c5915bd8e18600520352fa49ece8b5052db0e76fd
     * Command : nginx -g 'daemon off;'
     * Created : 1.47437685E9
     * Ports : [{"PrivatePort":443,"Type":"tcp"},{"PrivatePort":80,"Type":"tcp"}]
     * Labels : {"com.docker.swarm.node.id":"6497nvjdw1herdj0r10wsnun5","com.docker.swarm.service.id":"ckyrbiz5fxjk7ud2zycbujnc6","com.docker.swarm.service.name":"helloworld","com.docker.swarm.task":"","com.docker.swarm.task.id":"b356quvy1l1c5ch9w2s9wfmzo","com.docker.swarm.task.name":"helloworld.1"}
     * State : running
     * Status : Up 2 hours
     * HostConfig : {"NetworkMode":"default"}
     * NetworkSettings : {"Networks":{"ingress":{"IPAMConfig":{"IPv4Address":"10.255.0.2"},"NetworkID":"4ut8m1g01sw5klqlbio47e7h4","EndpointID":"0613673fd9ab16ae100263580001a748219599c0fb4b07ded571caf4035d6095","Gateway":"","IPAddress":"10.255.0.2","IPPrefixLen":16,"IPv6Gateway":"","GlobalIPv6Address":"","GlobalIPv6PrefixLen":0,"MacAddress":"02:42:0a:ff:00:02"}}}
     * Mounts : []
     */

    @SerializedName("Id")
    private String id;
    @SerializedName("Image")
    private String image;
    @SerializedName("ImageID")
    private String imageID;
    @SerializedName("Command")
    private String command;
    @SerializedName("Created")
    private double created;
    /**
     * com.docker.swarm.node.id : 6497nvjdw1herdj0r10wsnun5
     * com.docker.swarm.service.id : ckyrbiz5fxjk7ud2zycbujnc6
     * com.docker.swarm.service.name : helloworld
     * com.docker.swarm.task :
     * com.docker.swarm.task.id : b356quvy1l1c5ch9w2s9wfmzo
     * com.docker.swarm.task.name : helloworld.1
     */

    @SerializedName("Labels")
    private Map<String, String> labels;
    /**
     * Names : ["/helloworld.1.b356quvy1l1c5ch9w2s9wfmzo"]
     * Ports : [{"PrivatePort":443,"Type":"tcp"},{"PrivatePort":80,"Type":"tcp"}]
     * State : running
     * Status : Up 2 hours
     * HostConfig : {"NetworkMode":"default"}
     * NetworkSettings : {"Networks":{"ingress":{"IPAMConfig":{"IPv4Address":"10.255.0.2"},"NetworkID":"4ut8m1g01sw5klqlbio47e7h4","EndpointID":"0613673fd9ab16ae100263580001a748219599c0fb4b07ded571caf4035d6095","Gateway":"","IPAddress":"10.255.0.2","IPPrefixLen":16,"IPv6Gateway":"","GlobalIPv6Address":"","GlobalIPv6PrefixLen":0,"MacAddress":"02:42:0a:ff:00:02"}}}
     * Mounts : []
     */

    @SerializedName("State")
    private String State;
    @SerializedName("Status")
    private String Status;
    /**
     * NetworkMode : default
     */

    @SerializedName("HostConfig")
    private HostConfigEntity HostConfig;
    /**
     * Networks : {"ingress":{"IPAMConfig":{"IPv4Address":"10.255.0.2"},"NetworkID":"4ut8m1g01sw5klqlbio47e7h4","EndpointID":"0613673fd9ab16ae100263580001a748219599c0fb4b07ded571caf4035d6095","Gateway":"","IPAddress":"10.255.0.2","IPPrefixLen":16,"IPv6Gateway":"","GlobalIPv6Address":"","GlobalIPv6PrefixLen":0,"MacAddress":"02:42:0a:ff:00:02"}}
     */

    @SerializedName("NetworkSettings")
    private NetworkSettingsEntity NetworkSettings;
    @SerializedName("Names")
    private List<String> Names;
    /**
     * PrivatePort : 443.0
     * Type : tcp
     */

    @SerializedName("Ports")
    private List<PortsEntity> Ports;
    @SerializedName("Mounts")
    private List<?> Mounts;

    public String getState()
    {
        return State;
    }

    public void setState(String State)
    {
        this.State = State;
    }

    public String getStatus()
    {
        return Status;
    }

    public void setStatus(String Status)
    {
        this.Status = Status;
    }

    public HostConfigEntity getHostConfig()
    {
        return HostConfig;
    }

    public void setHostConfig(HostConfigEntity HostConfig)
    {
        this.HostConfig = HostConfig;
    }

    public NetworkSettingsEntity getNetworkSettings()
    {
        return NetworkSettings;
    }

    public void setNetworkSettings(NetworkSettingsEntity NetworkSettings)
    {
        this.NetworkSettings = NetworkSettings;
    }

    public List<String> getNames()
    {
        return Names;
    }

    public void setNames(List<String> Names)
    {
        this.Names = Names;
    }

    public List<PortsEntity> getPorts()
    {
        return Ports;
    }

    public void setPorts(List<PortsEntity> Ports)
    {
        this.Ports = Ports;
    }

    public List<?> getMounts()
    {
        return Mounts;
    }

    public void setMounts(List<?> Mounts)
    {
        this.Mounts = Mounts;
    }

    public static class HostConfigEntity
    {
        @SerializedName("NetworkMode")
        private String NetworkMode;

        public String getNetworkMode()
        {
            return NetworkMode;
        }

        public void setNetworkMode(String NetworkMode)
        {
            this.NetworkMode = NetworkMode;
        }
    }

    public static class NetworkSettingsEntity
    {
        /**
         * ingress : {"IPAMConfig":{"IPv4Address":"10.255.0.2"},"NetworkID":"4ut8m1g01sw5klqlbio47e7h4","EndpointID":"0613673fd9ab16ae100263580001a748219599c0fb4b07ded571caf4035d6095","Gateway":"","IPAddress":"10.255.0.2","IPPrefixLen":16,"IPv6Gateway":"","GlobalIPv6Address":"","GlobalIPv6PrefixLen":0,"MacAddress":"02:42:0a:ff:00:02"}
         */

        @SerializedName("Networks")
        private NetworksEntity Networks;

        public NetworksEntity getNetworks()
        {
            return Networks;
        }

        public void setNetworks(NetworksEntity Networks)
        {
            this.Networks = Networks;
        }

        public static class NetworksEntity
        {
            /**
             * IPAMConfig : {"IPv4Address":"10.255.0.2"}
             * NetworkID : 4ut8m1g01sw5klqlbio47e7h4
             * EndpointID : 0613673fd9ab16ae100263580001a748219599c0fb4b07ded571caf4035d6095
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

                public IPAMConfigEntity getIPAMConfig()
                {
                    return IPAMConfig;
                }

                public void setIPAMConfig(IPAMConfigEntity IPAMConfig)
                {
                    this.IPAMConfig = IPAMConfig;
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

    public static class PortsEntity
    {
        @SerializedName("PrivatePort")
        private double PrivatePort;
        @SerializedName("Type")
        private String Type;

        public double getPrivatePort()
        {
            return PrivatePort;
        }

        public void setPrivatePort(double PrivatePort)
        {
            this.PrivatePort = PrivatePort;
        }

        public String getType()
        {
            return Type;
        }

        public void setType(String Type)
        {
            this.Type = Type;
        }
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("ContainerEntity{");
        sb.append("id='").append(id).append('\'');
        sb.append(", image='").append(image).append('\'');
        sb.append(", imageID='").append(imageID).append('\'');
        sb.append(", command='").append(command).append('\'');
        sb.append(", created=").append(created);
        sb.append(", labels=").append(labels);
        sb.append(", State='").append(State).append('\'');
        sb.append(", Status='").append(Status).append('\'');
        sb.append(", HostConfig=").append(HostConfig);
        sb.append(", NetworkSettings=").append(NetworkSettings);
        sb.append(", Names=").append(Names);
        sb.append(", Ports=").append(Ports);
        sb.append(", Mounts=").append(Mounts);
        sb.append('}');
        return sb.toString();
    }
}
