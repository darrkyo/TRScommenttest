package com.trs.model;

import com.season.core.db.Pojo;
import com.season.core.db.annotation.TableInfo;
import com.season.core.db.annotation.Transient;

/**
 * Created by SONY on 2016/12/16.
 */
@TableInfo(tableName =comment.TABLENAME,pkName = "id")
public class comment extends Pojo<comment> {

    @Transient
    public final static String TABLENAME = "comment";

    @Transient
    public final static comment cm = new comment();
    //评论编号
    private Integer id;
    //产品id
    private Integer product_id;
    //产品评论
    private String comment;
    //评论日期
    private String date;

    public static com.trs.model.comment getCm() {
        return cm;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static String getTABLENAME() {

        return TABLENAME;
    }

    public comment() {
    }

    public comment(Integer id, Integer product_id, String comment, String date) {
        this.id = id;
        this.product_id = product_id;
        this.comment = comment;
        this.date = date;
    }
}
