package com.example.articles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView articlesList=findViewById(R.id.list_view);
        articlesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                //TextView textView=(TextView) view;
                //String selectedItem=(String) textView.getText();
                String selectedItem=(String) parent.getItemAtPosition(position);
                String info ="Some info about "+ selectedItem;


                Intent intent=new Intent(view.getContext(), InfoActivity.class);
                intent.putExtra("title", selectedItem);
                intent.putExtra("info", info);
                startActivity(intent);

            }
        });
    }

//    public void onButtonClick(View view){
//        Button button = (Button) view;
//
//        Intent intent=new Intent(this, InfoActivity.class);
//
//
//        int id = button.getId();
//        if (id == R.id.buttonArticle1) {
//            intent.putExtra("title", "article1");
//            intent.putExtra("info", "article1 Info");
//        } else if (id == R.id.buttonArticle2) {
//            intent.putExtra("title", "article2");
//            intent.putExtra("info", "article2 Info");
//        }
//        startActivity(intent);
//
//
//    }
}