package org.mybatis.needdesign.factory;

/**
 * @author 邱润泽 bullock
 */
public class SportFactory implements  CarFactory {
    @Override
    public ICar CreateCar() {
        return new SportCar();
    }
}
