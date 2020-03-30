package com.hidialect.hidialect_ws.controller;

import com.hidialect.hidialect_ws.entity.VideoLabel;
import com.hidialect.hidialect_ws.service.IVideoLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/videolabel")
public class VideoLabelController {
    @Autowired
    private IVideoLabelService iVideoLabelService;

    @RequestMapping(value = "/deleteVideoLabel",method = RequestMethod.POST)
    private void deleteVideoLabel(@RequestBody VideoLabel videoLabel) { iVideoLabelService.deleteVideoLabel(videoLabel); }

    @RequestMapping(value = "/addVideoLabel",method = RequestMethod.POST)
    private void addVideoLabel(@RequestParam int vdoId, @RequestParam int labelId) { iVideoLabelService.addVideoLabel(vdoId, labelId); }
}
