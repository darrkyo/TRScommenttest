package com.trs.Service;

import com.season.core.db.Dao;
import com.trs.Dao.commentDao;
import com.trs.model.comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SONY on 2016/12/16.
 */
@Service
public class commentService {

    @Autowired
    private commentDao cmdao;

    /**
     * 新增
     * @param cm  所要新增的对象
     * @return
     */
    public int addComment(comment cm){
        comment ls=cmdao.addComment(cm);
        if(ls!=null){
            return 1;
        }
        return -1;
    }

    /**
     * 获取所有
     * @return
     */
    public List<comment> getAllCommentById(int commentId ){
        return cmdao.getCommentById(commentId);
    }

    /**
     * 删除
     * @param commentId 需要删除的id
     */
    public void deleteComment(int commentId){
        cmdao.deleteComment(commentId);
    }

    /**
     * 修改
     * @param cm 需要修改的对象
     */
    public void updateComment(comment cm){
        cmdao.updateComment(cm);
    }
}
