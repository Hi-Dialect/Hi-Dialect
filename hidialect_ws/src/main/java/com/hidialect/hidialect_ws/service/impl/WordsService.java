package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.IWordsDao;
import com.hidialect.hidialect_ws.entity.Words;
import com.hidialect.hidialect_ws.service.IWordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordsService implements IWordsService {
    @Autowired
    private IWordsDao iWordsDao;

    @Override
    public Words[] getWordsByVdoId(int vdoId) {
        return iWordsDao.getWordsByVdoId(vdoId);
    }

    @Override
    public void deleteWords(int vdoId) {
        iWordsDao.deleteWords(vdoId);
    }

    @Override
    public void insertWords(Words[] words) {
        for(Words word: words) {
            iWordsDao.insertWords(word);
        }
    }

}
