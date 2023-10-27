package ca.awoo.discrop.resources.guild;

import java.util.Date;

import ca.awoo.discrop.Snowflake;
import ca.awoo.discrop.resources.user.User;
import ca.awoo.fwoabl.Optional;

public class GuildMember {
    private Optional<User> user;
    private Optional<String> nick;
    private Optional<String> avatar;
    private Snowflake[] roles;
    private Date joined_at;
    private Optional<Date> premium_since;
    private boolean deaf;
    private boolean mute;
    private int flags;
    private Optional<Boolean> pending;
    private Optional<String> permissions;
    private Optional<Date> communication_disabled_until;
}
