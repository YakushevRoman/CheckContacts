package pegas_dll.checkcontacts;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityCheckContacts extends AppCompatActivity {

    private Fragment fragment;
    private FragmentManager fragmentManager;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    /*if (fragment !=  null){
                        fragment = new LoadContacts();
                        fragmentManager
                                .beginTransaction()
                                .replace(R.id.fragment_container, fragment)
                                .commit();
                    }
                    Toast.makeText(getApplicationContext(), " 1", Toast.LENGTH_SHORT).show();*/
                    return true;
                case R.id.navigation_dashboard:
                    /*if (fragment !=  null){
                        //fragment = new WhatsAppCheck();
                        fragmentManager
                                .beginTransaction()
                                .replace(R.id.fragment_container, fragment)
                                .commit();
                    }
                    Toast.makeText(getApplicationContext(), " 2", Toast.LENGTH_SHORT).show();*/
                    return true;
                case R.id.navigation_notifications:
                    /*if (fragment !=  null){
                        //fragment = new TelegrammAppCheck();
                        fragmentManager
                                .beginTransaction()
                                .replace(R.id.fragment_container, fragment)
                                .commit();
                    }
                    Toast.makeText(getApplicationContext(), " 3", Toast.LENGTH_SHORT).show();*/
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_check_contacts);

        fragmentManager = getSupportFragmentManager();
        fragment = fragmentManager.findFragmentById(R.id.fragment_container);
        if (fragment ==  null){
            fragment = new FragmentContact();
            fragmentManager
                    .beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
