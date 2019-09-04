package cn.kgc.service;

import cn.kgc.pojo.Car;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author liurui
 * @date $ {DATE} 17:45
 */
public interface CarService {
    //分页查询车辆的全部信息
    PageInfo<Car> findByPage(int currPage, int pageSize);

    //保存车辆信息
    void save(Car car);
    //删除某一条数据
    void del(Integer id);
    //根据id回显数据
    Car findById(Integer id);
    //修改车辆数据
    void update(Car car);
    //删除选中的信息
    void delMany(Integer[] ids);
    //保存图片
    void inser_img(Car car);

    //id的排序
    PageInfo<Car> findByIdJx(int currPage, int pageSize);//降序

    /**
     * app端查询所有的车辆信息
     * @return
     */
    List<Car> findAllCar();

    //通过id查询车辆对象
    List<Car> findByIdCar(Integer id);
    //通过点击车辆类型查看车辆信息
    List<Car> findByCarType(Integer carType);

    List<Car> findByCarPrice();
}
