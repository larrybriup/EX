package spring.ex.eagle.ioc.factory;

import java.util.Random;

import org.springframework.beans.factory.FactoryBean;

public class FactoryBeanimpl implements FactoryBean<Double> {

	public Double getObject() throws Exception {
		return new Random().nextDouble();
	}

	public Class<?> getObjectType() {
		return Double.class;
	}

	public boolean isSingleton() {
		return false;
	}

}
