package com.hidialect.hidialect_ws.service;

import com.hidialect.hidialect_ws.entity.Labels;

import java.util.List;

public interface ILabelsService {
    void addLabel(Labels labels);
    List<Labels> getAllLabels();
    Labels getByLabelId(Integer labelId);
}
