package com.example.foodorder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.foodorder.customerFoodPanel.CustomerCartFragment;
import com.example.foodorder.customerFoodPanel.CustomerHomeFragment;
import com.example.foodorder.customerFoodPanel.CustomerProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CustomerFoodPanel_BottomNavigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_food_panel_bottom_navigation);
        BottomNavigationView navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(this);
//        UpdateToken();
        String name = getIntent().getStringExtra("PAGE");
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (name != null) {
            if (name.equalsIgnoreCase("Homepage")) {
                loadFragment(new CustomerHomeFragment());
//            } else if (name.equalsIgnoreCase("Preparingpage")) {
//                loadFragment(new CustomerTrackFragment());
//            } else if (name.equalsIgnoreCase("Preparedpage")) {
//                loadFragment(new CustomerTrackFragment());
//            } else if (name.equalsIgnoreCase("DeliverOrderpage")) {
//                loadFragment(new CustomerTrackFragment());
            } else if (name.equalsIgnoreCase("ThankYoupage")) {
                loadFragment(new CustomerHomeFragment());
            }
        } else {
            loadFragment(new CustomerHomeFragment());
        }
    }

//    private void UpdateToken() {
//
//        FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
//        String refreshToken = FirebaseInstanceId.getInstance().getToken();
//        Token token = new Token(refreshToken);
//        FirebaseDatabase.getInstance().getReference("Tokens").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).setValue(token);
//
//    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.Home:
                fragment = new CustomerHomeFragment();
                break;


            case R.id.Cart:
                fragment = new CustomerCartFragment();
                break;

//            case R.id.Order:
//                fragment = new CustomerOrdersFragment();
//                break;
//
//            case R.id.Track:
//                fragment = new CustomerTrackFragment();
//                break;

            case R.id.Profile:
                fragment = new CustomerProfileFragment();
                break;

        }
        return loadFragment(fragment);
    }
}