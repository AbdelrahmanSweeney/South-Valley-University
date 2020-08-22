package com.example.southvalleyuniversity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
public class RssFeedListAdapter
        extends RecyclerView.Adapter<RssFeedListAdapter.FeedModelViewHolder> {
    private List<RssFeedModel> mRssFeedModels;
    public static class FeedModelViewHolder extends RecyclerView.ViewHolder {
        private View rssFeedView;
        public FeedModelViewHolder(View v) {
            super(v);
            rssFeedView = v;
        }
    }
    public RssFeedListAdapter(List<RssFeedModel> rssFeedModels) {
        mRssFeedModels = rssFeedModels;
    }
    @Override
    public FeedModelViewHolder onCreateViewHolder(ViewGroup parent, int type) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.news_card, parent, false);
        FeedModelViewHolder holder = new FeedModelViewHolder(v);
        return holder;
    }
    @Override
    public void onBindViewHolder(FeedModelViewHolder holder, int position) {
        final RssFeedModel rssFeedModel = mRssFeedModels.get(position);
        ((TextView)holder.rssFeedView.findViewById(R.id.textView_Title)).setText(rssFeedModel.title);
        ((TextView)holder.rssFeedView.findViewById(R.id.textView_Content)).setText(rssFeedModel.description);
        ((TextView)holder.rssFeedView.findViewById(R.id.textView_Date)).setText(rssFeedModel.pubDate);

        holder.rssFeedView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browseIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(rssFeedModel.link));
                view.getContext().startActivity(browseIntent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return mRssFeedModels.size();
    }
}
