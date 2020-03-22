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

    public Comments[] viewComment(int vdoId) {
        return iCommentsDao.viewComment(vdoId);
    }

}
