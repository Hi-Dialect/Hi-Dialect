package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.ICommentsDao;
import com.hidialect.hidialect_ws.entity.Comments;
import com.hidialect.hidialect_ws.service.ICommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsService implements ICommentsService {
    @Autowired
    private ICommentsDao iCommentsDao;

    @Override
    public Comments[] viewComment(int vdoId) {
        return iCommentsDao.viewComment(vdoId);
    }

    @Override
    public Comments getCom(int cmtId) {
        return iCommentsDao.getCom(cmtId);
    }

    @Override
    public void deleteCom(int cmtId) {
        iCommentsDao.deleteCom(cmtId);
    }

    @Override
    public int addComment(Comments cmt) {
        iCommentsDao.addComment(cmt);
        return cmt.getCmtId();
    }
}
