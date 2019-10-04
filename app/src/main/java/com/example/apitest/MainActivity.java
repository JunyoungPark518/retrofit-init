package com.example.apitest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.apitest.api.APIClient;
import com.example.apitest.api.APIInterface;
import com.example.apitest.model.Meta;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    APIInterface api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textview1);
        api = APIClient.getClient().create(APIInterface.class);

        Call<Meta> metaCall = api.getMeta("android", "1.0.0");
        metaCall.enqueue(new Callback<Meta>() {
            @Override
            public void onResponse(Call<Meta> call, Response<Meta> response) {
                Meta meta = response.body();
                tv.setText(meta.toString());
            }

            @Override
            public void onFailure(Call<Meta> call, Throwable t) {
                System.out.println(t.getStackTrace());
                tv.setText("Fail!!!");
            }
        });
    }
}
