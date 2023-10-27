package ca.awoo.discrop.resources.channel;

import java.util.Date;

import ca.awoo.discrop.Snowflake;
import ca.awoo.discrop.resources.guild.GuildMember;
import ca.awoo.fwoabl.Optional;

public class ThreadMember {
    private Optional<Snowflake> id;
    private Optional<Snowflake> user_id;
    private Date join_timestamp;
    private int flags;
    private Optional<GuildMember> member;
}
