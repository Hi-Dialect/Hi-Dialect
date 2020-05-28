package com.hidialect.hidialect_ws.controller;

import com.hidialect.hidialect_ws.entity.Words;
import com.hidialect.hidialect_ws.service.IWordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/words")
public class WordsController {
    @Autowired
    private IWordsService iWordsService;
    /* 日期：20200316
     * 创建人：徐悦皓 */

    @RequestMapping(value = "/getWordsByVdoId",method = RequestMethod.POST)
    private Words[] getWordsByVdoId(@RequestParam int vdoId){
        return iWordsService.getWordsByVdoId(vdoId);
    }

    @RequestMapping(value = "/editWords",method = RequestMethod.POST)
    private int editWords(@RequestBody Words[] words){
        int vdoId = words[0].getVdoId();
        iWordsService.deleteWords(vdoId);
        iWordsService.insertWords(words);
        return 1;
    }


}
