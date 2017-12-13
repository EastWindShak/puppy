package com.cap.ionicBasic.logic.impl;

import java.util.Objects;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.cap.general.logic.base.AbstractComponentFacade;
import com.cap.ionicBasic.dataaccess.api.sampleEntity;
import com.cap.ionicBasic.dataaccess.api.dao.sampleDao;
import com.cap.ionicBasic.logic.api.IonicBasic;
import com.cap.ionicBasic.logic.api.to.sampleEto;
import com.cap.ionicBasic.logic.api.to.sampleSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Implementation of component interface of ionicBasic
 */
@Named
@Transactional
public class IonicBasicImpl extends AbstractComponentFacade implements IonicBasic {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(IonicBasicImpl.class);

  /** @see #getsampleDao() */
  @Inject
  private sampleDao sampleDao;

  /**
   * The constructor.
   */
  public IonicBasicImpl() {
    super();
  }

  @Override
  public sampleEto findsample(Long id) {

    LOG.debug("Get sample with id {} from database.", id);
    return getBeanMapper().map(getsampleDao().findOne(id), sampleEto.class);
  }

  @Override
  public PaginatedListTo<sampleEto> findsampleEtos(sampleSearchCriteriaTo criteria) {

    criteria.limitMaximumPageSize(MAXIMUM_HIT_LIMIT);
    PaginatedListTo<sampleEntity> samples = getsampleDao().findsamples(criteria);
    return mapPaginatedEntityList(samples, sampleEto.class);
  }

  @Override
  public boolean deletesample(Long sampleId) {

    sampleEntity sample = getsampleDao().find(sampleId);
    getsampleDao().delete(sample);
    LOG.debug("The sample with id '{}' has been deleted.", sampleId);
    return true;
  }

  @Override
  public sampleEto savesample(sampleEto sample) {

    Objects.requireNonNull(sample, "sample");
    sampleEntity sampleEntity = getBeanMapper().map(sample, sampleEntity.class);

    // initialize, validate sampleEntity here if necessary
    sampleEntity resultEntity = getsampleDao().save(sampleEntity);
    LOG.debug("sample with id '{}' has been created.", resultEntity.getId());

    return getBeanMapper().map(resultEntity, sampleEto.class);
  }

  @Override
  public sampleEto savemodifiedsample(sampleEto sample) {

    Objects.requireNonNull(sample, "sample");
    // sampleSearchCriteriaTo criteria = getBeanMapper().map(sample, sampleSearchCriteriaTo.class);
    // sampleSearchCriteriaTo sampleEntity = getBeanMapper().map(sampleSearchCriteriaTo, sampleSearchCriteriaTo.class);

    // PaginatedListTo<sampleEto> found = findsample(sam);
    // sampleEto modified = findsample(sample.getId());
    sampleEntity sampleEntity2 = getsampleDao().find(sample.getId());
    sampleEntity2.setAge(sample.getAge());
    sampleEntity2.setName(sample.getName());
    sampleEntity2.setSurname(sample.getSurname());

    // initialize, validate sampleEntity here if necessary
    sampleEntity resultEntity = getsampleDao().save(sampleEntity2);
    LOG.debug("sample with id '{}' has been created.", resultEntity.getId());

    return getBeanMapper().map(resultEntity, sampleEto.class);
  }

  /**
   * Returns the field 'sampleDao'.
   *
   * @return the {@link sampleDao} instance.
   */
  public sampleDao getsampleDao() {

    return this.sampleDao;
  }

}