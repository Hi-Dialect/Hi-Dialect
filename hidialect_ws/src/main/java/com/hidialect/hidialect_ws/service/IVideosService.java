package com.hidialect.hidialect_ws.service;

import com.hidialect.hidialect_ws.entity.Videos;

public interface IVideosService {
    Videos[] getMadeByUserNo(Number userNo);
}
