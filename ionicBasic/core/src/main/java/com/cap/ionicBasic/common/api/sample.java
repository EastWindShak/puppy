package com.cap.ionicBasic.common.api;

import com.cap.general.common.api.ApplicationEntity;

public interface sample extends ApplicationEntity {

  public String getName();

  public void setName(String name);

  public String getSurname();

  public void setSurname(String surname);

  public long getAge();

  public void setAge(long age);

}
