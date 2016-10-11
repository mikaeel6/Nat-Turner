package click.a1life.natturnerencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    public WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("http://192.168.1.8:1938");
        WebSettings webSettings = webView.getSettings();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

    }
    @Override
    public void onBackPressed () {
        if(webView != null) {
            if(webView.canGoBack()) {
                webView.goBack();
            } else {
                setContentView(R.layout.activity_main);
                webView = null;
            }
        } else {
            super.onBackPressed();
        }
    }
}
