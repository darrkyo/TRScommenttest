package com.trs.Service;

import com.trs.Dao.productDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.trs.model.product;

import java.util.List;

/**
 * Created by SONY on 2016/12/22.
 */
@Repository
public class productService {

    @Autowired
    private productDao pdDao;

    /**
     * 获得全部product
     * @return product集合
     */
    public List<product> getAllProduct(){
        return pdDao.getAllProduct();
    }

    /**
     * 根据id获取product
     * @param productId 需要查询的id
     * @return 查询的product对象
     */
    public product getProductById(int productId){
        return pdDao.getProductById(productId);
    }

    /**
     * 新增product
     * @param pd 需要新增的对象
     * @return 返回刚才新增的对象
     */
    public product addProduct(product pd){
        return pdDao.addProduct(pd);
    }

    /**
     * 修改product
     * @param pd 需要修改的对象
     */
    public void updateProduct(product pd){
        pdDao.updateProduct(pd);
    }

    /**
     * 根据传入id删除product
     * @param productId 需要删除的id
     */
    public void deleteProduct(int productId){
        pdDao.deleteProduct(productId);
    }
}
