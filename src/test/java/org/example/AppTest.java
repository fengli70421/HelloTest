package org.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    @Test
    public void testAddNumber(){
        System.out.println("执行App类 addNumber() 方法");
        int n1 = 10;
        int n2 = 20;
        int res = 0;
        App app = new App();
        res = app.add(n1, n2);
        //期望值，实际值
        Assert.assertEquals( 30, res);
    }
}
