package com.hidialect.hidialect_ws.controller;

import com.hidialect.hidialect_ws.service.IUserAttentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/userattention")
public class UserAttentionController {
    @Autowired
    private IUserAttentionService iUserAttentionService;
}
