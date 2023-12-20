package com.lyx.controller;

import com.lyx.service.EasyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class EasyController {
    @Autowired
    private EasyService easyService;

    @RequestMapping(value = "/detail4",method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:8080")
    @ResponseBody
    public String getDetail4(@RequestParam String fileName){
        // 在这里使用获取到的 fileName 参数进行处理
        System.out.println("Received fileName: " + fileName);

        return fileName;
    }

    @RequestMapping(value = "/dir")
    @CrossOrigin(origins = "http://localhost:8080")
    @ResponseBody
    public String getDir(){
        return easyService.fetchDir();
    }
}
