package com.example.redissession;

import ch.qos.logback.core.pattern.FormatInfo;
import com.sun.corba.se.impl.resolver.FileResolverImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.DelayQueue;

@SpringBootApplication
//@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 1800)
public class RedisSessionApplication {
    public static void main(String[] args) {
        DelayQueue queue = new DelayQueue();
    }
}
