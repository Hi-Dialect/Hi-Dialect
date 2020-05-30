package com.hidialect.hidialect_ws.service;

import com.hidialect.hidialect_ws.entity.Comments;

public interface ICommentsService {
    Comments[] viewComment(int vdoId);
    Comments getCom(int cmtId);
    void deleteCom(int cmtId);
    int addComment(Comments cmt);
}
