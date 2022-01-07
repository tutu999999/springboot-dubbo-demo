package com.moon.provider.service.impl;

import com.moon.demo.dto.CarDto;
import com.moon.demo.serivce.MadeCarService;
import com.moon.provider.domain.Car;
import com.moon.provider.domain.CarMapper;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class MadeCarServerImpl implements MadeCarService {
    @Override
    public CarDto made() {
        //
        Car car = new Car();
        car.setType(Car.CarType.BUS);
        car.setMake("test");
        car.setNumberOfSeats(11);
        return CarMapper.INSTANCE.carToCarDto(car);
    }
}
