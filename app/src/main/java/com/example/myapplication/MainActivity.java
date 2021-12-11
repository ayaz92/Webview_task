package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();


        binding.webview.loadUrl("https://verginelectric.com/");


        binding.webview.getSettings().setJavaScriptEnabled(true); //for wa web
        binding.webview.getSettings().setAllowContentAccess(true); // for camera
        binding.webview.getSettings().setAllowFileAccess(true);
        binding.webview.getSettings().setAllowFileAccessFromFileURLs(true);
        binding.webview.getSettings().setAllowUniversalAccessFromFileURLs(true);
        binding.webview.getSettings().setMediaPlaybackRequiresUserGesture(false); //for audio messages

        binding.webview.getSettings().setDomStorageEnabled(true); //for html5 app
        binding.webview.getSettings().setDatabaseEnabled(true);
        binding.webview.getSettings().setAppCacheEnabled(false); // deprecated
        binding.webview.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);

        binding.webview.getSettings().setLoadWithOverviewMode(true);
        binding.webview.getSettings().setUseWideViewPort(true);

        binding.webview.getSettings().setSupportZoom(true);
        binding.webview.getSettings().setBuiltInZoomControls(true);
        binding.webview.getSettings().setDisplayZoomControls(false);

        binding.webview.getSettings().setSaveFormData(true);
        binding.webview.getSettings().setLoadsImagesAutomatically(true);
        binding.webview.getSettings().setBlockNetworkImage(false);
        binding.webview.getSettings().setBlockNetworkLoads(false);
        binding.webview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        binding.webview.getSettings().setNeedInitialFocus(false);
        binding.webview.getSettings().setGeolocationEnabled(true);
        binding.webview.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);

        binding.webview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        binding.webview.setScrollbarFadingEnabled(true);


    }
}