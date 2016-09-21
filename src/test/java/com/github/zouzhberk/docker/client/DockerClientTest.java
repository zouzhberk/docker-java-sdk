package com.github.zouzhberk.docker.client;

import com.github.zouzhberk.docker.client.feature.ContainerService;
import com.github.zouzhberk.docker.client.feature.VersionService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.reactivex.Flowable;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * DockerClient Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Sep 20, 2016</pre>
 */
public class DockerClientTest
{

    @Before
    public void before() throws Exception
    {
    }

    @After
    public void after() throws Exception
    {
    }

    private Gson gson = new GsonBuilder().serializeNulls().setPrettyPrinting().create();
    /**
     * Method: create(Class<T> clazz)
     */
    @Test
    public void testCreate() throws Exception
    {
        DockerClient client = DockerClient.Builder.newBuilder().build();
        VersionService service = client.create(VersionService.class);
        service.version().subscribe(value -> {
            System.out.println(value);
        });
        client.create(ContainerService.class).list().map(x -> x.stream()).blockingGet()
                .map(gson::toJson).forEach(value
                -> {
            System.out.println(value);
        });
        client.create(ContainerService.class).top("97cd90793982").subscribe(x -> {
            System.out.println(x);

        });
    }

    /**
     * Method: version(String version)
     */
    @Test
    public void testVersion() throws Exception
    {
//TODO: Test goes here... 
    }

    /**
     * Method: host(String host)
     */
    @Test
    public void testHost() throws Exception
    {
//TODO: Test goes here... 
    }

    /**
     * Method: build()
     */
    @Test
    public void testBuild() throws Exception
    {
//TODO: Test goes here... 
    }


    /**
     * Method: init()
     */
    @Test
    public void testInit() throws Exception
    {
//TODO: Test goes here... 
/* 
try { 
   Method method = DockerClient.getClass().getMethod("init"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

} 
