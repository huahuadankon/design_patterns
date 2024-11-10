package com.huahuadan.pattern.bridge;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 9:37
 * @description
 */
public class AviPlayer implements VideoPlayer {
    public void play(String fileName) {
        System.out.println("Avi文件格式播放" + fileName);
    }
}
