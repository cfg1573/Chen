package cn.kgc.dao;

import cn.kgc.pojo.Car;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liurui
 * @date $ {DATE} 17:46
 */
@Repository
public interface CarDao {
    /**
     * 车辆管理的全部查询
     * @return
     */
    @Select("select * from car")
    List<Car> findAll();

    /**
     * 保存车辆信息
     * @param car
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
    @Insert("insert into car(carName,carNum,carColor,carPrice,carOil,carCutNum,man,regTime,cerifacteTime,carType,carDesc,carStraus) " +
            "values(#{carName},#{carNum},#{carColor},#{carPrice}," +
            "#{carOil},#{carCutNum},#{man},#{regTime},#{cerifacteTime}," +
            "#{carType},#{carDesc},#{carStraus})")
    void save(Car car);

    /**
     * 删除某一条数据
     * @param id
     */
    @Delete("delete from car where id=#{id}")
    void del(Integer id);

    /**
     * 根据id回显数据
     * @param id
     * @return
     */
    @Select("select * from car where id=#{id}")
    Car findById(Integer id);

    /**
     * UPDATE car SET carName="雄安退",carImg=NULL,carNum="豫U-111111",carColor="紫色",
     carPrice=100,carCutNum="234346o765",regTime="2018-09-09",cerifacteTime="2019-02-01",
     carType=1,carDesc="啊手动阀手动阀",carStraus=0 WHERE id=38;
     * 修改数据
     * @param car
     */
    @Update("update car set carName=#{carName},carNum=#{carNum},carColor=#{carColor},carPrice=#{carPrice},carCutNum=#{carCutNum},regTime=#{regTime},cerifacteTime=#{cerifacteTime},carType=#{carType},carDesc=#{carDesc},carStraus=#{carStraus} where id=#{id}")
    void update(Car car);

    /**
     * 保存图片
     * @param car
     */
    @Update("insert into car(carName,carImg,carNum,carColor,carPrice,carOil,carCutNum,man,regTime,cerifacteTime,carType,carDesc,carStraus) " +
            "values(#{carName},#{carImg},#{carNum},#{carColor},#{carPrice}," +
            "#{carOil},#{carCutNum},#{man},#{regTime},#{cerifacteTime}," +
            "#{carType},#{carDesc},#{carStraus})")
    void inser_img(Car car);

    /**
     * id按钮的排序
     */
    @Select("select * from car order by id desc")
    List<Car> findByIdJx();

    /**
     * App端查询所有车辆信息
     * @return
     */
    @Select("select * from car")
    List<Car> findAllCar();
    //模糊查询
    @Select("select * from car where carName like '% carName %'")
    List<Car> findByCarName(String carName);

    //id查询
    @Select("select * from car where id=#{id}")
    List<Car> findByIdCar(Integer id);
    //根据车辆类型选择车辆
    @Select("select * from car where carType=#{carType}")
    List<Car> findByCarType(Integer carType);
    @Select("select * from car where carPrice")
    List<Car> findByCarPrice();
}
