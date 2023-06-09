package kh.edu.rupp.fe.visitme.api.service;

import java.util.List;

import kh.edu.rupp.fe.visitme.api.model.Province;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("/provinces.json")
    Call<List<Province>> loadProvinceList();

}
