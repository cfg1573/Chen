package cn.kgc.pojo;

/**
 * @author Lizhenye
 * @date 2019/8/26  9:48
 */
//这个是租车评论表数据
public class CarComment {
    //评论的id
    private int cid;
//    用户姓名
    private  String username;
    //    用户评价
    private String userEvaluation;
    //    评价日期
    private String date;
    //    用户评价图片
    private String img_url;
    //用户头像
    private String user_Headportrait;

    //状态
    private String state;
    //刷单
    private String scalping;

    @Override
    public String toString() {
        return "CarComment{" +
                "cid=" + cid +
                ", username='" + username + '\'' +
                ", userEvaluation='" + userEvaluation + '\'' +
                ", date='" + date + '\'' +
                ", img_url='" + img_url + '\'' +
                ", user_Headportrait='" + user_Headportrait + '\'' +
                ", state='" + state + '\'' +
                ", scalping='" + scalping + '\'' +
                '}';
    }

    public String getscalping() {
        return scalping;
    }

    public void setscalping(String scalping) {
        this.scalping = scalping;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserEvaluation() {
        return userEvaluation;
    }

    public void setUserEvaluation(String userEvaluation) {
        this.userEvaluation = userEvaluation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getUser_Headportrait() {
        return user_Headportrait;
    }

    public void setUser_Headportrait(String user_Headportrait) {
        this.user_Headportrait = user_Headportrait;
    }
}



