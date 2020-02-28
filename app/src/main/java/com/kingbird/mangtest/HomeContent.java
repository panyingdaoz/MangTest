package com.kingbird.mangtest;

/**
 * @ClassName: HomeContent
 * @Description: 内容
 * @Author: Pan
 * @CreateDate: 2020/2/28 15:25:21
 */
public class HomeContent {
    //    private String mHeadline;
    private String mSubtitle;
    private int mImageView;
    private String content;

    public HomeContent(String mSubtitle, int mImageView, String content) {
        this.mSubtitle = mSubtitle;
        this.mImageView = mImageView;
        this.content = content;
    }

    public String getmSubtitle() {
        return mSubtitle;
    }

    public void setmSubtitle(String mSubtitle) {
        this.mSubtitle = mSubtitle;
    }

    public int getmImageView() {
        return mImageView;
    }

    public void setmImageView(int mImageView) {
        this.mImageView = mImageView;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
