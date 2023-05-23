package org.gilmarbljr.gabaritei.business;

/**
*
* @author gbljunior
*/
public class BusinessException extends Exception {

   private static final long serialVersionUID = 4613119897349320027L;
   public static final String INEXISTENT_USER = "exception.inexistent.user";

   /**
    *
    */

   /**
    * <p>
    * Create a new instance of BusinessException.
    * </p>
    *
    * @param message the message to show.
    */
   public BusinessException(final String message) {
       super(message);
   }

}
