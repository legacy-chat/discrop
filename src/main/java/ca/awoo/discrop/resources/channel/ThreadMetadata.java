package ca.awoo.discrop.resources.channel;

import java.util.Date;

import ca.awoo.fwoabl.Optional;

public class ThreadMetadata {
    private boolean archived;
    private int auto_archive_duration;
    private Date archive_timestamp;
    private boolean locked;
    private Optional<Boolean> invitable;
    private Optional<Date> create_timestamp;
}
