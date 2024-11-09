package com.huahuadan.pattern.bridge;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 9:23
 * @description
 */
public class Windows extends OperatingSystem{

    public Windows(VideoPlayer player) {
        super(player);
    }

    @Override
    public void play(String fileName) {
        System.out.println("Windows play");
        player.play(fileName);
    }


}
