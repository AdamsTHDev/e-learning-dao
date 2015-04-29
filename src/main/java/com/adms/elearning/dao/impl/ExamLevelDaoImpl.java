package com.adms.elearning.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.elearning.dao.ExamLevelDao;
import com.adms.elearning.entity.ExamLevel;

@Repository("examLevelDao")
public class ExamLevelDaoImpl extends GenericDaoHibernate<ExamLevel, Long> implements ExamLevelDao {

	public ExamLevelDaoImpl() {
		super(ExamLevel.class);
	}

}
