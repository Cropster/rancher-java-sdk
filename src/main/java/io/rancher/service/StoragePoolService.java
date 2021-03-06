package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.StoragePool;
import io.rancher.type.Account;
import io.rancher.type.Credential;
import io.rancher.type.Host;
import io.rancher.type.Image;
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

public interface StoragePoolService {

  @GET("storagePool")
  Call<TypeCollection<StoragePool>> list();

  @GET("storagePool")
  Call<TypeCollection<StoragePool>> list(@QueryMap Filters<String, String> filters);

  @GET("storagePool/{id}")
  Call<StoragePool> get(@Path("id") String id);

  @POST("storagePool")
  Call<StoragePool> create(@Body StoragePool storagePool);

  @PUT("storagePool/{id}")
  Call<StoragePool> update(@Path("id") String id, @Body StoragePool storagePool);

  @DELETE("storagePool/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("storagePool/{id}?action=activate")
  Call<StoragePool> activate(@Path("id") String id);
  
  @POST("storagePool/{id}?action=deactivate")
  Call<StoragePool> deactivate(@Path("id") String id);
  
  @POST("storagePool/{id}?action=purge")
  Call<StoragePool> purge(@Path("id") String id);
  
  @POST("storagePool/{id}?action=remove")
  Call<StoragePool> remove(@Path("id") String id);
  
  @POST("storagePool/{id}?action=restore")
  Call<StoragePool> restore(@Path("id") String id);
  

  
  @GET
  Call<Account> getLinkAccount(@Url String url );
  
  @GET
  Call<TypeCollection<Credential>> getLinkCredentials(@Url String url );
  
  @GET
  Call<TypeCollection<Host>> getLinkHosts(@Url String url );
  
  @GET
  Call<TypeCollection<Image>> getLinkImages(@Url String url );
  
  @GET
  Call<TypeCollection<Volume>> getLinkVolumes(@Url String url );
  
}
