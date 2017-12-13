package com.cap.ionicBasic.logic.api;

import com.cap.ionicBasic.logic.api.to.sampleEto;
import com.cap.ionicBasic.logic.api.to.sampleSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Interface for IonicBasic component.
 */
public interface IonicBasic {

  /**
   * Returns a sample by its id 'id'.
   *
   * @param id The id 'id' of the sample.
   * @return The {@link sampleEto} with id 'id'
   */
  sampleEto findsample(Long id);

  /**
   * Returns a paginated list of samples matching the search criteria.
   *
   * @param criteria the {@link sampleSearchCriteriaTo}.
   * @return the {@link List} of matching {@link sampleEto}s.
   */
  PaginatedListTo<sampleEto> findsampleEtos(sampleSearchCriteriaTo criteria);

  /**
   * Deletes a sample from the database by its id 'sampleId'.
   *
   * @param sampleId Id of the sample to delete
   * @return boolean <code>true</code> if the sample can be deleted, <code>false</code> otherwise
   */
  boolean deletesample(Long sampleId);

  /**
   * Saves a sample and store it in the database.
   *
   * @param sample the {@link sampleEto} to create.
   * @return the new {@link sampleEto} that has been saved with ID and version.
   */
  sampleEto savesample(sampleEto sample);

  /**
   * @param id
   * @param sample
   */
  sampleEto savemodifiedsample(sampleEto sample);

}