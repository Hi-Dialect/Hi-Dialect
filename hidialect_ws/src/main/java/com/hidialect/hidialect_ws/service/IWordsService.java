package com.hidialect.hidialect_ws.service;

import com.hidialect.hidialect_ws.entity.Words;

public interface IWordsService {
    Words[] getWordsByVdoId(int vdoId);
    void deleteWords(int vdoId);
    void insertWords(Words[] words);
}
