package com.cap.ionicBasic.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import com.cap.ionicBasic.logic.api.IonicBasic;
import com.cap.ionicBasic.logic.api.to.sampleEto;
import com.cap.ionicBasic.logic.api.to.sampleSearchCriteriaTo;
import com.cap.ionicBasic.service.api.rest.IonicBasicRestService;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link IonicBasic}.
 */
@Named("IonicBasicRestService")
public class IonicBasicRestServiceImpl implements IonicBasicRestService {

  @Inject
  private IonicBasic ionicBasic;

  @Override
  public sampleEto getsample(long id) {

    return this.ionicBasic.findsample(id);
  }

  @Override
  public sampleEto savesample(sampleEto sample) {

    return this.ionicBasic.savesample(sample);
  }

  @Override
  public void deletesample(long id) {

    this.ionicBasic.deletesample(id);
  }

  @Override
  public sampleEto modifysample(sampleEto sample) {

    // sampleEto myEto = findsamplesByPost(sample);
    return this.ionicBasic.savemodifiedsample(sample);

  }

  @Override
  public PaginatedListTo<sampleEto> findsamplesByPost(sampleSearchCriteriaTo searchCriteriaTo) {

    return this.ionicBasic.findsampleEtos(searchCriteriaTo);
  }

}