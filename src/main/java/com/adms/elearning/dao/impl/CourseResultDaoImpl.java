package com.adms.elearning.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.elearning.dao.CourseResultDao;
import com.adms.elearning.entity.CourseResult;

@Repository("courseResultDao")
public class CourseResultDaoImpl extends GenericDaoHibernate<CourseResult, Long> implements CourseResultDao {

	public CourseResultDaoImpl() {
		super(CourseResult.class);
	}

}
