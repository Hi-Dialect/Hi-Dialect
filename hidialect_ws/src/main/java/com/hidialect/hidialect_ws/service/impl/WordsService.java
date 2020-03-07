package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.IWordsDao;
import com.hidialect.hidialect_ws.service.IWordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordsService implements IWordsService {
    @Autowired
    private IWordsDao iWordsDao;
}
