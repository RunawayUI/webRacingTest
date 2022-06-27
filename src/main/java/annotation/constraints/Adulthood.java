package annotation.constraints;
import org.jvnet.staxex.StAxSOAPBody;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = { })
public @interface Adulthood {
    String message() default "Adulthood";
    int adulthoodAge() default 18;
    Class<? extends Payload>[] payload() default { };
    Class<?>[] groups() default { };
}
