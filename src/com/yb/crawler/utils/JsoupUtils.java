package com.yb.crawler.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by 杨波 on 2016/12/25.
 */
public class JsoupUtils {
    public static String html(String url){
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc.toString();
    }
}
