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
public class User implements Serializable {

    @SerializedName("gender")
    private String gender;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName("message")
    private String message;
}