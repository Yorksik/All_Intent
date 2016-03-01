package cybersoft.all_intent;

        import android.content.Intent;
        import android.net.Uri;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class Main extends AppCompatActivity {
Button bCALL;
Button bMAP;
Button bWEB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        bCALL = (Button) findViewById(R.id.bCALL);
        bMAP = (Button) findViewById(R.id.bMAP);
        bWEB = (Button) findViewById(R.id.bWEB);

        bWEB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.android.com/") );
                startActivity(intent);
            }
        });
        bMAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:20.5525556, 41.5525556"));
                startActivity(intent);
            }
        });
        bCALL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:12345"));
                startActivity(intent);
            }
        });
    }

    public void goToMyBtouser(View view) {
        Button ToBrous = (Button) findViewById(R.id.ToBrous);
        Intent intent = new Intent(getApplicationContext(),MyBrous.class);
        startActivity(intent);
    }
}
