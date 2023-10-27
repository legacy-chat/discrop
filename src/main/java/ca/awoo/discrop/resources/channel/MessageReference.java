package ca.awoo.discrop.resources.channel;

import ca.awoo.discrop.Snowflake;
import ca.awoo.fwoabl.Optional;

public class MessageReference {
    private Optional<Snowflake> message_id;
    private Optional<Snowflake> channel_id;
    private Optional<Snowflake> guild_id;
    private Optional<Boolean> fail_if_not_exists;
}
