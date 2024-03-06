package ntu.ntlanh.ex4_addsubmuldiv_onclick;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
    //Xu Ly Cong
    void XuLyCong(View v){
        //Tim EditText 1 va 2
        EditText editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        //Lay du lieu tu hai dieu khien
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //Chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tinh Toan
        float Tong = soA + soB;
        //Hien ket qua
        EditText editTextKQ = (EditText)findViewById(R.id.edtKQ);
        //Chuan bi du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(Tong);
        //Gan ket qua len dk
        editTextKQ.setText(chuoiKQ);
    }//Xu Ly Tru
    void XuLyTru(View v){

    }//Xu Ly Nhan
    void XuLyNhan(View v){

    }//Xu Ly Chia
    void XuLyChia(View v){

    }

}