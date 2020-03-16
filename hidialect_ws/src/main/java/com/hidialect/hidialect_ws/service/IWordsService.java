package com.hidialect.hidialect_ws.service;

import com.hidialect.hidialect_ws.entity.Words;

import java.lang.reflect.Array;

public interface IWordsService {
    Words getWordsByVdoId(Number VdoId);
    void editWords(Number VdoId, Words[] words);
}
