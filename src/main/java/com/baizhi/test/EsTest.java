package com.baizhi.test;

import com.baizhi.EsApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = EsApp.class)
@RunWith(SpringRunner.class)

public class EsTest {
    @Test
    public void findAll() {
        System.out.println("1");
         System.out.println("2");
    }

}
