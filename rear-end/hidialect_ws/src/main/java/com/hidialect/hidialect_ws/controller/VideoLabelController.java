package com.hidialect.hidialect_ws.controller;

import com.hidialect.hidialect_ws.entity.VideoLabel;
import com.hidialect.hidialect_ws.entity.Videos;
import com.hidialect.hidialect_ws.service.IVideoLabelService;
import com.hidialect.hidialect_ws.service.IVideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/videolabel")
public class VideoLabelController {
    @Autowired
    private IVideoLabelService iVideoLabelService;

    @Autowired
    private IVideosService iVideosService;

    @RequestMapping(value = "/deleteVideoLabel",method = RequestMethod.POST)
    private void deleteVideoLabel(@RequestBody VideoLabel videoLabel) { iVideoLabelService.deleteVideoLabel(videoLabel); }

    @RequestMapping(value = "/addVideoLabel",method = RequestMethod.POST)
    private void addVideoLabel(@RequestParam int vdoId, @RequestParam int labelId) { iVideoLabelService.addVideoLabel(vdoId, labelId); }

    @RequestMapping(value = "/viewVdoBylabel",method = RequestMethod.POST)
    private List<Videos> viewVdoBylabel(@RequestParam int labelId) {
       VideoLabel[] vls= iVideoLabelService.viewVdoBylabel(labelId);
       List<Videos> vdos = new ArrayList<Videos>();
        for(int i=0; i<vls.length; i++) {
            vdos.add(iVideosService.getByVdoID(vls[i].getVdoId()));
        }
        return vdos;
    }
}
