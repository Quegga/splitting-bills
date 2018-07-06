package queggainc.splittingbills;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        final Button button2 = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button2.setEnabled(true);
                button.setEnabled(false);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button2.setEnabled(false);
                button.setEnabled(true);
            }
        });

    }
}
