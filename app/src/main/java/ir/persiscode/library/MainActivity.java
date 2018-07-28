package ir.persiscode.library;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ir.persiscode.mylibrary.Codes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Codes.setText("hello");
        Codes.showDialog(this);
    }
}
