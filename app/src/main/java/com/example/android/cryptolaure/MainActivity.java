package com.example.android.cryptolaure;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //definie quel fragment sera lancé en premier
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new PortefeuilleFragment()).commit();


        //Retrouve la bottom navigation créé
        BottomNavigationView bottomNav = findViewById(R.id.botom_navigation);
        //Créé un listener pour ecouter quand on clique sur les different icones
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedFragment = null;

                switch(menuItem.getItemId()){
                    //Avec ce switch nous pouvons savoir quel item/icons on a clique sur
                    case R.id.nav_wallet:
                        selectedFragment = new PortefeuilleFragment();
                        break;
                    case R.id.nav_transfert:
                        selectedFragment = new TransfertFragment();
                        break;
                    case R.id.nav_settings:
                        selectedFragment = new ReglagesFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
                return true;
            }
        });


    }

}
