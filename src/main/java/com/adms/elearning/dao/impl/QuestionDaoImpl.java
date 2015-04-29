package com.adms.elearning.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.elearning.dao.QuestionDao;
import com.adms.elearning.entity.Question;

@Repository("questionDao")
public class QuestionDaoImpl extends GenericDaoHibernate<Question, Long> implements QuestionDao {

	public QuestionDaoImpl() {
		super(Question.class);
	}

}
