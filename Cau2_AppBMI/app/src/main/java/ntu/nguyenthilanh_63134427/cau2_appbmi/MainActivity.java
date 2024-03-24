package ntu.nguyenthilanh_63134427.cau2_appbmi;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView heightTextView;
    private TextView weightTextView;
    private TextView ageTextView;
    private Button calculateButton;
    private ImageView increaseWeight, decreaseWeight, increaseAge, decreaseAge;

    private RelativeLayout male, female;
    private int height = 160;
    private int age = 20;
    private int weight = 45;
    private String selectedGender = ""; // Biến lưu trữ giới tính được chọn

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekbar);
        heightTextView = findViewById(R.id.height);
        weightTextView = findViewById(R.id.weight);
        ageTextView = findViewById(R.id.age);
        calculateButton = findViewById(R.id.btnTinhBMI);
        increaseWeight = findViewById(R.id.increase_weight);
        decreaseWeight = findViewById(R.id.decrease_weight);
        increaseAge = findViewById(R.id.increase_age);
        decreaseAge = findViewById(R.id.decrease_age);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);

        heightTextView.setText(String.valueOf(height));
        weightTextView.setText(String.valueOf(weight));

        seekBar.setMax(250);
        seekBar.setProgress(height);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                height = progress;
                heightTextView.setText(String.valueOf(height));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });

        // Thiết lập sự kiện cho việc tăng giảm cân nặng và tuổi
        increaseWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weight++;
                weightTextView.setText(String.valueOf(weight));
            }
        });

        decreaseWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (weight > 0) {
                    weight--;
                    weightTextView.setText(String.valueOf(weight));
                }
            }
        });

        increaseAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                age++;
                ageTextView.setText(String.valueOf(age));
            }
        });

        decreaseAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (age > 0) {
                    age--;
                    ageTextView.setText(String.valueOf(age));
                }
            }
        });

        // Thiết lập sự kiện cho việc chọn giới tính
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedGender = "Nam";
                // Đồng thời, có thể thay đổi màu sắc hoặc hiển thị một biểu tượng để chỉ ra lựa chọn
            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedGender = "Nữ";
            }
        });
    }

    private void calculateBMI() {
        float heightMeter = (float) height / 100;
        float bmi = weight / (heightMeter * heightMeter);
        String resultMessage = String.format("Kết quả BMI của bạn: %.2f\n", bmi);
        String bmiCategory = getBMICategory(bmi);
        resultMessage += bmiCategory;
        resultMessage += "\nGiới tính: " + selectedGender; // Thêm thông tin về giới tính vào kết quả
        showResultDialog(resultMessage);
    }

    private String getBMICategory(float bmi) {
        if (bmi < 18.5) {
            return "Bạn là người gầy";
        } else if (bmi < 25) {
            return "Bạn có trọng lượng lý tưởng";
        } else if (bmi < 30) {
            return "Bạn bị thừa cân";
        } else {
            return "Bạn bị béo phì";
        }
    }

    // Phương thức hiển thị hộp thoại kết quả
    private void showResultDialog(String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Kết quả BMI của bạn \n");
        builder.setMessage(message);
        builder.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }

}
