package com.yyp.sun.base.interfaces;

/**
 * Created by yyp on 2016/8/12.
 */
public interface SunView {

    void showLoadingIndicator(boolean isLoading); // 显示下拉加载圈
    void showLoading(); // 显示数据加载圈
    void hideLoading(); // 隐藏数据加载圈
    void initData(); // 初始化数据
}
