package ntu.ntlanh;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewData;
    RecyclerView recyclerViewLandscape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3
        recyclerViewData = getRecyclerViewData();
        //4
        recyclerViewLandscape = findViewById(R.id.recyclerLand);
        //5 cách 1 : chiều dọc
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandscape.setLayoutManager(layoutLinear);
        //5 cách 2 : chều ngang
//        RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        recyclerViewLandscape.setLayoutManager(layoutLinearHorizonal);
        //5 cách 3 : chia cột
//        RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this, 2);
//        recyclerViewLandscape.setLayoutManager(layoutGrid);
        //6
        landScapeAdapter = new LandScapeAdapter(this, recyclerViewData);
        //7
        recyclerViewLandscape.setAdapter(landScapeAdapter);
    }
    ArrayList<LandScape> getRecyclerViewData(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<>();
        //LandScape landScape1 = new LandScape("flag_tower_of_hanoi", "Cột cờ Hà Nội");
        //dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("flag_tower_of_hanoi","Cột cờ Hà Nội"));
        dsDuLieu.add(new LandScape("eiffel","Tháp Eiffel"));
        dsDuLieu.add(new LandScape("buckingham","Cung điện Buckingham"));
        dsDuLieu.add(new LandScape("statue_of_liberty","Tượng nữ thần tự do"));
        return dsDuLieu;
    }
}