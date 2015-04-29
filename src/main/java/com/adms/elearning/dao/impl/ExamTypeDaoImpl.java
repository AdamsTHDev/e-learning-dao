package com.adms.elearning.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.elearning.dao.ExamTypeDao;
import com.adms.elearning.entity.ExamType;

@Repository("examTypeDao")
public class ExamTypeDaoImpl extends GenericDaoHibernate<ExamType, Long> implements ExamTypeDao {

	public ExamTypeDaoImpl() {
		super(ExamType.class);
	}

}
