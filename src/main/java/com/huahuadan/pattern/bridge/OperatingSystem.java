package com.huahuadan.pattern.bridge;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 9:22
 * @description
 */
public abstract class OperatingSystem {
    protected VideoPlayer player;
    public OperatingSystem(VideoPlayer player) {
        this.player = player;
    }
    public abstract void play(String fileName);

}
