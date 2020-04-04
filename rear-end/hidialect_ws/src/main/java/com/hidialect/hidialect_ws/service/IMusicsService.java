package com.hidialect.hidialect_ws.service;

import com.hidialect.hidialect_ws.entity.Musics;

public interface IMusicsService {
    Musics[] getByVdoId(int vdoId);
    Musics[] getByMscId(int mscId);
    Musics[] searchMusicByName(String mscNa);
    Musics[] searchMusicByType(byte bgmType);
}
