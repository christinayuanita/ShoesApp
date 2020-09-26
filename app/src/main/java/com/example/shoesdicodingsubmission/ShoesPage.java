package com.example.shoesdicodingsubmission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ShoesPage extends AppCompatActivity {

    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_SIZE = "extra_size";
    public static final String EXTRA_TYPE = "extra_type";
    public static final String EXTRA_PRICE = "extra_price";
    public static final String EXTRA_PHOTO = "extra_photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoes_page);

        ImageView imgShoes = findViewById(R.id.img_shoes);
        TextView priceShoes = findViewById(R.id.price_shoes);
        TextView typeShoes = findViewById(R.id.type_shoes);
        TextView sizeShoes = findViewById(R.id.size_shoes);
        TextView detailShoes = findViewById(R.id.detail_shoes);
        TextView nameShoes = findViewById(R.id.name_shoes);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        String size = getIntent().getStringExtra(EXTRA_SIZE);
        String type = getIntent().getStringExtra(EXTRA_TYPE);
        double price = getIntent().getDoubleExtra(EXTRA_PRICE, 0);
        int photo = getIntent().getIntExtra(EXTRA_PHOTO, 0);

        priceShoes.setText("$" + price);
        typeShoes.setText(type);
        sizeShoes.setText(size);
        detailShoes.setText(detail);
        nameShoes.setText(name);
        imgShoes.setImageResource(photo);

    }
}