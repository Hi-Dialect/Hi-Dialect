package com.hidialect.hidialect_ws.service;

import com.hidialect.hidialect_ws.entity.Videos;

public interface IVideosService {
    Videos[] getLikeVdoByUserNo(int userNo);
    Videos[] getMadeByUserNo(int userNo);
    Videos[] search(String searchWords, Byte vdoType);
    Videos[] viewVdoByActId(int actId);
    Videos[] getPartVideos(int userNo);
    void addVdo(Videos video);
    void deleteVdo(int vdoId);
    void commentNumSub1(int vdoId);
    void commentNumAdd1(int vdoId);
    void likeNumAdd1(int vdoId);
    void dislikeNumAdd1(int vdoId);
    void likeNumSub1(int vdoId);
    void dislikeNumSub1(int vdoId);
    Videos getByVdoID(Integer vdoId);
}
