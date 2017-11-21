package com.example.menudemo.menu;

import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.menudemo.R;

/**
 * author：Admin
 * date：2017/11/2122:01
 * 编程使我快乐
 */

public class Menu2Activity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.start:
                Toast.makeText(this,"start",Toast.LENGTH_SHORT).show();
                break;
            case R.id.over:
                Toast.makeText(this,"over",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
