package com.example.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactsAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);


        List<Contacts> contactsList = new ArrayList<>();

        contactsList.add(new Contacts("saugat Malla", "965200100", R.drawable.saugat));
        contactsList.add(new Contacts("Bhuwan kc", "965200100", R.drawable.bhuwan));
        contactsList.add(new Contacts("Rajesh Hamal", "965200100", R.drawable.rajesh));
        contactsList.add(new Contacts("Dayahang Rai", "965200100", R.drawable.dahayang));


        ContactsAdapter contactsAdapter = new ContactsAdapter(this, contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
