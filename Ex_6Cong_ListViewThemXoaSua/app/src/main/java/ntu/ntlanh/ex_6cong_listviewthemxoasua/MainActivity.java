package ntu.ntlanh.ex_6cong_listviewthemxoasua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsMonHoc; // khai bao
    Button btnThem, btnSua;
    EditText editTextMH;
    int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dsMonHoc = new ArrayList<String>(); // khai bao cu the

        btnThem = (Button) findViewById(R.id.buttonMH);
        btnSua = (Button) findViewById(R.id.btnSua);

        editTextMH = (EditText) findViewById(R.id.editTextMH);

        dsMonHoc.add("Toán");
        dsMonHoc.add("Văn");
        dsMonHoc.add("Anh");
        dsMonHoc.add("Lý");
        dsMonHoc.add("Hóa");
        dsMonHoc.add("Sinh");

        ArrayAdapter<String> adapterMH;
        adapterMH = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dsMonHoc);
        // b3: gan vao DK hien thi ListView
        // b3.1: tim
        ListView lvDSMH = findViewById(R.id.lvDSMH);
        // b3.2 gan
        lvDSMH.setAdapter(adapterMH);
        // b3.3 lang nghe va xu ly SK nguoi dung tuong tac
        lvDSMH.setOnItemClickListener(BLNVXL);


        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String monhoc = editTextMH.getText().toString();
                dsMonHoc.add(monhoc);
                adapterMH.notifyDataSetChanged();
                Toast.makeText(MainActivity.this,"Bạn đã thêm thành công.",Toast.LENGTH_SHORT).show();
            }
        });

        lvDSMH.setOnItemClickListener((new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                editTextMH.setText(dsMonHoc.get(i));
                vitri = i;
            }
        }));

        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dsMonHoc.set(vitri, editTextMH.getText().toString());
                adapterMH.notifyDataSetChanged();
                Toast.makeText(MainActivity.this,"Bạn đã sửa thành công.",Toast.LENGTH_SHORT).show();
            }
        });

        // Xoa
        lvDSMH.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                dsMonHoc.remove(position);
                adapterMH.notifyDataSetChanged();
                Toast.makeText(MainActivity.this,"Bạn đã xóa thành công.",Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
    // Tao 1 bo lang nghe va XLSK onItemClick
    AdapterView.OnItemClickListener BLNVXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
            String strTenMH = dsMonHoc.get(i);
            Toast.makeText(MainActivity.this,strTenMH, Toast.LENGTH_SHORT).show();
        }
    };
}