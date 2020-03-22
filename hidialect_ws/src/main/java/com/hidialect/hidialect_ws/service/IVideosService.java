package com.hidialect.hidialect_ws.service;

import com.hidialect.hidialect_ws.entity.Videos;

public interface IVideosService {
    Videos[] getLikeVdoByUserNo(int userNo);
    Videos[] getMadeByUserNo(int userNo);
    Videos[] search(String searchWords, String vdoType);
    Videos[] viewVdoByActId(int actId);
}
