package aadproject.myatsutin.moneymanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    TextView t,version, features, developer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //About application texts
        t = findViewById(R.id.textprofile);
        t.setText("Summary\n\n"+"Money Manger application organizes your personal finance easily and effectively\n");
        version = findViewById(R.id.textVersion);
        version.setText("Version 1.1\n");
        features = findViewById(R.id.textFeatures);
        features.setText("Features\n\n"+"•\tAndroid Studio Support\n"
                                    +"•\tFriendly user interface & simple design\n"
                                    +"•\tAdd new incomes & expenses\n"
                                    +"•\tSave incomes & expenses\n"
                                    +"•\tCreate his/her own note\n"
                                    +"•\tAllow to select date and save data\n"
                                    +"•\tUpload images and save images\n"
                                    +"•\tExpense Tracker");
    }
}
