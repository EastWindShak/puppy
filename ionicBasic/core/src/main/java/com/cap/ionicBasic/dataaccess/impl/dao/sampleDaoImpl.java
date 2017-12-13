package com.cap.ionicBasic.dataaccess.impl.dao;

import javax.inject.Named;

import com.cap.general.dataaccess.base.dao.ApplicationDaoImpl;
import com.cap.ionicBasic.dataaccess.api.sampleEntity;
import com.cap.ionicBasic.dataaccess.api.dao.sampleDao;
import com.cap.ionicBasic.logic.api.to.sampleSearchCriteriaTo;
import com.mysema.query.alias.Alias;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.EntityPathBase;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * This is the implementation of {@link sampleDao}.
 */
@Named
public class sampleDaoImpl extends ApplicationDaoImpl<sampleEntity> implements sampleDao {

  /**
   * The constructor.
   */
  public sampleDaoImpl() {

    super();
  }

  @Override
  public Class<sampleEntity> getEntityClass() {

    return sampleEntity.class;
  }

  @Override
  public PaginatedListTo<sampleEntity> findsamples(sampleSearchCriteriaTo criteria) {

    sampleEntity sample = Alias.alias(sampleEntity.class);
    EntityPathBase<sampleEntity> alias = Alias.$(sample);
    JPAQuery query = new JPAQuery(getEntityManager()).from(alias);

    String name = criteria.getName();
    if (name != null) {
      query.where(Alias.$(sample.getName()).eq(name));
    }
    String surname = criteria.getSurname();
    if (surname != null) {
      query.where(Alias.$(sample.getSurname()).eq(surname));
    }
    Long age = criteria.getAge();
    if (age != null) {
      query.where(Alias.$(sample.getAge()).eq(age));
    }
    return findPaginated(criteria, query, alias);
  }

}