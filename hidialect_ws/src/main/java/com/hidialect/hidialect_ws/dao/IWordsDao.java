package com.hidialect.hidialect_ws.dao;

import com.hidialect.hidialect_ws.entity.Words;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;

@Repository
public interface IWordsDao {
    Words[] getWordsByVdoId(@Param("VdoId")Number VdoId);
    void editWords(@Param("VdoId")Number VdoId, @Param("words")Words[] words);
}
