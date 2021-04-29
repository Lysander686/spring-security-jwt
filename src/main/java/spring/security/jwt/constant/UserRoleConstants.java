package spring.security.jwt.constant;

/**
 * RoleConstants
 */
public final class UserRoleConstants {

    public static final String ROLE_USER = "ROLE_USER";
    public static final String ROLE_ADMIN = "ROLE_ADMIN";

    private UserRoleConstants() {
        throw new IllegalStateException("Cannot create instance of static constant class");
    }

}
