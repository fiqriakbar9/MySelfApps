package com.apps.myselfapps;
  /*

    TANGGAL PENGERJAAN : 29 Mei 2021 - 04 Juni 2021
    NIM     : 10118020
    NAMA    : Fiqri Akbar Pratama
    KELAS   : IF1
    */
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.apps.myselfapps.R;

public class IgActivity extends AppCompatActivity {
    WebView mWebview;
    WebSettings mWebSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ig);

        mWebview = (WebView)findViewById(R.id.wv_ig);

        mWebSettings = mWebview.getSettings();
        mWebview.setWebViewClient(new WebViewClient());
        mWebview.loadUrl("https://www.facebook.com/fiqri.akbar.9849/");

    }
}
