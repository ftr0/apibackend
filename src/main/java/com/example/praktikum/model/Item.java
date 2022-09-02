package com.example.praktikum.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String date;

    private String content;

    private String homeoffice;

    private String start;

    private String end;

    private String total;

    private String krank;

    public String getKrank() {
        return krank;
    }

    public void setKrank(String krank) {
        this.krank = krank;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    private String rating;




    public Item(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHomeoffice() {
        return homeoffice;
    }

    public void setHomeoffice(String homeoffice) {
        this.homeoffice = homeoffice;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getTotal() {

        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

}
