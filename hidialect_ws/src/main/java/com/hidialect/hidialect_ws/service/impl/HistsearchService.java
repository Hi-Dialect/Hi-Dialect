package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.IHistsearchDao;
import com.hidialect.hidialect_ws.service.IHistsearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistsearchService implements IHistsearchService {
    @Autowired
    private IHistsearchDao iHistsearchDao;
}
