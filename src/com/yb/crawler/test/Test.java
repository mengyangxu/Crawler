package com.yb.crawler.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 杨波 on 2016/12/25.
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i=0 ;i<10;i++){
            list.add("http://tieba.baidu.com/f?kw=%E6%9D%8E%E6%AF%85&ie=utf-8&pn="+i*50);
        }
        for (String str:list){
            System.out.println(str);
        }
    }
}
