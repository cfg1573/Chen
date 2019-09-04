package cn.kgc.pojo;

public class Shop {
    private Integer id;//id
    private String quyu;//区域
    private String shopName;//门店名
    private String shopAddress;//地址
    private Integer quDH;//区域代号

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", quyu='" + quyu + '\'' +
                ", shopName='" + shopName + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                ", quDH=" + quDH +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuyu() {
        return quyu;
    }

    public void setQuyu(String quyu) {
        this.quyu = quyu;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public Integer getQuDH() {
        return quDH;
    }

    public void setQuDH(Integer quDH) {
        this.quDH = quDH;
    }
}
