package com.example.teodora.shoppingapp;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class TshirtsActivity extends AppCompatActivity {

    ListView mylistView;
    int[] images = {R.drawable.tshirt1,R.drawable.tshirt2,R.drawable.thirts3,R.drawable.tshirt4,
            R.drawable.tshirt5,R.drawable.tshirt6,R.drawable.tshirt7,
            R.drawable.tshirt8,R.drawable.tshirt9,R.drawable.tshirt10};
    String[] prices={"25.5lei","30.5lei","60lei","30.5lei","60lei","19.5lei","35lei","25.5lei","30.5lei","40lei"};
    String[] descriptions={"Simple T-shirt for men","Smile T-shirt for men","Funny Panda T-shirt","Tea Women T-shirt","Google T-shirt","Men Simple T-shirt","Queen T-shirt for Women","Sad/Happy T-shirt","Tea Women T-shirt","Bazinga T-shirt"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tshirts);

        Resources res = getResources();
        mylistView = (ListView) findViewById(R.id.ListViewTshirts);

        CustomAdapter adapter = new CustomAdapter();
        mylistView.setAdapter(adapter);

        mylistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent showList = new Intent(getApplicationContext(),MainActivity.class);
                showList.putExtra("com.example.teodora.itemIndex",position);
                startActivity(showList);
            }
        });
    }
    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return prices[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.mylayoutforthelist,null);
            ImageView imagev = (ImageView)convertView.findViewById(R.id.myImageView);
            TextView textViewStore = (TextView) convertView.findViewById(R.id.myTextView);
            TextView textViewDescription = (TextView) convertView.findViewById(R.id.TextViewDescription);
            imagev.setImageResource(images[position]);
            textViewStore.setText(prices[position]);
            textViewDescription.setText(descriptions[position]);
            return convertView;
        }
    }
}
