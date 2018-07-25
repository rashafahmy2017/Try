package com.udacity.atry;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ahmad on 25/07/2018.
 */
public class MyData implements Parcelable {
    private String id = "";
    private String poster_name = "";
    private String poster_path = "";
    private String title_data = "";
    private String title = "";
    private String url = "";
    private String vote_rate = "";
    private String vote_num="";

    public MyData() {
    }

    public MyData(String title, String poster_name, String title_data, String url, String id, String vote_num) {
        this.title = title;
        this.poster_name = poster_name;
        this.title_data = title_data;
        this.url = url;
        this.id = id;
        this.vote_num = vote_num;
    }


    protected MyData(Parcel in) {
        id = in.readString();
        poster_name = in.readString();
        poster_path = in.readString();
        title_data = in.readString();
        title = in.readString();
        url = in.readString();
        vote_rate = in.readString();
    }

    public static final Creator<MyData> CREATOR = new Creator<MyData>() {
        @Override
        public MyData createFromParcel(Parcel in) {
            return new MyData(in);
        }

        @Override
        public MyData[] newArray(int size) {
            return new MyData[size];
        }
    };


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setPoster_name(String poster_name) {
        this.poster_name = poster_name;
    }

    public String getPoster_name() {

        return poster_name;
    }

    public String getUrl() {
        return url;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String gettitle() {
        return title;
    }

    public String get_title_data() {
        return title_data;
    }

    public void set_title_data(String title_data) {
        this.title_data = title_data;
    }

    public String get_Poster_Path() {
        return poster_path;
    }

    public void set_Poster_Path(String posterPath) {
        this.poster_path = posterPath;
    }

    public String getNumStars() {
        return vote_num;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id);
        parcel.writeString(poster_name);
        parcel.writeString(poster_path);
        parcel.writeString(title_data);
        parcel.writeString(title);
        parcel.writeString(vote_rate);
        parcel.writeString(url);
    }
}
