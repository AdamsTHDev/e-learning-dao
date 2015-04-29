package com.adms.elearning.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.elearning.dao.ClassRoomDao;
import com.adms.elearning.entity.ClassRoom;

@Repository("classRoomDao")
public class ClassRoomDaoImpl extends GenericDaoHibernate<ClassRoom, Long> implements ClassRoomDao {

	public ClassRoomDaoImpl() {
		super(ClassRoom.class);
	}

}
