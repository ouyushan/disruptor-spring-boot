package org.ouyushan.disruptor.tutorial;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

//@SpringBootTest
class DisruptorSpringBootTutorialApplicationTests {

    private  final Map<String,String> map = new HashMap<String,String>();

    @Test
    void contextLoads() {
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");

        System.out.println(map.keySet().stream().toArray().toString());

    }

}
