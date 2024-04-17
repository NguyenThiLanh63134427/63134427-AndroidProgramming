package ntu.nguyenthilanh_63134427.recyclerview_examlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ImageGalleryAdapter extends RecyclerView.Adapter<ViewHolder> {
    List<Data> list;
    Context context;


    public ImageGalleryAdapter(List<Data> list,
                               Context context)
    {
        this.list = list;
        this.context = context;
    }
    @Override
    public ViewHolder
    onCreateViewHolder(ViewGroup parent,
                       int viewType)
    {

        Context context
                = parent.getContext();
        LayoutInflater inflater
                = LayoutInflater.from(context);

        // Inflate the layout

        View photoView
                = inflater
                .inflate(R.layout.card,
                        parent, false);

        ViewHolder viewHolder
                = new ViewHolder(photoView);
        return viewHolder;
    }

    @Override
    public void
    onBindViewHolder(final ViewHolder viewHolder,
                     final int position)
    {
        viewHolder.Name
                .setText(list.get(position).getName());
        viewHolder.Date
                .setText(list.get(position).getDate());
        viewHolder.Message
                .setText(list.get(position).getMassage());
    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

}