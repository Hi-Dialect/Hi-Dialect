package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.IWordsDao;
import com.hidialect.hidialect_ws.entity.Words;
import com.hidialect.hidialect_ws.service.IWordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;

@Service
public abstract class WordsService implements IWordsService {
    @Autowired
    private IWordsDao iWordsDao;

    @Override
    public Words[] getWordsByVdoId(Number VdoId) {
        return iWordsDao.getWordsByVdoId(VdoId);
    }

    @Override
    public void editWords(Number VdoId, Words[] words) {
        iWordsDao.editWords(VdoId, words);
    }
}
