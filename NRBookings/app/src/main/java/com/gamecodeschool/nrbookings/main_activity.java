package com.gamecodeschool.nrbookings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main_activity extends AppCompatActivity {

    Button btnAdmin,btnUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);
        //This is activity no.1 and provides the first screen in the app.We are making use of total 5 activities required for auto authentication
btnAdmin=findViewById(R.id.btn_admin);
btnUser=findViewById(R.id.btn_user);
btnUser.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent= new Intent(main_activity.this, user_login_register_main_activity.class);
        startActivity(intent);
    }
});
btnAdmin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
Intent intent=new Intent(main_activity.this, admin_login_register_main_activity.class);
startActivity(intent);
    }
});
    }
}
