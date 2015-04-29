package com.adms.elearning.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.elearning.dao.CourseDao;
import com.adms.elearning.entity.Course;

@Repository("courseDao")
public class CourseDaoImpl extends GenericDaoHibernate<Course, Long> implements CourseDao {

	public CourseDaoImpl() {
		super(Course.class);
	}
}
