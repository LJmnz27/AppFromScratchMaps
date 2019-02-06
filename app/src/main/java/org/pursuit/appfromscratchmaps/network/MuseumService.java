package org.pursuit.appfromscratchmaps.network;

import org.pursuit.appfromscratchmaps.models.Museum;
import org.pursuit.appfromscratchmaps.models.MuseumWrapper;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MuseumService {
    @GET("JDVila/storybook/master/museums.json")
    Call<MuseumWrapper> getMuseums();

    @GET("api/breed/{type}/images/random")
    Call<MuseumWrapper> getPlanetImage(@Path("type") String image);
}
