package com.app.ray.demoimageview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private boolean b = true;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String s = "The image will be changed, when you click the image.";
        TextView textView = (TextView) this.findViewById(R.id.txt);
        textView.setText(s);
        textView.setTextSize(18);

        imageView = (ImageView) this.findViewById(R.id.img);
        imageView.setImageResource(R.mipmap.ic_launcher);
        imageView.setOnClickListener(this); // setting a listener

    }

    @Override
    public void onClick(View view) {
        /** do some thing at here **/
        if (b) {
            imageView.setImageResource(R.drawable.ic_android_black_24dp);
        } else {
            imageView.setImageResource(R.mipmap.ic_launcher);
        }
        b = !b;
    }
}
