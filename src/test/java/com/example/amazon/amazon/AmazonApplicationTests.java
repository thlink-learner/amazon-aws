package com.example.amazon.amazon;

import com.example.amazon.amazon.utils.AmazonConstant;
import com.example.amazon.amazon.utils.AmazonUntil;
import net.sf.json.JSONArray;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AmazonApplicationTests implements AmazonConstant {

    @Test
    public void test() {


        //***亚马逊提供密钥***
        String secretKey = "i9MX************************6K8n";
        HashMap<String, String> parameters = new HashMap<>();
        //***亚马逊提供访问id***
        parameters.put("AWSAccessKeyId", AmazonUntil.urlEncode("A*****************Q"));
        //***商家提供授权token***
        parameters.put("MWSAuthToken", AmazonUntil.urlEncode("amzn.mws.2**************************d"));
        //***商家提供卖家id***
        parameters.put("SellerId", AmazonUntil.urlEncode("A************L"));
        //***Request URL: http://docs.developer.amazonservices.com/zh_CN/dev_guide/DG_Endpoints.html***
        parameters.put("MarketplaceId.Id.1", "ATVPDKIKX0DER");
        JSONArray orders = new JSONArray();
        try {
            orders = AmazonUntil.doPost(POST_URL, parameters, secretKey);
        } catch (Exception e) {
            ;
        }

        System.out.println("获取订单的数据：\r\n"+orders);
        //todo 解析orders数组就是每一条订单的数据




    }

}
