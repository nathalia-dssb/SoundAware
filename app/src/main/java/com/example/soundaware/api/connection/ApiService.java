package com.example.soundaware.api.connection;

import com.example.soundaware.api.models.audio.AudioResponse;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {
    @Multipart
    @POST("audio")
    Call<AudioResponse> uploadAudio(
            @Part MultipartBody.Part file
    );
}