package com.zed.apache.dubbo.provider.service;

import com.zed.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author Zed
 * @date 2020/2/21 下午10:22
 * @contact shadowl91@163.com
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String str) {
        return "Echo Dubbo " + str;
    }
}
