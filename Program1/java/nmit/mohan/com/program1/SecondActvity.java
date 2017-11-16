package nmit.mohan.com.program1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActvity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_actvity);
        text = (TextView) findViewById(R.id.txt);

        String value = getIntent().getStringExtra("key");

        text.setText(value);

        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(SecondActvity.this);
        myAlertBuilder.setTitle("Nitte rocks");
        myAlertBuilder.setMessage(value);
        myAlertBuilder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                SecondActvity.this.finish();
            }
        });
        myAlertBuilder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert = myAlertBuilder.create();
        alert.show();


    }
}
