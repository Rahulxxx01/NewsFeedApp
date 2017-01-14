package com.example.android.newsfeedapp;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.os.AsyncTask;

import java.util.List;

/**
 * Created by RAHUL YADAV on 14-01-2017.
 */

public class NewsLoader extends AsyncTaskLoader<List<News>> {
    private String mUrl;
    public NewsLoader(Context context,String url) {
        super(context);
        mUrl=url;
    }

    @Override
    public List<News> loadInBackground() {
        if(mUrl==null){
            return null;
        }
        List<News> news = QueryUtils.fetchNewsData(mUrl);
        return news;

    }

}
