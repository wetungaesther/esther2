package com.example.esther;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



    }
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater=getMenuInflater();
            inflater.inflate(R.menu.menu_list,menu);
            return super.onCreateOptionsMenu(menu);
        }
        public boolean onOptionsItemSelected(MenuItem item){
            switch (item.getItemId()){
                case R.id.homepage:
                    Intent objjj= new Intent(this,add_custmer.class);
                    startActivity(objjj);
                    break;
                default:
                    return false;
            }
            return super.onOptionsItemSelected(item);
    }
}
