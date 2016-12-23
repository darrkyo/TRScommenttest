package com.trs.Dao;

import com.season.core.db.Dao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resources;
import java.util.List;
import com.trs.model.product;

/**
 * Created by SONY on 2016/12/22.
 */
@Repository
public class productDao {

    /**
     * 获得全部product
     * @return product集合
     */
    public List<product> getAllProduct(){
        return Dao.findAll(product.class);
    }

    /**
     * 根据id获得product
     * @param productId 需要获得的id
     * @return 返回获得的product
     */
    public product getProductById(int productId){
        return Dao.findById(product.class,productId);
    }

    /**
     * 新增product
     * @param pd 需要新增的product对象
     * @return 返回刚才新增的product对象
     */
    public product addProduct(product pd){
        return Dao.save(pd);
    }

    /**
     * 修改product
     * @param pd 需要修改的product对象
     */
    public void updateProduct(product pd){
        pd.update("product_name","product_text","product_date");
    }

    /**
     * 根据id删除product
     * @param productId 需要删除的id
     */
    public void deleteProduct(int productId){
        Dao.deleteById(product.class,productId);
    }
}
