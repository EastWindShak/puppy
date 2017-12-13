package com.cap.ionicBasic.dataaccess.api.dao;

import com.cap.general.dataaccess.api.dao.ApplicationDao;
import com.cap.ionicBasic.dataaccess.api.sampleEntity;
import com.cap.ionicBasic.logic.api.to.sampleSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Data access interface for sample entities
 */
public interface sampleDao extends ApplicationDao<sampleEntity> {

  /**
   * Finds the {@link sampleEntity samples} matching the given {@link sampleSearchCriteriaTo}.
   *
   * @param criteria is the {@link sampleSearchCriteriaTo}.
   * @return the {@link PaginatedListTo} with the matching {@link sampleEntity} objects.
   */
  PaginatedListTo<sampleEntity> findsamples(sampleSearchCriteriaTo criteria);
}
