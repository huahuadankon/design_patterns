package com.huahuadan.pattern.bridge;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 9:36
 * @description
 */
public class MP4Player implements VideoPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("MP4格式文件播放" + fileName);
    }
}
