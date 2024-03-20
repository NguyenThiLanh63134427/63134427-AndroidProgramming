package ntu.ntlanh.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtChieuCao, edtCanNang;
    RadioButton gtNam, gtNu;
    Button btnTinhBMI;
    TextView txtChiSoBMI, txtNhanXet;
    double chiSoBMI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtChieuCao = findViewById(R.id.chieucao);
        edtCanNang = findViewById(R.id.cannang);
        gtNam = findViewById(R.id.N);
        gtNu = findViewById(R.id.Nu);
        btnTinhBMI = findViewById(R.id.btn_tinh);
        txtChiSoBMI = findViewById(R.id.ketqua);
        txtNhanXet = findViewById(R.id.nhanxet);

        // cong thuc tinh BMI: BMI = can nang / (chieu cao * 2)
        btnTinhBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!XacNhan()) {
                    return;
                }
                double chieuCao = Double.parseDouble(edtChieuCao.getText().toString()) / 100;
                double canNang = Double.parseDouble(edtCanNang.getText().toString());
                chiSoBMI = Math.round((canNang / Math.pow(chieuCao, 2)) * 10.0) / 10.0;
                String nhanXet = "";

                if (gtNam.isChecked()) {
                    nhanXet = BMINam(chiSoBMI);
                } else if (gtNu.isChecked()) {
                    nhanXet = BMINu(chiSoBMI);
                }

                txtChiSoBMI.setText("Chỉ số BMI của bạn là: " + String.valueOf(chiSoBMI));
                txtNhanXet.setText(nhanXet);
            }
        });
    }

    // xác nhận user nhập vào chiều cao vs cân nặng hay chưa
    private boolean XacNhan() {
        String chieuCao = edtChieuCao.getText().toString();
        String canNang = edtCanNang.getText().toString();

        if (chieuCao.isEmpty() || canNang.isEmpty()) {
            Toast.makeText(MainActivity.this, "Vui lòng nhập vào cân nặng và chiều cao", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    // BMI châu âu
    private String BMINam(double chiSoBMI) {
        if (chiSoBMI < 18.5) {
            return "Bạn cần bổ sung thêm dinh dưỡng!";
        } else if (chiSoBMI >= 18.5 && chiSoBMI <= 22.9) {
            return "Bạn có chỉ số BMI bình thường!";
        } else if (chiSoBMI >= 25) {
            return "Bạn đang bị thừa cân!";
        } else if (chiSoBMI > 25 && chiSoBMI <= 29.9) {
            return "Bạn đang ở giai đoạn tiền béo phì!";
        } else if (chiSoBMI >= 30 && chiSoBMI <= 34.9) {
            return "Bạn bị béo phì ở mức độ I!";
        } else if (chiSoBMI >= 35 && chiSoBMI <= 39.9) {
            return "Bạn bị béo phì ở mức độ II!";
        } else if (chiSoBMI >= 40) {
            return "Bạn bị béo phì ở mức độ III!";
        }
        return "";
    }

    // BMI châu á
    private String BMINu(double chiSoBMI){
        if (chiSoBMI >= 18.5 && chiSoBMI <= 22.9){
            return "Bạn có chỉ số BMI bình thường!";
        }
        else if (chiSoBMI == 23){
            return "Bạn đang bị thừa cân!";
        }
        else if (chiSoBMI > 23 && chiSoBMI <= 24.9){
            return "Bạn đang ở giai đoạn tiền béo phì!";
        }
        else if (chiSoBMI >= 25 && chiSoBMI <= 29.9){
            return "Bạn bị béo phì ở mức độ I!";
        }
        else if (chiSoBMI >= 30 && chiSoBMI <= 39.9){
            return "Bạn bị béo phì ở mức độ II!";
        }
        return "";
    }
}