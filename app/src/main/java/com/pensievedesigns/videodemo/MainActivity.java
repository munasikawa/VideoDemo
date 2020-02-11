package com.pensievedesigns.videodemo;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the video view and convert it into a video view

        VideoView videoView = findViewById(R.id.videoView);

        // assign a video to it, using its path and getting the actual video
        // You can also add online video here, that's being hosted elsewhere

        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.demovideo);

        // set controls to video

        MediaController mediaController = new MediaController(this);

        // attach media controller to our video view using setAnchorView

        mediaController.setAnchorView(videoView);

        // set video view to media controller using setMediaController

        videoView.setMediaController(mediaController);

        //start video

        videoView.start();

    }
}
