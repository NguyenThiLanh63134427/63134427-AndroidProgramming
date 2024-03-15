package ntu.ntlanh.lvnangcao.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import ntu.ntlanh.lvnangcao.R;
import ntu.ntlanh.lvnangcao.models.Country;

public class CountryAdapter extends BaseAdapter {
    //Nguon du lieu cho Adapter nay
    ArrayList<Country> listQG;
    //Context hoat dong
    Context mContext;
    //Layout
    LayoutInflater mInflater;

    public CountryAdapter(ArrayList<Country> listQG, Context mContext) {
        this.listQG = listQG;
        this.mContext = mContext;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return listQG.size();
    }

    @Override
    public Object getItem(int position) {
        return listQG.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CountryViewHolder viewItem;
        if (convertView == null){
            convertView = mInflater.inflate(R.layout.country_item,null);
            viewItem = new CountryViewHolder();
            viewItem.textViewNationName = convertView.findViewById(R.id.tvTenQG);
            viewItem.textViewPopulation = convertView.findViewById(R.id.tvDanSo);
            viewItem.imageViewFlag = convertView.findViewById(R.id.imQG);
            convertView.setTag(viewItem);
        }
        else
        {
            viewItem = (CountryViewHolder) convertView.getTag();
        }
        // đặt dữ liệu lên view
        Country quocGiaHienThi = listQG.get(position);
        String tenQG= quocGiaHienThi.getTenQG();
        int soDan = quocGiaHienThi.getSoLuongDan();
        String tenLaCo = quocGiaHienThi.getTenFileAnhLaCo();
        viewItem.textViewNationName.setText(tenQG);
        viewItem.textViewPopulation.setText(soDan);
        // tim id file anh o day
        int idAnhLaCo= TimIDAnhTheoTenFile(tenLaCo);  //=== bang  gi do
        viewItem.imageViewFlag.setImageResource(idAnhLaCo);
        return convertView;
    }
    int TimIDAnhTheoTenFile(String tenFileAnh) {
        String tenPak = mContext.getPackageName();
        int id = mContext.getResources().
                getIdentifier(
                        tenFileAnh,"mipmap",tenPak
                );
        return id;
    }

    static class CountryViewHolder{
        ImageView imageViewFlag;
        TextView textViewNationName;
        TextView textViewPopulation;
    }
}
