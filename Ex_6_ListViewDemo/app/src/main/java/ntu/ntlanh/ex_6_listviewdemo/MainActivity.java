package ntu.ntlanh.ex_6_listviewdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenQuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dsTenQuan = new ArrayList<String>();
        dsTenQuan.add("I am Cake");
        dsTenQuan.add("Ola Coffee");
        dsTenQuan.add("April's House");
        dsTenQuan.add("Chiếc mơ Signature");
        dsTenQuan.add("Sol Coffee & Dessert");
        dsTenQuan.add("DD/MM/YY");
        dsTenQuan.add("Gác De:art");
        //B2.Tạo adapter
        ArrayAdapter<String> adaptercoffee;
        adaptercoffee = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dsTenQuan);
        //B3.Gắn vào điều khiển hiển thị ListView
        ListView lvTenQuan = findViewById(R.id.lvDanhSachTenQuan);
        lvTenQuan.setAdapter(adaptercoffee);
        //Lang nghe va xu ly su kien user tuong tac

        lvTenQuan.setOnClickListener((View.OnClickListener) BoLangNghevaXL);
    }
    //Tao bo lang nghe va xu ly su kien OnItemClick, dat vao mot bien
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
            String strTenTinhChon = dsTenQuan.get(i);
            Toast.makeText(MainActivity.this, strTenTinhChon, Toast.LENGTH_LONG).show();
        }
    };
}