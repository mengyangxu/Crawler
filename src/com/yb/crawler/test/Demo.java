package com.yb.crawler.test;

import com.yb.crawler.utils.JsoupUtils;
import com.yb.crawler.utils.RegexStringUtils;

import java.util.List;

/**
 * Created by 杨波 on 2016/12/24.
 */
public class Demo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String url = "http://tieba.baidu.com/f?kw=%E6%9D%8E%E6%AF%85&ie=utf-8&pn="+i*50;
            //获取页面为String类型
            String html = JsoupUtils.html(url);
//            System.out.println(html);
            //正则表达式
            String regex = "a href=\".+?\" title=\"(.+?)\" target=\"_blank\"";
            //匹配正则表达式
            List<String> lists = RegexStringUtils.regexString(html, regex);
            for (String str : lists) {
                System.out.println(str);
            }
        }
    }
}
