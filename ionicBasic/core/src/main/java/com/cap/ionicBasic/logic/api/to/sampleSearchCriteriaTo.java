package com.cap.ionicBasic.logic.api.to;

import io.oasp.module.jpa.common.api.to.SearchCriteriaTo;

/**
 * This is the {@link SearchCriteriaTo search criteria} {@link net.sf.mmm.util.transferobject.api.TransferObject TO}
 * used to find {@link com.cap.ionicBasic.common.api.sample}s.
 *
 */
public class sampleSearchCriteriaTo extends SearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private String name;

  private String surname;

  private Long age;

  /**
   * The constructor.
   */
  public sampleSearchCriteriaTo() {

    super();
  }

  public String getName() {

    return name;
  }

  public void setName(String name) {

    this.name = name;
  }

  public String getSurname() {

    return surname;
  }

  public void setSurname(String surname) {

    this.surname = surname;
  }

  public Long getAge() {

    return age;
  }

  public void setAge(Long age) {

    this.age = age;
  }

}
