package com.hidialect.hidialect_ws.service.impl;

import com.hidialect.hidialect_ws.dao.IHistlookDao;
import com.hidialect.hidialect_ws.service.IHistlookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistlookService implements IHistlookService {
    @Autowired
    private IHistlookDao iHistlookDao;
}
