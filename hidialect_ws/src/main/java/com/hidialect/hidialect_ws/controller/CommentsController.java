package com.hidialect.hidialect_ws.controller;

import com.hidialect.hidialect_ws.service.ICommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/comments")
public class CommentsController {
    @Autowired
    private ICommentsService iCommentsService;
}
