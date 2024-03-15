package ntu.ntlanh.lvnangcao;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import ntu.ntlanh.lvnangcao.models.Country;

public class MainActivity extends AppCompatActivity {
    ArrayList<Country> dsQG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Buoc 1
        dsQG = new ArrayList<Country>();
        dsQG.add(new Country("VietNam",90,"vn"));
        dsQG.add(new Country("Russia",110,"rs"));
        dsQG.add(new Country("United State",80,"us"));
    }
}