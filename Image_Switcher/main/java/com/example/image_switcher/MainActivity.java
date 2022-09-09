package com.example.image_switcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {
    Button prev,next;
    ImageSwitcher iswitcher;
    Integer[]
            images={R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4};
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prev=findViewById(R.id.prev);
        next=findViewById(R.id.next);
        iswitcher=findViewById(R.id.iswitcher);
        iswitcher.setFactory(new ViewSwitcher.ViewFactory() {
            public View makeView() {
                ImageView image=new ImageView(getApplicationContext());

                image.setScaleType(ImageView.ScaleType.FIT_CENTER);
                image.setLayoutParams(new
                        ImageSwitcher.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT));
                return image;
            }
        });
        Animation in = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.in);
        Animation out=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.out);
        iswitcher.setInAnimation(in);
        iswitcher.setOutAnimation(out);
        prev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(i>0)
                {
                    i--;
                    iswitcher.setImageResource(images[i]);
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (i < images.length - 1)
                {
                    i++;
                    iswitcher.setImageResource(images[i]);
                }
            }
        });
    }
}