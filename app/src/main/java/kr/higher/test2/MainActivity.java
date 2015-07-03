package kr.higher.whatguess;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private EditText inputText;
    private TextView resultText;

    private View btn_guess;
    private View btn_cancel;
    
    // 그냥 건들여 봤어요..


    private EditText inputText;

    private View.OnClickListener butnClick = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            int id = view.getId();


            switch (id) {
                case R.id.button:
                    Toast.makeText(MainActivity.this, inputText.getText(), Toast.LENGTH_SHORT).show();
                    inputText.getText();
                    break;
                case R.id.button2:
                    inputText.setText("");
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = (EditText) findViewById(R.id.editText);

        btn_guess = findViewByID(R.id.button);
        btn_cancel = findViewByID(R.id.button2);

        btn_cancel.setOnClickListener(butnClick);
        btn_guess.setOnClickListener(butnClick);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
