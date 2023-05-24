package devandroid.helloan.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.helloan.applistacurso.R;
import devandroid.helloan.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {


    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();


    }
}