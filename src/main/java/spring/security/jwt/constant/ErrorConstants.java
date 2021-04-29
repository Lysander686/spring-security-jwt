package spring.security.jwt.constant;

import java.net.URI;

/**
 * ErrorConstants
 */
public final class ErrorConstants {
    public static final String ERR_CONCURRENCY_FAILURE = "error.concurrencyFailure";
    public static final String ERR_VALIDATION = "error.validation";
    public static final URI DEFAULT_TYPE = null;
    private ErrorConstants() {
        throw new IllegalStateException("Cannot create instance of static constant class");
    }


}