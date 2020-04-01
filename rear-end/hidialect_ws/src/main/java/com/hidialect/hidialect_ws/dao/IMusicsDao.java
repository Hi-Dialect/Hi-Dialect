package com.hidialect.hidialect_ws.dao;

import com.hidialect.hidialect_ws.entity.Musics;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IMusicsDao {
    Musics[] getByVdoId(@Param("vdoId")int vdoId);
    Musics[] getByMscId(@Param("mscId")int mscId);
    Musics[] searchMusicByName(@Param("mscNa")String mscNa);
}
