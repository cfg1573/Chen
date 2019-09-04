package cn.kgc;

import java.util.Date;

public class Orders {
    private Integer oid;//id
    private String cityStrName;//取车城市
    private String cityOverName;//还车城市
    private String startTime;//取车时间
    private String closeTime;//还车时间
    private Integer orderStarus;//订单状态
    private Double money;//金额
    private Integer orderNum;//订单编号
    private String startShopName;//取车的门店名称
    private String overShopName;//还车的门店名称
    private Integer days;//预约车辆的天数

    @Override
    public String toString() {
        return "Orders{" +
                "oid=" + oid +
                ", cityStrName='" + cityStrName + '\'' +
                ", cityOverName='" + cityOverName + '\'' +
                ", startTime='" + startTime + '\'' +
                ", closeTime='" + closeTime + '\'' +
                ", orderStarus=" + orderStarus +
                ", money=" + money +
                ", orderNum=" + orderNum +
                ", startShopName='" + startShopName + '\'' +
                ", overShopName='" + overShopName + '\'' +
                ", days=" + days +
                '}';
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getCityStrName() {
        return cityStrName;
    }

    public void setCityStrName(String cityStrName) {
        this.cityStrName = cityStrName;
    }

    public String getCityOverName() {
        return cityOverName;
    }

    public void setCityOverName(String cityOverName) {
        this.cityOverName = cityOverName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public Integer getOrderStarus() {
        return orderStarus;
    }

    public void setOrderStarus(Integer orderStarus) {
        this.orderStarus = orderStarus;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getStartShopName() {
        return startShopName;
    }

    public void setStartShopName(String startShopName) {
        this.startShopName = startShopName;
    }

    public String getOverShopName() {
        return overShopName;
    }

    public void setOverShopName(String overShopName) {
        this.overShopName = overShopName;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }
}
