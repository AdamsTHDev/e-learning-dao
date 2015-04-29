package com.adms.elearning.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.elearning.dao.SectionDao;
import com.adms.elearning.entity.Section;

@Repository("sectionDao")
public class SectionDaoImpl extends GenericDaoHibernate<Section, Long> implements SectionDao {

	public SectionDaoImpl() {
		super(Section.class);
	}

}
