package com.cap.general.dataaccess.api.dao;

import net.sf.mmm.util.entity.api.PersistenceEntity;

import io.oasp.module.jpa.dataaccess.api.Dao;

/**
 * Interface for all {@link Dao DAOs} (Data Access Object) of this application.
 *
 * @param <ENTITY> is the type of the managed entity.
 */
public interface ApplicationDao<ENTITY extends PersistenceEntity<Long>> extends Dao<ENTITY> {

}