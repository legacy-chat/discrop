package ca.awoo.discrop;

import ca.awoo.fwoabl.Optional;

public class User {
    private Snowflake id;
    private String username;
    private String discriminator;
    private String global_name;
    private String avatar;
    private boolean bot;
    private boolean system;
    private boolean mfa_enabled;
    private Optional<String> banner;
    private Optional<Integer> accent_color;
    private Optional<String> locale;
    private Optional<Boolean> verified;
    private Optional<String> email;
    private Optional<Integer> flags;
    private Optional<Integer> premium_type;
    private Optional<Integer> public_flags;
    private Optional<String> avatar_decoration;
}
