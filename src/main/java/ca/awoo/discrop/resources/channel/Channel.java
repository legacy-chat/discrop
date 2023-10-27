package ca.awoo.discrop;

import java.util.Date;

import ca.awoo.fwoabl.Optional;

public class Channel {
    private Snowflake id;
    private int type;
    private Optional<Snowflake> guild_id;
    private Optional<Integer> position;
    //TODO: permission_overwrites
    private Optional<String> name;
    private Optional<String> topic;
    private Optional<Boolean> nsfw;
    private Optional<Snowflake> last_message_id;
    private Optional<Integer> bitrate;
    private Optional<Integer> user_limit;
    private Optional<Integer> rate_limit_per_user;
    private Optional<User[]> recipients;
    private Optional<String> icon;
    private Optional<Snowflake> owner_id;
    private Optional<Snowflake> application_id;
    private Optional<Boolean> managed;
    private Optional<Snowflake> parent_id;
    private Optional<Date> last_pin_timestamp;
    private Optional<String> rtc_region;
    private Optional<Integer> video_quality_mode;
    private Optional<Integer> message_count;
    private Optional<Integer> member_count;
    private Optional<ThreadMetadata> thread_metadata;
    private Optional<ThreadMember> member;
    private Optional<Integer> default_auto_archive_duration;
    private Optional<String> permissions;
    private Optional<Integer> flags;
    private Optional<Integer> total_messages_sent;
    private Optional<ForumTag[]> avaliable_tags;
    private Optional<Snowflake[]> applied_tags;
    private Optional<DefaultReaction> default_reaction_emoji;
    private Optional<Integer> default_thread_rate_limit_per_user;
    private Optional<Integer> default_sort_order;
    private Optional<Integer> default_forum_layout;
}
