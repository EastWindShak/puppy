package com.cap.ionicBasic.general.service.impl.rest;

import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.csrf.CsrfToken;

import com.cap.ionicBasic.general.common.api.to.UserDetailsClientTo;
import com.cap.ionicBasic.general.security.TokenAuthenticationService;

/**
 * The security REST service provides access to the csrf token, the authenticated user's meta-data. Furthermore, it
 * provides functionality to check permissions and roles of the authenticated user.
 *
 */
@Path("/security/v1")
@Named("SecurityRestService")
@Transactional
public class SecurityRestServiceImpl {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(SecurityRestServiceImpl.class);

  /**
   * Use {@link CsrfTokenRepository} for CSRF protection.
   */

  /**
   * Retrieves the CSRF token from the server session.
   *
   * @param request {@link HttpServletRequest} to retrieve the current session from
   * @param response {@link HttpServletResponse} to send additional information
   * @return the Spring Security {@link CsrfToken}
   */
  @Produces(MediaType.APPLICATION_JSON)
  @GET
  @Path("/currentuser/")
  public UserDetailsClientTo getCurrentUserDetails(@Context HttpServletRequest request) {

    return TokenAuthenticationService.getUserdetailsFromToken(request.getHeader("Authorization"));
  }

}
