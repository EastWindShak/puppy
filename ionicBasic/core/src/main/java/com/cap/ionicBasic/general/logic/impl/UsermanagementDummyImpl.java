package com.cap.ionicBasic.general.logic.impl;

import javax.inject.Named;

import org.springframework.stereotype.Component;

import com.cap.ionicBasic.general.common.api.UserProfile;
import com.cap.ionicBasic.general.common.api.Usermanagement;
import com.cap.ionicBasic.general.common.api.datatype.Role;
import com.cap.ionicBasic.general.common.api.to.UserDetailsClientTo;
import com.cap.ionicBasic.general.common.base.AbstractBeanMapperSupport;

/**
 * Implementation of {@link Usermanagement}.
 */
@Named
@Component
public class UsermanagementDummyImpl extends AbstractBeanMapperSupport implements Usermanagement {

  @Override
  public UserProfile findUserProfileByLogin(String login) {

    // this is only a dummy - please replace with a real implementation
    UserDetailsClientTo profile = new UserDetailsClientTo();
    profile.setName(login);
    profile.setFirstName("Peter");
    profile.setLastName(login);
    profile.setRole(Role.CHIEF);
    return profile;
  }

}
