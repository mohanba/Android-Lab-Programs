package nmit.mohan.com.camerasdcard;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    final Integer CAMERA_REQUEST=1;
    ImageView imageView;
    Button take,view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= (ImageView) findViewById(R.id.iv);
        take= (Button) findViewById(R.id.takePic);
        view= (Button) findViewById(R.id.viewPic);

        take.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                File pictureDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
                String PictureName=getPictureName();
                File imageFile=new File (pictureDirectory,PictureName);
                Uri pictureUri=Uri.fromFile(imageFile);
                intent.putExtra(MediaStore.EXTRA_OUTPUT,pictureUri);
                startActivityForResult(intent,CAMERA_REQUEST);
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Second.class);
                startActivity(i);
            }
        });
    }

    private String getPictureName() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd_HHmmss");
        String timestamp=sdf.format(new Date());
        return "IMG"+timestamp+".jpg";
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            if(requestCode==CAMERA_REQUEST){
//                Bitmap img=(Bitmap) data.getExtras().get("data");
//                imageView.setImageBitmap(img);
            }
        }
    }
}
