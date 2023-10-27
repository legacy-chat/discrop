package ca.awoo.discrop.resources.channel;

import java.util.Date;

import ca.awoo.fwoabl.Optional;

public class Embed {
    private Optional<String> title;
    private Optional<String> type;
    private Optional<String> description;
    private Optional<String> url;
    private Optional<Date> timestamp;
    private Optional<Integer> color;
    private Optional<EmbedFooter> footer;
    private Optional<EmbedImage> image;
    private Optional<EmbedThumbnail> thumbnail;
    private Optional<EmbedVideo> video;
    private Optional<EmbedProvider> provider;
    private Optional<EmbedAuthor> author;
    private Optional<EmbedField[]> fields;
}
