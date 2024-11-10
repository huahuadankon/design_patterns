package com.huahuadan.pattern.bridge;

/**
 * @author liuyichen
 * @version 1.0
 * @date 2024/11/9 9:37
 * @description 桥接模式的核心思想是将抽象部分与实现部分分离，通过组合关系而非继承关系来连接抽象与实现。就比如这个例子，操作系统与视频播放器
 * 是两个维度，要实现不同的视频格式在不同的操作系统上播放，就可以将视频播放器接口作为操作系统抽象类的一个字段，同时也是构造器的参数。
 * 这样创建具体操作系统系统的时候就可以传递具体的播放器，实现上述目标。而不用创建LinuxAvi,LinuxMp4这么多类。
 * 桥接关系：OperatingSystem中持有VideoPlayer的引用。
 * 当一个系统具有两个维度，且互不影响的可以使用。
 */
public class Client {
    public static void main(String[] args) {
        Linux linux = new Linux(new AviPlayer());
        linux.play("轻音少女");
        System.out.println("==================");
        Windows windows = new Windows(new MP4Player());
        windows.play("孤独摇滚");
    }
}
