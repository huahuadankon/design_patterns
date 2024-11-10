package com.huahuadan.pattern.bridge;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 9:23
 * @description
 */
public class Linux extends OperatingSystem{
    public Linux(VideoPlayer player) {
        super(player);
    }

    @Override
    public void play(String fileName) {
        System.out.println("Linux play");
        player.play(fileName);
    }
}
