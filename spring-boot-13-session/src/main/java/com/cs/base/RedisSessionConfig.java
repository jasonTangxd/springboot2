package com.cs.base;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@EnableRedisHttpSession
//如果需要添加失效时间可以使用以下的写法：
//@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 60) //1分钟失效
public class RedisSessionConfig {

}
