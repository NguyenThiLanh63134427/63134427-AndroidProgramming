package ntu.ntlanh.ex3_simplesumapp;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Bộ lắng nghe và xử lý sự kiện click lên nút tính tổng
    public void XuLyCong(View view){
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtC);
        //Lay du lieu ve o dieu khien a
        String strA = editTextSoA.getText().toString();
        //Lay du lieu ve o dieu khien b
        String strB = editTextSoB.getText().toString();
        //Chuyen du lieu ve dang so
        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);
        //Tinh toan theo yeu cau
        int tong = so_A + so_B;
        //Chuyen sang dang chuoi
        String strTong = String.valueOf(tong);
        //Hien ra man hinh
        editTextKetQua.setText(strTong);


    }
}