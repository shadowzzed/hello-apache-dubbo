package com.zed.apache.dubbo.consumer.controller;

import com.zed.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zed
 * @date 2020/2/21 下午10:38
 * @contact shadowl91@163.com
 */
@RestController
public class EchoController {

    @Reference(version = "1.0.0")
    private EchoService echoService;


    @GetMapping("/echo/{str}")
    public String echo(@PathVariable("str") String str) {
        return echoService.echo(str);
    }

}
