package cybersoft.all_intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.Toast;

public class MyBrous extends AppCompatActivity {



    public static String PRE_GOOGLE = "https://www.google.com.ua/#safe=active&q=d";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_brous);




    }



    public void GoogleSearch(View view) {
        WebView webView = (WebView)findViewById(R.id.webView);
        EditText editText =(EditText)findViewById(R.id.editView);
        webView.loadUrl(PRE_GOOGLE + editText.getText().toString());
        Toast.makeText(getApplicationContext(),(PRE_GOOGLE + editText.getText().toString()),Toast.LENGTH_SHORT).show();

    }
}
