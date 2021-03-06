package com.yyp.sun.entity;

import org.greenrobot.greendao.annotation.*;

import java.io.Serializable;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.
/**
 * Entity mapped to table "MOOD_DIARY_DATA".
 */
@Entity
public class MoodDiaryData implements Serializable {

    @Id
    private Long id;
    private String authorID;
    private String createDate;
    private String content;
    private String imageUrl1;
    private String imageUrl2;

    @Generated(hash = 356701467)
    public MoodDiaryData() {
    }

    public MoodDiaryData(Long id) {
        this.id = id;
    }

    @Generated(hash = 41749195)
    public MoodDiaryData(Long id, String authorID, String createDate, String content, String imageUrl1, String imageUrl2) {
        this.id = id;
        this.authorID = authorID;
        this.createDate = createDate;
        this.content = content;
        this.imageUrl1 = imageUrl1;
        this.imageUrl2 = imageUrl2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageUrl1() {
        return imageUrl1;
    }

    public void setImageUrl1(String imageUrl1) {
        this.imageUrl1 = imageUrl1;
    }

    public String getImageUrl2() {
        return imageUrl2;
    }

    public void setImageUrl2(String imageUrl2) {
        this.imageUrl2 = imageUrl2;
    }

}
