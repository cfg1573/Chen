package cn.kgc.pojo;

public class Order_Car {
    private String car_day;
    private String car_money;

    public String getCar_day() {
        return car_day;
    }

    public void setCar_day(String car_day) {
        this.car_day = car_day;
    }

    public String getCar_money() {
        return car_money;
    }

    public void setCar_money(String car_money) {
        this.car_money = car_money;
    }

    private String from_car;
    private String to_car;
//    用户自己的拍照
    private String image;

    public String getFrom_car() {
        return from_car;
    }

    public void setFrom_car(String from_car) {
        this.from_car = from_car;
    }

    public String getTo_car() {
        return to_car;
    }

    public void setTo_car(String to_car) {
        this.to_car = to_car;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    private  Integer id;
//    订单类型  待付款 待评价
    private String order_type;
//    车辆描述
    private  String car_status;
//    车辆门店
    private  String car_startShopName;
//    订单状况 待付款 交易成功
    private  String order_status;

    private String car_image;
    private String car_name;

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getCar_image() {
        return car_image;
    }

    public void setCar_image(String car_image) {
        this.car_image = car_image;
    }

    @Override
    public String toString() {
        return "Order_Car{" +
                "id=" + id +
                ", order_type='" + order_type + '\'' +
                ", car_status='" + car_status + '\'' +
                ", car_startShopName='" + car_startShopName + '\'' +
                ", order_status='" + order_status + '\'' +
                ", car_image='" + car_image + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrder_type() {
        return order_type;
    }

    public void setOrder_type(String order_type) {
        this.order_type = order_type;
    }

    public String getCar_status() {
        return car_status;
    }

    public void setCar_status(String car_status) {
        this.car_status = car_status;
    }

    public String getCar_startShopName() {
        return car_startShopName;
    }

    public void setCar_startShopName(String car_startShopName) {
        this.car_startShopName = car_startShopName;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }
}
