package com.huahuadan.pattern.factory.abstractfactory;

public interface ElectronicsFactory {
    Phone createPhone();
    TV createTV();
}