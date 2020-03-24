package com.hidialect.hidialect_ws.controller;

import com.hidialect.hidialect_ws.entity.VideoLabel;
import com.hidialect.hidialect_ws.service.IVideoLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/videolabel")
public class VideoLabelController {
    @Autowired
    private IVideoLabelService iVideoLabelService;

    @RequestMapping(value = "/deleteVdo",method = RequestMethod.POST)
    private void deleteVideoLabel(@RequestParam VideoLabel videoLabel) { iVideoLabelService.deleteVideoLabel(videoLabel); }

    @RequestMapping(value = "/addVideoLabel",method = RequestMethod.POST)
    private void addVideoLabel(@RequestParam int vdoId, @RequestParam int labelId) { iVideoLabelService.addVideoLabel(vdoId, labelId); }
}
