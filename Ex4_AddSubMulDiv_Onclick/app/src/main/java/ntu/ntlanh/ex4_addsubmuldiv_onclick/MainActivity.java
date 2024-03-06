package ntu.ntlanh.ex4_addsubmuldiv_onclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai bao ca doi tuong gan voi dieu khien o day
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    }
    void TimDieuKhien(){
        EditText editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        EditText editTextKQ = (EditText)findViewById(R.id.edtKQ);
        nutCong = (Button)findViewById(R.id.btnCong);
        nutTru = (Button)findViewById(R.id.btnTru);
        nutNhan = (Button)findViewById(R.id.btnNhan);
        nutChia = (Button)findViewById(R.id.btnChia);

    }
    //Xu Ly Cong
    public void XuLyCong(View v){
        //Tim EditText 1 va 2
        //Lay du lieu tu hai dieu khien
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //Chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tinh Toan
        float Tong = soA + soB;
        //Hien ket qua
        //Chuan bi du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(Tong);
        //Gan ket qua len dk
        editTextKQ.setText(chuoiKQ);
    }
    //Xu Ly Tru
    public void XuLyTru(View v){
        //Tim EditText 1 va 2

        //Lay du lieu tu hai dieu khien
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //Chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tinh Toan
        float Hieu = soA - soB;
        //Hien ket qua
        //Chuan bi du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(Hieu);
        //Gan ket qua len dk
        editTextKQ.setText(chuoiKQ);
    }
    //Xu Ly Nhan
    public void XuLyNhan(View v){
        //Tim EditText 1 va 2
        //Lay du lieu tu hai dieu khien
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //Chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tinh Toan
        float Tich = soA * soB;
        //Hien ket qua
        //Chuan bi du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(Tich);
        //Gan ket qua len dk
        editTextKQ.setText(chuoiKQ);
    }
    //Xu Ly Chia
    public void XuLyChia(View v){
        //Tim EditText 1 va 2
        //Lay du lieu tu hai dieu khien
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //Chuyen du lieu tu chuoi sang so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tinh Toan
        float Thuong = soA / soB;
        //Hien ket qua
        //Chuan bi du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(Thuong);
        //Gan ket qua len dk
        editTextKQ.setText(chuoiKQ);
    }

}