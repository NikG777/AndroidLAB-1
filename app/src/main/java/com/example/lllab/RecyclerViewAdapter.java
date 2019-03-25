package com.example.lllab;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

        private NumberTransformation number;

        public RecyclerViewAdapter()
        {
            super();
            number = new NumberTransformation();
        }

        public static class ViewHolder extends RecyclerView.ViewHolder
        {
            public View Lay;
            public ViewHolder(View v)
            {
                super(v);
                this.Lay = v;
            }
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
        {
            View itemLayoutView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item, parent, false);
            return new ViewHolder(itemLayoutView);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position)
        {
            String col = ((position + 1) % 2 == 0) ? "#CCCCCC" : "#FFFFFF";
            holder.Lay.setBackgroundColor(Color.parseColor(col));
            TextView mTextView = (TextView) holder.Lay.findViewById(R.id.txtv);
            mTextView.setText(number.getNumberInWords(position + 1));
        }

        @Override
        public int getItemCount()
        {
            return 1000000;
        }

    }
