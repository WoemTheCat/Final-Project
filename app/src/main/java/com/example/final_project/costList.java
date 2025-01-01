package com.example.final_project;

public class costList {
    private String _id;// 私有變數，存儲費用的ID
    private String Title;// 費用的標題，例如 "餐廳" 或 "交通"等等之類的。
    private String Date;// 費用的日期，例如 "2025-01-01"
    private String Money;// 費用的金額，例如 "500" 或 "1000"元

    public String getMoney() {
        return Money;
    }//取得費用的金額


    public void setMoney(String money) {
        Money = money;
    }//設定費用的金額

    public String getDate() {
        return Date;
    }//取得費用的日期

    public void setDate(String date) {
        Date = date;
    }//設定費用的日期

    public String getTitle() {
        return Title;
    }//取得費用的標題

    public void setTitle(String title) {
        Title = title;
    }//設定費用的標題

    public String get_id() {
        return _id;
    }//取得費用的ID

    public void set_id(String id) {
        this._id = _id;
    }//設定費用的ID
}
