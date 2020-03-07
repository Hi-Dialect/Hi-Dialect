package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.IMusicsDao;
import com.hidialect.hidialect_ws.service.IMusicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicsService implements IMusicsService {
    @Autowired
    private IMusicsDao iMusicsDao;
}
