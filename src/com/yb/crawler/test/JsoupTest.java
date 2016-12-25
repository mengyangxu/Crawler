package com.yb.crawler.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 杨波 on 2016/12/24.
 */
public class JsoupTest {
    public static void main(String[] args) {
        for (int j = 0; j < 100; j++) {
            Document doc = null;
            Elements divs = null;
            //回复
            List<String> reps = new ArrayList<String>();
            //帖子主题
            List<String> titles = new ArrayList<String>();
            //作者
            List<String> authers = new ArrayList<String>();
            //发帖时间
            List<String> times = new ArrayList<String>();
            String url = "http://tieba.baidu.com/f?kw=%E6%9D%8E%E6%AF%85&ie=utf-8&pn="+j*50;
            //List<String> list =new ArrayList<String>();
            try {
                //找到当前页面的所有满足条件的div
                divs = Jsoup.connect(url).get().getElementsByAttributeValue("class", "t_con cleafix");
                //遍历
                for (Element div : divs) {
                    String title = div.select(".j_th_tit").attr("title");
                    titles.add(title);
                    String rep = div.getElementsByAttributeValue("class", "threadlist_rep_num center_text").text();
                    reps.add(rep);
                    String auther = div.select(".tb_icon_author span").text();
                    authers.add(auther);
                    String time = div.select("span.is_show_create_time").text();
                    times.add(time);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < divs.size(); i++) {
                System.out.println("帖子标题：" + titles.get(i));
                System.out.println("作者：" + authers.get(i));
                System.out.println("回复量：" + reps.get(i));
                System.out.println("创建时间：" + times.get(i));
                System.out.println();
            }
        }

    }
}
