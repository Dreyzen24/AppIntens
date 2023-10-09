package pe.edu.idat.appintens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import pe.edu.idat.appintens.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding  =ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnListar.setOnClickListener(this);
        binding.btnRegistro.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

            if(view.getId() == binding.btnListar.getId()) {
                startActivity(new Intent(
                        MainActivity.this, ListaActivity.class
                ));
            }else if (view.getId() == binding.btnRegistro.getId()) {
            startActivity(new Intent(
                    MainActivity.this, RegistroActivity.class
            ));
            }else{
                Toast.makeText(this, "Opcion no Encontrada", Toast.LENGTH_SHORT).show();}
        }
    }
