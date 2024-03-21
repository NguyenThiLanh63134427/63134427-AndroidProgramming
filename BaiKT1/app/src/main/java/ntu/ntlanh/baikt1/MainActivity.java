package ntu.ntlanh.baikt1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edtName, edtPassword;
    Button btnLogin;
    TextView txtat;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String UserName = edtName.getText().toString();
                String Password = edtPassword.getText().toString();
                count++;
                txtat.setText(String.valueOf(count));
                if(UserName.equals("ntl") && Password.equals("63cntt")){
                    Toast.makeText(MainActivity.this, "User and Password is correct", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "User or Password is wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    void TimDieuKhien(){
        edtName = findViewById(R.id.edtName);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        txtat = findViewById(R.id.txtAttempts);
    }
}