package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.os.Bundle;

import com.example.contacts.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;
    private R

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mainBinding.recyclerView.setHasFixedSize(true);

    }
    private List<Beer> prepareBeer(){

        List<String> names = Arrays.asList(getResources().getStringArray(R.array.names));
        List<String> types = Arrays.asList(getResources().getStringArray(R.array.types));
        int[] imageId = {R.drawable.bura_brew, R.drawable.osjecko, R.drawable.neposlusna, R.drawable.ozujsko,
                         R.drawable.ozujsko_amber, R.drawable.pan_lager};
        List<Beer> Names = new ArrayList<>();
        int count = 0;

        for (String name : names){
            Names.add(new Beer(name,types.get(count),imageId[count]));
            count++;
        }
        return Names;
    }
}
