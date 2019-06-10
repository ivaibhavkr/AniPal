package com.fnatic.android.anipal;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class SignUpActivity extends AppCompatActivity {

    Button button;
    static final int CAM_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void back(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

//    public void logIn(View view) {
//        button = (Button) findViewById(R.id.login);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                File file = getFile();
//                camera_intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
//                startActivityForResult(camera_intent, CAM_REQUEST);
//            }
//        });
//        //Intent i = new Intent(this, DescriptionActivity.class);
//        //startActivity(i);
//
//    }


    private File getFile() {
        File folder = new File("sdcard/camera_app");
        if (!folder.exists())
            folder.mkdir();
        File image_file = new File(folder, "cam_image.jpg");
        return image_file;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String _path = Environment.getExternalStorageDirectory() + File.separator + "make_machine_example.jpg";
    }
}
