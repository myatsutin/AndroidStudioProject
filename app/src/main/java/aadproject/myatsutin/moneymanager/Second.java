package aadproject.myatsutin.moneymanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // on click image method for income class
        ImageView imageIncome = (ImageView) findViewById(R.id.incomeImage);
        imageIncome.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                 Toast.makeText(Second.this,"Enter your new income", Toast.LENGTH_LONG).show();
                 Intent intent = new Intent(Second.this, Income.class);
                 startActivity(intent);
            }
        });

        //on click image method for expense class
       ImageView imageExpense = (ImageView) findViewById(R.id.expenseImage);
        imageExpense.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
               Toast.makeText(Second.this,"Enter your new expense", Toast.LENGTH_LONG).show();
               Intent intent = new Intent(getApplicationContext(), Expense.class);
               startActivity(intent);
            }
        });

        //on click image method for history class
        ImageView history = (ImageView) findViewById(R.id.Imagerecord);
        history.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(Second.this,"You clicked on frequent records", Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(getApplicationContext(), History.class);
                startActivity(intent1);
            }
        });

        //on click image method for about application
        ImageView imageSettings = (ImageView) findViewById(R.id.aboutImage);
        imageSettings.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
               Toast.makeText(Second.this,"You clicked on about Money Manger application", Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(getApplicationContext(), Profile.class);
                startActivity(intent1);
            }
        });
    }

}


