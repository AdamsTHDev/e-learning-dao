package com.adms.elearning.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.elearning.dao.AnswerTypeDao;
import com.adms.elearning.entity.AnswerType;

@Repository("answerTypeDao")
public class AnswerTypeDaoImpl extends GenericDaoHibernate<AnswerType, Long> implements AnswerTypeDao {

	public AnswerTypeDaoImpl() {
		super(AnswerType.class);
	}

}
