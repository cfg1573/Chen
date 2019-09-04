package cn.kgc.pojo;


import cn.kgc.utils.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liurui
 * @date $ {DATE} 15:27
 */
public class UserAdmin implements Serializable {
    private Integer id;
    private String username;
    private String email;
    private String password;
    private String qq;
    private String telephone;
    private Integer straus;
    private String admin_img;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date login_time;
    private String login_timeStr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getStraus() {
        return straus;
    }

    public void setStraus(Integer straus) {
        this.straus = straus;
    }

    public String getAdmin_img() {
        return admin_img;
    }

    public void setAdmin_img(String admin_img) {
        this.admin_img = admin_img;
    }

    public Date getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Date login_time) {
        this.login_time = login_time;
    }

    public String getLogin_timeStr() {
        if(login_time!=null){
            login_timeStr= DateUtils.date2String(login_time,"yyyy-MM-dd HH:mm:ss");
        }
        return login_timeStr;
    }

    public void setLogin_timeStr(String login_timeStr) {
        this.login_timeStr = login_timeStr;
    }
}
