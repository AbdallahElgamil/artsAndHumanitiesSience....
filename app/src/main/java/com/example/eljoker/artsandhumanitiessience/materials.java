package com.example.eljoker.artsandhumanitiessience;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class materials extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materials);
        WebView webView = (WebView)findViewById(R.id.wv);
        webView.loadUrl(getIntent().getExtras().getString("url"));
    }
}
