package com.example.apitest.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Meta implements Serializable {

    @SerializedName("initDataYn")
    private String initDataYn;

    @SerializedName("pushYn")
    private String pushYn;

}