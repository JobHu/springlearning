package com.jobhu.annoation.service.impl;

//import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jobhu.annoation.dao.IUserDao;
import com.jobhu.annoation.service.ICatService;

//@Component 这个其实也可以，理解一下二者之间的区别，@Component使用于一个没有特别含义的类的注入
@Service
public class CatServiceImpl implements ICatService{

	@Autowired
	@Qualifier("UserDaoImpl")//当dao层的接口有多个实现类的时候，使用这个方法，指定唯一一个实现接口，当service层通用如此
	//这个地方可以使用java的@Resource注解，当有多个实现类的时候，这样使用@Resource(name ="UserDaoImpl")，指定一个
	//@Autowired和@Resource的区别
	/**
	 * @Autowired是Spring的注解，Autowired默认先按 byType，
	 * 如果发现找到多个 bean，则，又按照 byName方式比对，如果还有多个，则报出异常；
	 */
	/**
	 * @Resource 是JDK1.6支持的注解，默认按照名称(ByName)进行装配, 
	 * 如果没有指定 name属性，当注解写在字段上时，默认取字段名，按照名称查找，
	 * 如果注解写在 setter方法上默认取属性名进行装配。当找不到与名称匹配的 bean时才按照类型进行装配。
	 */
	//@Resource
	private IUserDao userDao;
	
	@Override
	public String queryNameById(Integer id) {
		
		return null;
	}

}
