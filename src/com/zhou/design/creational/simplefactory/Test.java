package com.zhou.design.creational.simplefactory;


/**
 * @author Daolin
 * @date 2021/01/07
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if(video == null){
            return;
        }
        video.produce();
    }

}
