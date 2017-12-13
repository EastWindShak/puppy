package com.cap.ionicBasic.logic.api.to;

import com.cap.general.common.api.to.AbstractCto;

/**
 * Composite transport object of sample
 */
public class sampleCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private sampleEto sample;

  public sampleEto getsample() {

    return sample;
  }

  public void setsample(sampleEto sample) {

    this.sample = sample;
  }

}
