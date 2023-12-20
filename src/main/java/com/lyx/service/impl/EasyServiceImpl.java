package com.lyx.service.impl;

import com.lyx.service.EasyService;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class EasyServiceImpl implements EasyService {
    @Override
    public String fetchData() {
        // 返回简单的 JSON 数据，你可以根据需求进行修改
        return "{ \"message\": \"Hello from backend!\" }";
    }

    @Override
    public String fetchDir() {
        try {
            // 目标 URL
            String url = "http://192.168.1.104:8083/api/dir";

            // 创建 URL 对象
            URL obj = new URL(url);

            // 打开连接
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            // 设置请求方法为 GET
            con.setRequestMethod("GET");

            // 获取响应码
            int responseCode = con.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // 读取响应内容
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // 打印响应内容
            System.out.println("Response: " + response.toString());
            return response.toString();
        } catch (Exception e) {
            // 处理异常
            e.printStackTrace();
            return null;
        }
    }
}
