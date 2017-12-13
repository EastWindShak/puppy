package com.cap.ionicBasic.general.common.api.datatype;

import java.security.Principal;

public enum Role implements Principal {

  CHIEF("CHIEF"), WAITER("WAITER"), CUSTOMER("Customer");

  private final String name;

  private Role(String name) {

    this.name = name;
  }

  @Override
  public String getName() {

    return this.name;
  }
}
