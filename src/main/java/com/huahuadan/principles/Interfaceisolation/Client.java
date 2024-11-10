package com.huahuadan.principles.Interfaceisolation;


/**
 * 应当为各个模块提供细化、专门的接口，避免依赖不需要的接口方法。
 */

public class Client {
    public static void main(String[] args) {
        //创建黑马安全门对象
        HeiMaSafetyDoor door = new HeiMaSafetyDoor();
        //调用功能
        door.antiTheft();
        door.fireproof();
        door.waterproof();

        System.out.println("============");
        //创建传智安全门对象
        ItcastSafetyDoor door1 = new ItcastSafetyDoor();
        //调用功能
        door1.antiTheft();
        door1.fireproof();
    }
}
