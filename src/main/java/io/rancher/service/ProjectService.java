package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Project;
import io.rancher.type.Account;
import io.rancher.type.Agent;
import io.rancher.type.Backup;
import io.rancher.type.Certificate;
import io.rancher.type.Credential;
import io.rancher.type.Environment;
import io.rancher.type.Host;
import io.rancher.type.Image;
import io.rancher.type.Instance;
import io.rancher.type.Label;
import io.rancher.type.Mount;
import io.rancher.type.Network;
import io.rancher.type.Port;
import io.rancher.type.Service;
import io.rancher.type.SetProjectMembersInput;
import io.rancher.type.Snapshot;
import io.rancher.type.Volume;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface ProjectService {

  @GET("project")
  Call<TypeCollection<Project>> list();

  @GET("project")
  Call<TypeCollection<Project>> list(@QueryMap Filters<String, String> filters);

  @GET("project/{id}")
  Call<Project> get(@Path("id") String id);

  @POST("project")
  Call<Project> create(@Body Project project);

  @PUT("project/{id}")
  Call<Project> update(@Path("id") String id, @Body Project project);

  @DELETE("project/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("project/{id}?action=activate")
  Call<Account> activate(@Path("id") String id);
  
  @POST("project/{id}?action=deactivate")
  Call<Account> deactivate(@Path("id") String id);
  
  @POST("project/{id}?action=purge")
  Call<Account> purge(@Path("id") String id);
  
  @POST("project/{id}?action=remove")
  Call<Account> remove(@Path("id") String id);
  
  @POST("project/{id}?action=restore")
  Call<Account> restore(@Path("id") String id);
  
  @POST("project/{id}?action=setmembers")
  Call<SetProjectMembersInput> setmembers(@Path("id") String id, @Body SetProjectMembersInput setProjectMembersInput);
  

  
  @GET
  Call<TypeCollection<Agent>> getLinkAgents(@Url String url );
  
  @GET
  Call<TypeCollection<Backup>> getLinkBackups(@Url String url );
  
  @GET
  Call<TypeCollection<Certificate>> getLinkCertificates(@Url String url );
  
  @GET
  Call<TypeCollection<Credential>> getLinkCredentials(@Url String url );
  
  @GET
  Call<TypeCollection<Environment>> getLinkEnvironments(@Url String url );
  
  @GET
  Call<TypeCollection<Host>> getLinkHosts(@Url String url );
  
  @GET
  Call<TypeCollection<Image>> getLinkImages(@Url String url );
  
  @GET
  Call<TypeCollection<Instance>> getLinkInstances(@Url String url );
  
  @GET
  Call<TypeCollection<Label>> getLinkLabels(@Url String url );
  
  @GET
  Call<TypeCollection<Mount>> getLinkMounts(@Url String url );
  
  @GET
  Call<TypeCollection<Network>> getLinkNetworks(@Url String url );
  
  @GET
  Call<TypeCollection<Port>> getLinkPorts(@Url String url );
  
  @GET
  Call<TypeCollection<Service>> getLinkServices(@Url String url );
  
  @GET
  Call<TypeCollection<Snapshot>> getLinkSnapshots(@Url String url );
  
  @GET
  Call<TypeCollection<Volume>> getLinkVolumes(@Url String url );
  
}
