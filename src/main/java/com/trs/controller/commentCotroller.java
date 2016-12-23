package com.trs.controller;

import com.season.core.Controller;
import com.season.core.ControllerKey;
import com.trs.Service.commentService;
import com.trs.model.comment;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by SONY on 2016/12/13.
 */
@ControllerKey("comment")
public class commentCotroller extends Controller{

    @Autowired
    private commentService cmService;

    /**
     * 新增方法
     */
    public void addComment(){
        comment cm=new comment();
        int product_id=getParaToInt("product_id");
        String comment=getPara("comment");
        System.err.println(product_id+":"+comment);
        String date= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date().getTime());

        cm.setProduct_id(product_id);
        cm.setComment(comment);
        cm.setDate(date);

        Integer flag=cmService.addComment(cm);
        if(flag>0){
            setAttr("product_id",product_id);
            setAttr("comment",comment);
            setAttr("date",date);
            renderJson();
        }
    }

    /**
     * 获取全部
     */
    public void getAllCommentById(){
        int product_id=getParaToInt("product_id");
        renderJson("commentList",cmService.getAllCommentById(product_id));
    }

    /**
     * 删除方法
     */
    public void deleteComment(){
        int commentid=getParaToInt("id");
        cmService.deleteComment(commentid);
    }

    /**
     * 修改方法
     */
    public void updateComment(){
        comment cm=new comment();
        Integer product_id=getParaToInt("id");
        String comment=getPara("comment");
        String date= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date().getTime());
        cm.setId(product_id);
        cm.setComment(comment);
        cm.setDate(date);
        cmService.updateComment(cm);
    }
}
