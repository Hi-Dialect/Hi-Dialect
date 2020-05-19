package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.IMusicsDao;
import com.hidialect.hidialect_ws.entity.Musics;
import com.hidialect.hidialect_ws.service.IMusicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicsService implements IMusicsService {
    @Autowired
    private IMusicsDao iMusicsDao;

    @Override
    public Musics[] getByVdoId(int vdoId) {
        return iMusicsDao.getByVdoId(vdoId);
    }

    @Override
    public Musics[] getByMscId(int mscId) {
        return iMusicsDao.getByMscId(mscId);
    }

    @Override
    public Musics[] searchMusicByName(String mscNa) {
        return iMusicsDao.searchMusicByName(mscNa);
    }

    @Override
    public Musics[] searchMusicByType(byte bgmType) {
        return iMusicsDao.searchMusicByType(bgmType);
    }
}
