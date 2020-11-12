package com.example.lesson_2b_2020;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MainActivity extends AppCompatActivity {


    private static List<String> images=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button= this.findViewById(R.id.button1);

        final ImageView imageView=this.findViewById(R.id.pictureView);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Loading image....", Toast.LENGTH_SHORT).show();

                Picasso.get().load(getRandomPicture()).into(imageView);




            }
        });

    }
    static{
        images.add("http://i.imgur.com/DvpvklR.png");
        images.add("https://via.placeholder.com/468x900?text=Android+Mobile+Developement");
        images.add("https://images.fineartamerica.com/images-medium-large-5/bahamas-scene-vertical-bob-sample.jpg");
        images.add("https://media.gettyimages.com/vectors/vertical-design-layout-template-polygonal-orange-and-yellow-sample-vector-id501195367");



    }


    private static String getRandomPicture(){
        Random r=new Random();
        return images.get(r.nextInt(images.size()));

    }

}