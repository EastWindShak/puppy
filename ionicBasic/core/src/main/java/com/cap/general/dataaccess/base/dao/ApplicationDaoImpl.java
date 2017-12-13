package com.cap.general.dataaccess.base.dao;

import net.sf.mmm.util.entity.api.PersistenceEntity;

import org.springframework.stereotype.Repository;

import com.cap.general.dataaccess.api.dao.ApplicationDao;

import io.oasp.module.jpa.dataaccess.base.AbstractDao;

/**
 * This is the abstract base implementation of {@link ApplicationDao}.
 *
 * @param <ENTITY> is the {@link #getEntityClass() type} of the managed entity.
 */
@Repository
public abstract class ApplicationDaoImpl<ENTITY extends PersistenceEntity<Long>> extends AbstractDao<ENTITY>
    implements ApplicationDao<ENTITY> {

  /**
   * The constructor.
   */
  public ApplicationDaoImpl() {

    super();
  }

}
