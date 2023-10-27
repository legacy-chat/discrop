package ca.awoo.discrop.resources.permissions;

import ca.awoo.discrop.Snowflake;
import ca.awoo.fwoabl.Optional;

public class Role {
    private Snowflake id;
    private String name;
    private int color;
    private boolean hoist;
    private Optional<String> icon;
    private Optional<String> unicode_emoji;
    private int position;
    private String permissions;
    private boolean managed;
    private boolean mentionable;
    private Optional<RoleTags> tags;
    private int flags;


    public static class RoleTags{
        private Optional<Snowflake> bot_id;
        private Optional<Snowflake> integration_id;
        //TODO: Why are there fields with type null? How do I deal with that?
    }
}
