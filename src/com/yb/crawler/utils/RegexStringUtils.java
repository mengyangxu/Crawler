package com.yb.crawler.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 杨波 on 2016/12/24.
 */
public class RegexStringUtils {
    public static List<String> regexString(String targetStr, String patternStr){
        Pattern pattern = Pattern.compile(patternStr);
        // 定义一个matcher用来做匹配
        Matcher matcher = pattern.matcher(targetStr);
        // 如果找到了
        List<String> list = new ArrayList<String>();
        while (matcher.find()) {
            String result =matcher.group(1);
            if (result!=null)
            list.add(result);
        }
        return list;
    }
}
