package com.example.hkim142.map524lab6;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;


public class FriendDetail extends ActionBarActivity{

    TextView name;
    TextView phone;
    TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        name = (TextView) findViewById(R.id.textView);
        phone = (TextView) findViewById(R.id.textView2);
        email = (TextView) findViewById(R.id.textView3);

        name.setText("Name: " + getIntent().getExtras().getString("friendName"));
        phone.setText("Phone: " + getIntent().getExtras().getString("friendEmail"));
        email.setText("Email: " + getIntent().getExtras().getString("friendPhone"));

    }
}
