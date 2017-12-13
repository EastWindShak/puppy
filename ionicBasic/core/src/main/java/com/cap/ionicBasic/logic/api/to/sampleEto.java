package com.cap.ionicBasic.logic.api.to;

import com.cap.general.common.api.to.AbstractEto;
import com.cap.ionicBasic.common.api.sample;

/**
 * Entity transport object of sample
 */
public class sampleEto extends AbstractEto implements sample {

  private static final long serialVersionUID = 1L;

  private String name;

  private String surname;

  private long age;

  @Override
  public String getName() {

    return this.name;
  }

  @Override
  public void setName(String name) {

    this.name = name;
  }

  @Override
  public String getSurname() {

    return this.surname;
  }

  @Override
  public void setSurname(String surname) {

    this.surname = surname;
  }

  @Override
  public long getAge() {

    return this.age;
  }

  @Override
  public void setAge(long age) {

    this.age = age;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
    result = prime * result + ((this.surname == null) ? 0 : this.surname.hashCode());
    result = prime * result + ((Long) this.age).hashCode();
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    sampleEto other = (sampleEto) obj;
    if (this.name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!this.name.equals(other.name)) {
      return false;
    }
    if (this.surname == null) {
      if (other.surname != null) {
        return false;
      }
    } else if (!this.surname.equals(other.surname)) {
      return false;
    }
    if (this.age != other.age) {
      return false;
    }
    return true;
  }

}
