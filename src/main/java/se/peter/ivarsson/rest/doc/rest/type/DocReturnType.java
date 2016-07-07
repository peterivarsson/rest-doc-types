/**
 * Rest documentation handler, Cybercom
 */

package se.peter.ivarsson.rest.doc.rest.type;

import static java.lang.annotation.ElementType.METHOD;
 
import java.lang.annotation.Retention;
 
import static java.lang.annotation.RetentionPolicy.RUNTIME;
 
import java.lang.annotation.Target;
import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;

/**
 * In the example below show real return type instead of Responce as return type.
 * 
 * I.e. If the type is Response, show real return type instead.
 *      In this case MovieList.
 * 
 * @DocReturnType(key = "se.sfbio.mobilebackend.domain.MovieList")
 * public Response getCurrentMovies(@PathParam(PARAM_CITY_ID) final String cityId,
 *
 * @author Peter Ivarsson Peter.Ivarsson@cybercom.com
 */
@Qualifier
@Retention(RUNTIME)
@Target({METHOD})
public @interface DocReturnType {
   
    @Nonbinding
    String key() default "";
}
