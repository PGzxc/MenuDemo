package com.example.menudemo.menu;

import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;


/**
 * author：Admin
 * date：2017/11/2122:00
 * 编程使我快乐
 */

public class Menu1Activity extends AppCompatActivity {

    private static final int START_ITEM = Menu.FIRST;  //Menu.FIRST的值就是1
    private static final int OVER_ITEM = Menu.FIRST + 1;
    private static final int SET_ITEM1 = Menu.FIRST + 2;
    private static final int SET_ITEM2 = Menu.FIRST + 3;

    //重写onCreateOptionMenu(Menu menu)方法，当菜单第一次被加载时调用
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //填充选项菜单（读取XML文件、解析、加载到Menu组件上）
        // getMenuInflater().inflate(R.menu.main, menu);

        //通过代码的方式来添加Menu
        //添加菜单项（组ID，菜单项ID，排序，标题）
        menu.add(0, START_ITEM, 100, "Start");
        menu.add(0, OVER_ITEM, 200, "Over");
        //添加子菜单
        SubMenu sub1 = menu.addSubMenu("setting");
        sub1.add(1, SET_ITEM1, 300, "声音设置");
        sub1.add(1, SET_ITEM2, 400, "背景设置");

        return true;
    }

    //重写OptionsItemSelected(MenuItem item)来响应菜单项(MenuItem)的点击事件（根据id来区分是哪个item）
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case START_ITEM:
                Toast.makeText(this, "开始游戏", Toast.LENGTH_SHORT).show();
                break;
            case OVER_ITEM:
                Toast.makeText(this, "结束游戏", Toast.LENGTH_SHORT).show();
                break;

            case SET_ITEM1:
                Toast.makeText(this, "声音設置", Toast.LENGTH_SHORT).show();
                break;

            case SET_ITEM2:
                Toast.makeText(this, "背景設置", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
