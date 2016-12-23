package com.trs.model;

import com.season.core.db.Pojo;
import com.season.core.db.annotation.TableInfo;
import com.season.core.db.annotation.Transient;

/**
 * Created by SONY on 2016/12/22.
 */
@TableInfo(tableName =product.TABLENAME,pkName = "product_id")
public class product extends Pojo<product>{

    @Transient
    public final static String TABLENAME="product_info";

    @Transient
    public final static product pd=new product();


    private Integer product_id;
    private String product_name;
    private String product_text;
    private String product_date;
    private String product_person;

    public product() {
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_text() {
        return product_text;
    }

    public void setProduct_text(String product_text) {
        this.product_text = product_text;
    }

    public String getProduct_date() {
        return product_date;
    }

    public void setProduct_date(String product_date) {
        this.product_date = product_date;
    }

    public String getProduct_person() {
        return product_person;
    }

    public void setProduct_person(String product_person) {
        this.product_person = product_person;
    }

    public product(Integer product_id, String product_name, String product_text, String product_date, String product_person) {

        this.product_id = product_id;

        this.product_name = product_name;
        this.product_text = product_text;
        this.product_date = product_date;
        this.product_person = product_person;
    }
}
