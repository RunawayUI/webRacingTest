package annotation.constraints;
import org.jvnet.staxex.StAxSOAPBody;

public @interface Adulthood {
    String message() default "Adulthood";
    int adulthoodAge() default 18;
    Class<? extends StAxSOAPBody.Payload>[] payload() default { };
    Class<?>[] groups() default { };
}
