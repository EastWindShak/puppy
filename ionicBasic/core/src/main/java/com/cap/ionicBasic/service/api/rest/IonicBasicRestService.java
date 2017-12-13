package com.cap.ionicBasic.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cap.ionicBasic.logic.api.IonicBasic;
import com.cap.ionicBasic.logic.api.to.sampleEto;
import com.cap.ionicBasic.logic.api.to.sampleSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link IonicBasic}.
 */
@Path("/ionicBasic/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface IonicBasicRestService {

  /**
   * Delegates to {@link IonicBasic#findsample}.
   *
   * @param id the ID of the {@link sampleEto}
   * @return the {@link sampleEto}
   */
  @GET
  @Path("/sample/{id}/")
  public sampleEto getsample(@PathParam("id") long id);

  /**
   * Delegates to {@link IonicBasic#savesample}.
   *
   * @param sample the {@link sampleEto} to be saved
   * @return the recently created {@link sampleEto}
   */
  @POST
  @Path("/sample/")
  public sampleEto savesample(sampleEto sample);

  /**
   * Delegates to {@link IonicBasic#deletesample}.
   *
   * @param id ID of the {@link sampleEto} to be deleted
   */
  @DELETE
  @Path("/sample/{id}/")
  public void deletesample(@PathParam("id") long id);

  /**
   * Delegates to {@link IonicBasic#findsampleEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding samples.
   * @return the {@link PaginatedListTo list} of matching {@link sampleEto}s.
   */
  @Path("/sample/search")
  @POST
  public PaginatedListTo<sampleEto> findsamplesByPost(sampleSearchCriteriaTo searchCriteriaTo);

  /**
   * @param id
   */
  @Path("/sample/modify")
  @POST
  public sampleEto modifysample(sampleEto sample);

}