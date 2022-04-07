package com.example.menus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton popMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        popMenu = findViewById (R.id.imageButton);
        popMenu.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupMenuExample ();
            }
        } );
    }

    private void popupMenuExample (){
        PopupMenu pop = new PopupMenu( MainActivity.this, popMenu );
        pop.getMenuInflater().inflate( R.menu.menu_principal,pop.getMenu());
        pop.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Toast.makeText( MainActivity.this, menuItem.getTitle(),Toast.LENGTH_SHORT ).show();
                return true;
            }
        } );
        pop.show();
    }

}