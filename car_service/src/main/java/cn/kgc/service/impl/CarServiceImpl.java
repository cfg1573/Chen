package cn.kgc.service.impl;

import cn.kgc.dao.CarDao;
import cn.kgc.pojo.Car;
import cn.kgc.service.CarService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liurui
 * @date $ {DATE} 17:46
 */
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDao carDao;
    @Override
    public PageInfo<Car> findByPage(int currPage, int pageSize) {
        PageHelper.startPage(currPage,pageSize);
        List<Car> carList= carDao.findAll();
        PageInfo<Car> pageInfo = new PageInfo<>(carList, 2);
        return pageInfo;
    }

    /**
     * 保存车辆信息
     * @param car
     */
    @Override
    public void save(Car car) {
        carDao.save(car);
    }

    /**
     * 删除某一条数据
     * @param id
     */
    @Override
    public void del(Integer id) {
        carDao.del(id);
    }

    /**
     * 根据id回显数据
     * @param id
     * @return
     */
    @Override
    public Car findById(Integer id) {
        return carDao.findById(id);
    }

    /**
     * 修改车辆数据
     * @param car
     */
    @Override
    public void update(Car car) {
        carDao.update(car);
    }

    /**
     * 删除选中的数据
     * @param ids
     */
    @Override
    public void delMany(Integer[] ids) {
        if(ids!=null){
            for(Integer id:ids){
                carDao.del(id);
            }
        }
    }

    /**
     * 保存图片
     * @param car
     */
    @Override
    public void inser_img(Car car) {
        carDao.inser_img(car);
    }

    @Override
    public PageInfo<Car> findByIdJx(int currPage, int pageSize) {
        PageHelper.startPage(currPage,pageSize);
        List<Car> carList= carDao.findByIdJx();
        PageInfo<Car> pageInfo = new PageInfo<>(carList, 2);
        return pageInfo;
    }

    /**
     * app端查询所有车辆信息
     * @return
     */
    @Override
    public List<Car> findAllCar() {
        return carDao.findAllCar();
    }


    /**
     * 通过id查询车辆id情况
     * @param id
     * @return
     */
    @Override
    public List<Car> findByIdCar(Integer id) {
        return carDao.findByIdCar(id);
    }

    /**
     * 根据车辆类型选择车辆信息
     * @param carType
     * @return
     */
    @Override
    public List<Car> findByCarType(Integer carType) {
        return carDao.findByCarType(carType);
    }

    @Override
    public List<Car> findByCarPrice() {
        return carDao.findByCarPrice();
    }
}
