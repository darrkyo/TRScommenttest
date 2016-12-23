package com.trs.controller;

import com.season.core.Controller;
import com.season.core.ControllerKey;
import com.trs.Service.productService;
import com.trs.model.product;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by SONY on 2016/12/22.
 */
@ControllerKey("product")
public class productController extends Controller{

    @Autowired
    private productService pdSv;

    /**
     * 获得全部product方法
     */
    public void getAllProduct(){
        renderJson("productList",pdSv.getAllProduct());
    }

    /**
     * 根据id获得product
     */
    public void getProductById(){
        int product_id=getParaToInt("product_id");
        renderJson(pdSv.getProductById(product_id));
    }

    /**
     * 新增product
     */
    public void addProduct(){
        product pd=new product();
        String product_name=getPara("product_name");
        String product_text=getPara("product_text");
        String date= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date().getTime());
        String product_person="系统管理员";

        pd.setProduct_date(date);
        pd.setProduct_name(product_name);
        pd.setProduct_text(product_text);
        pd.setProduct_person(product_person);

        pdSv.addProduct(pd);
    }

    /**
     * 修改product
     */
    public void updateProduct(){
        product pd=new product();
        int product_id=getParaToInt("product_id");
        String product_name=getPara("product_name");
        String product_text=getPara("product_text");
        String date= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date().getTime());

        pd.setProduct_id(product_id);
        pd.setProduct_date(date);
        pd.setProduct_name(product_name);
        pd.setProduct_text(product_text);

        pdSv.updateProduct(pd);
    }

    /**
     * 根据id删除product
     */
    public void deleteProduct(){
        int product_id=getParaToInt("product_id");
        pdSv.deleteProduct(product_id);
    }
}
