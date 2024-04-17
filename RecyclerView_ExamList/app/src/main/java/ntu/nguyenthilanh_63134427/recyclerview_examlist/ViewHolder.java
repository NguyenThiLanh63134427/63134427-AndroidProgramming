package ntu.nguyenthilanh_63134427.recyclerview_examlist;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView Message;
    TextView Name;
    TextView Date;
    ViewHolder( View itemView) {
        super(itemView);
        Name = (TextView)itemView.findViewById(R.id.Name);
        Date = (TextView)itemView.findViewById(R.id.Date);
        Message = (TextView)itemView.findViewById(R.id.Message);
    }
}