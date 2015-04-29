package com.adms.elearning.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.elearning.dao.AnswerDao;
import com.adms.elearning.entity.Answer;

@Repository("answerDao")
public class AnswerDaoImpl extends GenericDaoHibernate<Answer, Long> implements AnswerDao {
	
	public AnswerDaoImpl() {
		super(Answer.class);
	}
}
