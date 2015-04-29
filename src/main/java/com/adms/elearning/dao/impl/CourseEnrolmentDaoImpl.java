package com.adms.elearning.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.elearning.dao.CourseEnrolmentDao;
import com.adms.elearning.entity.CourseEnrolment;

@Repository("courseEnrolmentDao")
public class CourseEnrolmentDaoImpl extends GenericDaoHibernate<CourseEnrolment, Long> implements CourseEnrolmentDao {

	public CourseEnrolmentDaoImpl() {
		super(CourseEnrolment.class);
	}
}
