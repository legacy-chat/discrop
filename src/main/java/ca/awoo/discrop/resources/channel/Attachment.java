package ca.awoo.discrop.resources.channel;

import ca.awoo.discrop.Snowflake;
import ca.awoo.fwoabl.Optional;

public class Attachment {
    private Snowflake id;
    private String filename;
    private Optional<String> description;
    private Optional<String> content_type;
    private int size;
    private String url;
    private String proxy_url;
    private Optional<Integer> height;
    private Optional<Integer> width;
    private Optional<Boolean> ephemeral;
    private Optional<Float> duration_secs;
    private Optional<String> waveform;
    private Optional<Integer> flags;
}
