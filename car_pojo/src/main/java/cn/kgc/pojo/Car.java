package cn.kgc.pojo;

import cn.kgc.utils.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
/**
 * @author liurui
 * @date $ {DATE} 16:04
 * id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `carName` VARCHAR(20),
    `carImg` VARCHAR(100),
    `carNum` VARCHAR(40),
    `carColor` VARCHAR(20),
    `carPrice` DOUBLE,
    `carOil` INT,
    `carCutNum` VARCHAR(60),
    `man` INT,
    `regTime` DATE,
    `cerifacteTime` DATE,
    `carType` INT,
    `carDesc` VARCHAR(100),
    `carStraus` INT
 */
public class Car implements Serializable {
    private Integer id;//车辆id
    private String carName;//车辆名称
    private String carImg;//车辆图片
    private String carNum;//车牌号码
    private String carColor;//车辆颜色
    private Double carPrice;//车辆日租价格
    private Integer carOil;//车辆油位
    private String carCutNum;//车辆发动机号
    private Integer man;//车辆荷载人数
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date regTime;//车辆注册时间date类型
    private String regTimeStr;//车辆注册时间string类型
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date cerifacteTime;//车辆发证时间date
    private String cerifaceTimeStr;//车辆发证时间string类型
    private Integer carType;//车辆类型
    private String carDesc;//车辆描述
    private Integer carStraus;//车辆状态    0：车辆待机  1：车辆出行


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarImg() {
        return carImg;
    }

    public void setCarImg(String carImg) {
        this.carImg = carImg;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public Double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }

    public Integer getCarOil() {
        return carOil;
    }

    public void setCarOil(Integer carOil) {
        this.carOil = carOil;
    }

    public String getCarCutNum() {
        return carCutNum;
    }

    public void setCarCutNum(String carCutNum) {
        this.carCutNum = carCutNum;
    }

    public Integer getMan() {
        return man;
    }

    public void setMan(Integer man) {
        this.man = man;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getRegTimeStr() {
        if(regTime!=null){
            regTimeStr= DateUtils.date2String(regTime,"yyyy-MM-dd HH:mm");
        }
        return regTimeStr;
    }

    public void setRegTimeStr(String regTimeStr) {
        this.regTimeStr = regTimeStr;
    }

    public Date getCerifacteTime() {
        return cerifacteTime;
    }

    public void setCerifacteTime(Date cerifacteTime) {
        this.cerifacteTime = cerifacteTime;
    }

    public String getCerifaceTimeStr() {
        if(cerifacteTime!=null){
            cerifaceTimeStr= DateUtils.date2String(cerifacteTime,"yyyy-MM-dd HH:mm");
        }
        return cerifaceTimeStr;
    }

    public void setCerifaceTimeStr(String cerifaceTimeStr) {
        this.cerifaceTimeStr = cerifaceTimeStr;
    }

    public Integer getCarType() {
        return carType;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public String getCarDesc() {
        return carDesc;
    }

    public void setCarDesc(String carDesc) {
        this.carDesc = carDesc;
    }

    public Integer getCarStraus() {
        return carStraus;
    }

    public void setCarStraus(Integer carStraus) {
        this.carStraus = carStraus;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carName='" + carName + '\'' +
                ", carImg='" + carImg + '\'' +
                ", carNum='" + carNum + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carPrice=" + carPrice +
                ", carOil=" + carOil +
                ", carCutNum='" + carCutNum + '\'' +
                ", man=" + man +
                ", regTime=" + regTime +
                ", regTimeStr='" + regTimeStr + '\'' +
                ", cerifacteTime=" + cerifacteTime +
                ", cerifaceTimeStr='" + cerifaceTimeStr + '\'' +
                ", carType=" + carType +
                ", carDesc='" + carDesc + '\'' +
                ", carStraus=" + carStraus +
                '}';
    }
}
