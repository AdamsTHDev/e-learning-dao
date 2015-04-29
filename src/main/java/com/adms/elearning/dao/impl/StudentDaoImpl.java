package com.adms.elearning.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.elearning.dao.StudentDao;
import com.adms.elearning.entity.Student;

@Repository("studentDao")
public class StudentDaoImpl extends GenericDaoHibernate<Student, Long> implements StudentDao {

	public StudentDaoImpl() {
		super(Student.class);
	}

}
