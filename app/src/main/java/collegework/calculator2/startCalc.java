package collegework.calculator2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class startCalc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_calc);
    }
    public void switchMode(View view)
    {
        Intent intent=new Intent(this,AltScreen.class);
        startActivity(intent);
    }
}