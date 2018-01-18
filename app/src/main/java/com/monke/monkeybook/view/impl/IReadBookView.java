//Copyright (c) 2017. 章钦豪. All rights reserved.
package com.monke.monkeybook.view.impl;

import android.graphics.Paint;
import com.monke.basemvplib.IView;

public interface IReadBookView extends IView {

    /**
     * @return 获取当前阅读界面UI画笔
     */
    Paint getPaint();

    /**
     * 小说数据初始化成功
     * @param durChapterIndex 当前章节
     * @param chapterAll 所有章节数
     * @param durPageIndex 当前页数
     */
    void initContentSuccess(int durChapterIndex, int chapterAll, int durPageIndex);

    /**
     * 开始加载
     */
    void startLoadingBook();

    void setHpbReadProgressMax(int count);

    void initPop();

    void showLoadBook();

    void dismissLoadBook();

    void loadLocationBookError();

    void showOnLineView();

    void finish();

    String getNoteUrl();
}