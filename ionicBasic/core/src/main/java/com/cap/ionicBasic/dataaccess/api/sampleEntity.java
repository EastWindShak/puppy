package com.cap.ionicBasic.dataaccess.api;

import javax.persistence.Entity;

import com.cap.general.dataaccess.api.ApplicationPersistenceEntity;
import com.cap.ionicBasic.common.api.sample;

/**
 * @author cfontsap
 */
@Entity
@javax.persistence.Table(name = "SAMPLE")
public class sampleEntity extends ApplicationPersistenceEntity implements sample {

  private static final long serialVersionUID = 1;

  private String name;

  private String surname;

  private long age;

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return surname
   */
  public String getSurname() {

    return this.surname;
  }

  /**
   * @param surname new value of {@link #getsurname}.
   */
  public void setSurname(String surname) {

    this.surname = surname;
  }

  /**
   * @return age
   */
  public long getAge() {

    return this.age;
  }

  /**
   * @param age new value of {@link #getage}.
   */
  public void setAge(long age) {

    this.age = age;
  }

}
