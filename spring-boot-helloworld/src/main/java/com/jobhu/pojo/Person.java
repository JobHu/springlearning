package com.jobhu.pojo;

import java.util.Date;
import java.util.List;
import java.util.Map;


import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
/**
 * 将配置文件中的每一个属性映射到组件中
 * @author Administrator
 *
 */
@Component
//@Validated
@ConfigurationProperties(prefix = "person")
//@PropertySource(value = {"classpath:person.properties"})//读取外部的配置文件
public class Person {
      
	//@Email //@value不支持校验
	//@Value("${person.last-name}")//不支持松耦合
	private String lastName;
	//@Value("#{11*2}")
	private Integer age;
	//@Value("${person.boss}")
	private Boolean boss;
	private Date birth;
	//@Value("${person.maps}")不支持
	private Map<String,Object> maps;
	private List<Object> lists;
	private Dog dog;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Boolean getBoss() {
		return boss;
	}
	public void setBoss(Boolean boss) {
		this.boss = boss;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	public Map<String, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}
	public List<Object> getLists() {
		return lists;
	}
	public void setLists(List<Object> lists) {
		this.lists = lists;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", age=" + age + ", boss=" + boss + ", birth=" + birth + ", maps="
				+ maps + ", lists=" + lists + ", dog=" + dog + "]";
	}
}
