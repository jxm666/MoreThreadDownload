package com.example.demo;

import java.util.Date;

/**
 * @author xianmeng.jiang
 * @create 2021-07-04
 */
public class Test {
    public static void main(String[] args) {
        Date startDate = new Date();

        //下载文件url地址
        String url = "http://www.xxx.com/file";
        String fileName = "/Users/jsoft/Downloads/test.apk";
        int poolSize =10;
        DownloadFilePool pool = new DownloadFilePool(url, fileName, poolSize);
        pool.getFile();

        long old = 0;
        long now = 0;
        while( Util.sum >= Util.start ) {
            now = Util.start - old;
            old = Util.start;

            if(Util.sum == Util.start) {
                long t = new Date().getTime() - startDate.getTime();
                double speed = ((double)Util.sum / (t/1000.0))/1024.0/1024.0;

                System.out.println( "下载完成，用时：" + t/1000.0 +" s 平均网速：" + speed +" M/s" );
                break;
            }

            System.out.println( "网速：" + ((double)(now/0.5))/1024.0/1024.0 +" M/s,已完成：" + (Util.start / (double)Util.sum)*100 +"%" );

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
