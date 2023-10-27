package ca.awoo.discrop.resources.channel;

import java.util.Date;

import ca.awoo.discrop.Snowflake;
import ca.awoo.discrop.resources.application.Application;
import ca.awoo.discrop.resources.permissions.Role;
import ca.awoo.discrop.resources.user.User;
import ca.awoo.fwoabl.Optional;

public class Message {
    private Snowflake id;
    private Snowflake channel_id;
    private User author;
    private String content;
    private Date timestamp;
    private Date edited_timestamp;
    private boolean tts;
    private boolean mention_everyone;
    private User[] mentions;
    private Role[] mention_roles;
    private Optional<ChannelMention[]> mention_channels;
    private Attachment[] attachments;
    private Embed[] embeds;
    private Optional<Reaction[]> reactions;
    private Optional<String> nonce; //TODO: int or string because of the weird way discord handles bigint
    private boolean pinned;
    private Optional<Snowflake> webhook_id;
    private int type;
    // TODO: private Optional<MessageActivity> activity;
    private Optional<Application> application;
    private Optional<Snowflake> application_id;
    private Optional<MessageReference> message_reference;
    private Optional<Integer> flags;
    private Optional<Message> referenced_message;
    // TODO: bot stuff private Optional<MessageInteraction> interaction;
    private Optional<Channel> thread;
    //TODO: components
    //TODO: stickers private Optional<StickerItem[]> sticker_items;
    private Optional<Integer> position;
    //TODO: role_subscription_data
    //TODO: resolved
}
