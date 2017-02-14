package com.yztc.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yztc.mapper.User2Mapper;
import com.yztc.po.User2;
import com.yztc.service.User2Service;

@Service("user2Service")
public class User2ServiceImpl implements User2Service{
	@Autowired
	public User2Mapper user2Mapper;  //ÒªºÍspringÒª
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return user2Mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(User2 record) {
		return user2Mapper.insert(record);
	}

	@Override
	public int insertSelective(User2 record) {
		return user2Mapper.insertSelective(record);
	}

	@Override
	public User2 selectByPrimaryKey(Integer id) {
		return user2Mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(User2 record) {
		return user2Mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(User2 record) {
		return user2Mapper.updateByPrimaryKey(record);
	}

}
