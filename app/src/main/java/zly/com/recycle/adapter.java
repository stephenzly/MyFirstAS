package zly.com.recycle;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.List;

/**
 * Created by Curry on 2020/9/24.
 */

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {

    private List<String> list;
    Context context;
    public adapter(List<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public adapter() {

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_main,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.textView.setText(list.get(position));
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView1);
        }
    }
}


