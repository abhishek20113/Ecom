package com.example.abhishek.ecom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class ItemDetails extends Activity {
    int id=5;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_details);

    }
    EditText email;
    EditText itemNum;

    public void sendMessage(View view) {
        Toast.makeText(ItemDetails.this, "Order Successful for item: " + id,
                Toast.LENGTH_SHORT).show();
        String id2= getIntent().getStringExtra("id");
        Log.d("itemDetails: ","id: "+ id);
        email   = (EditText)findViewById(R.id.email);
        itemNum = (EditText)findViewById(R.id.quantity);
        Log.d("itemDetails","Order placed Successful: \n email: "+ email.getText().toString()
                +" "+"\nNumber of items: "+ itemNum.getText().toString());
        Intent i = new Intent(ItemDetails.this,MainActivity.class);
        startActivity(i);
    }
}
