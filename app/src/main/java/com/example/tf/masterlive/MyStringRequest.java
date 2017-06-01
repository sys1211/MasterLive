package com.example.tf.masterlive;

import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.StringRequest;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;

/**
 * Created by TF on 2017/4/26.
 */

public class MyStringRequest extends StringRequest {
    public MyStringRequest(String url, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        this(Method.GET, url, listener, errorListener);
    }

    public MyStringRequest(int method, String url, Response.Listener<String> listener,
                           Response.ErrorListener errorListener) {
        super(method, url, listener, errorListener);
    }

    @Override
    protected Response<String> parseNetworkResponse(NetworkResponse response) {
        String str = null;

        try {
            str = new String(response.data, "utf-8");
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return Response.success(str, HttpHeaderParser.parseCacheHeaders(response));
    }
}
