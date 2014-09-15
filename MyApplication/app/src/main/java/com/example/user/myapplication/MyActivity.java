package com.example.user.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }
    public void onButtonConvert(View v){
        EditText d1= (EditText)findViewById(R.id.dollar);

        TextView b1 = (TextView)findViewById(R.id.baht);
        int z1, theans;
        z1 = Integer.parseInt(d1.getText().toString());

        theans = z1*30;
        b1.setText(Integer.toString(theans));

    }
    public void onButtonClick(View v){
        EditText e1= (EditText)findViewById(R.id.num1);
        EditText e2= (EditText)findViewById(R.id.num2);
        TextView t1 = (TextView)findViewById(R.id.sum);
        int n1,n2, thesum;
        n1 = Integer.parseInt(e1.getText().toString());
        n2 = Integer.parseInt(e2.getText().toString());
        thesum = n1 + n2;
        t1.setText(Integer.toString(thesum));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
