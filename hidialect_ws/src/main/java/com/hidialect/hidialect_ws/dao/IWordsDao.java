package com.hidialect.hidialect_ws.dao;

import com.hidialect.hidialect_ws.entity.Words;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IWordsDao {
    Words[] getWordsByVdoId(@Param("vdoId")int vdoId);
    void deleteWords(@Param("vdoId")int vdoId);
    void insertWords(Words word);
}
