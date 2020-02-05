package id.ac.poliban.mi.maya.uts_mayadiahatikasari;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button Clear, Submit;
    EditText NoPendaftaran, Nama, Alamat, Telpon;
    RadioButton LakiLaki, Perempuan;
    Spinner spiner;
    private  Spinner snNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Clear = (Button) findViewById(R.id.btClear);
       Submit = (Button) findViewById(R.id.btSubmit);
       NoPendaftaran = (EditText) findViewById(R.id.etNoPendaftaran);
       Nama = (EditText) findViewById(R.id.etNama);
       Alamat = (EditText) findViewById(R.id.etAlamat);
       Telpon = (EditText) findViewById(R.id.etTelp);
       LakiLaki = (RadioButton) findViewById(R.id.rbLaki_laki);
       Perempuan = (RadioButton) findViewById(R.id.rbPerempuan);

       Clear.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               NoPendaftaran.setText("");
               Nama.setText("");
               Alamat.setText("");
               Telpon.setText("");
               LakiLaki.setChecked(false);
               Perempuan.setChecked(false);
               spiner.setSelection(0);
           }
       });

       String[] arraySpiner = new  String[]{
               "Islam","Katolik","Hindu","Budha","Konghucu" };

        Spinner spinner = findViewById(R.id.sAgama);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arraySpiner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Submit.setOnClickListener(v -> {
            new AlertDialog.Builder(this)
                    .setTitle("Info Registrasi")
                    .setMessage(NoPendaftaran.getText())
                    .setPositiveButton("OK", null).show();
        });



    }
}
