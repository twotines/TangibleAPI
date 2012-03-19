/*
 * Master-Thesis work: see https://sites.google.com/site/sifthesis/
 */
package tangible.protocols.device_speficic;

import tangible.protocols.device_speficic.sifteo.SifteoAuthenticationProtocol;
import tangible.utils.exceptions.UnSupportedDeviceType;

/**
 *
 * @author leo
 */
public class ProtocolSelector {
  public static SpecificAuthenticationProtocol getAuthenticationProtocol(String type){
    if(type.equals("SifteoCubes")){
      return new SifteoAuthenticationProtocol();
    }//else TODO the same for the other devices
    
    throw new UnSupportedDeviceType(type);
  }
}