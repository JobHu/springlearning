package com.jobhu.annoation.dao.impl;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jobhu.annoation.dao.IUserDao;

//@Component
@Repository(value ="UserDaoImpl")
public class UserDaoImpl implements IUserDao{

	@Override
	public String queryUserNameById(Integer id) {
		return null;
	}

}
