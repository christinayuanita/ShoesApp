package com.example.shoesdicodingsubmission;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.shoesdicodingsubmission.adapter.ListShoesAdapter;
import com.example.shoesdicodingsubmission.model.Shoes;
import com.example.shoesdicodingsubmission.model.ShoesData;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView rvShoes;
    private ArrayList<Shoes> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rvShoes = findViewById(R.id.rv_shoes);
        rvShoes.setHasFixedSize(true);

        list.addAll(ShoesData.getAllShoes());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.action_profile){
            Intent i = new Intent(Home.this, Profile.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    private void showRecyclerList(){
        rvShoes.setLayoutManager(new LinearLayoutManager(this));
        ListShoesAdapter listShoesAdapter = new ListShoesAdapter(list);
        rvShoes.setAdapter(listShoesAdapter);

        listShoesAdapter.setOnItemClickCallback(new ListShoesAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Shoes data) {
                showSelectedShoes(data);
            }
        });
    }

    private void showSelectedShoes(Shoes shoes){
        Intent i = new Intent(Home.this, ShoesPage.class);
        i.putExtra(ShoesPage.EXTRA_NAME, shoes.getName());
        i.putExtra(ShoesPage.EXTRA_DETAIL, shoes.getDetail());
        i.putExtra(ShoesPage.EXTRA_SIZE, shoes.getSize());
        i.putExtra(ShoesPage.EXTRA_TYPE, shoes.getType());
        i.putExtra(ShoesPage.EXTRA_PRICE, shoes.getPrice());
        i.putExtra(ShoesPage.EXTRA_PHOTO, shoes.getPhoto());

        startActivity(i);
    }
}