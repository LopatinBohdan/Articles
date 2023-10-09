package com.example.articles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView title=findViewById(R.id.articleTitle);
        TextView info=findViewById(R.id.articleInfo);

        Bundle arguments=getIntent().getExtras();

        String artTitle="";
        String artInfo="";
        if(arguments!=null){
            artTitle=arguments.get("title").toString();
            artInfo=arguments.get("info").toString();
        }

        title.setText(artTitle);
        info.setText(artInfo);
    }
}