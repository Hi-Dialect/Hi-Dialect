package com.hidialect.hidialect_ws.service;

import com.hidialect.hidialect_ws.entity.Labels;
import com.hidialect.hidialect_ws.entity.VideoLabel;

public interface IVideoLabelService {
    /* 日期：20200324
     * 创建人：徐悦皓 */
    Labels[] getLabelsByVdoId(int vdoId);
    VideoLabel[] viewVdoBylabel(int labelId);
    void deleteVideoLabel(VideoLabel videoLabel);
    void addVideoLabel(int vdoId, int labelId);
}
