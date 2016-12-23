package com.trs.Dao;

import com.season.core.db.Dao;
import org.springframework.stereotype.Repository;
import com.trs.model.comment;

import java.util.List;

/**
 * Created by SONY on 2016/12/16.
 */
@Repository
public class commentDao {
    /**
     *添加评论
     * @param cm  评论对象
     * @return
     */
    public comment addComment(comment cm){
        return Dao.save(cm);
    }

    /**
     * 获得全部评论
     * @return
     */
    public List<comment> getCommentById(int commentId ){
        return Dao.findByColumn(comment.class,"product_id",commentId);
    }

    /**
     * 删除评论
     * @param commentId
     */
    public void deleteComment(int commentId){
        Dao.deleteById(comment.class,commentId);
    }

    /**
     * 更新，修改评论
     * @param cm
     */
    public void updateComment(comment cm){
       cm.update("comment","date");
    }
}
