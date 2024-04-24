package ntu.nguyenthilanh_63134427.bai1_explicitintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SubOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_one);
    }

    public void QuayLai(View v) {
        Intent ManHinhChinh = new Intent(this, MainActivity.class);
        startActivity(ManHinhChinh);
    }
}