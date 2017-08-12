package com.sachinchandil.room_database_project.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Projects")
public class ProjectItem {

    @PrimaryKey
    @ColumnInfo(name = "s_no")
    private int sNo;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "type")
    private String type;

    @ColumnInfo(name = "url")
    private String url;

    @ColumnInfo(name = "amt_pledged")
    private int amountPledged;

    @ColumnInfo(name = "blurb")
    private String blurb;

    @ColumnInfo(name = "by")
    private String by;

    @ColumnInfo(name = "country")
    private String country;

    @ColumnInfo(name = "currency")
    private String currency;

    @ColumnInfo(name = "end_time")
    private String endTime;

    @ColumnInfo(name = "location")
    private String location;

    @ColumnInfo(name = "percentage_funded")
    private String percentageFunded;

    @ColumnInfo(name = "state")
    private String state;

    public int getSNo() {
        return sNo;
    }

    public void setSNo(int sNo) {
        this.sNo = sNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getAmountPledged() {
        return amountPledged;
    }

    public void setAmountPledged(int amountPledged) {
        this.amountPledged = amountPledged;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPercentageFunded() {
        return percentageFunded;
    }

    public void setPercentageFunded(String percentageFunded) {
        this.percentageFunded = percentageFunded;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
