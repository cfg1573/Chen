package cn.kgc.pojo;

public class User {
//    id
    private Integer uid;
//    邮箱
    private String email;
//    电话
    private String telephone;
//    验证码
    private String code;
//    用户名
    private String name;
//    地址
    private String address;
//    城市
    private String cityName;
//    头像
    private String user_image;
//    金额
    private Double money;
    //    积分
    private Integer member;
    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cityName='" + cityName + '\'' +
                ", user_image='" + user_image + '\'' +
                ", money=" + money +
                ", member=" + member +
                '}';
    }



    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getUser_image() {
        return user_image;
    }

    public void setUser_image(String user_image) {
        this.user_image = user_image;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getMember() {
        return member;
    }

    public void setMember(Integer member) {
        this.member = member;
    }
}
