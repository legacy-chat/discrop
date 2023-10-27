package ca.awoo.discrop.resources.channel;

public class Reaction {
    private int count;
    private ReactionCount count_details;
    private boolean me;
    private boolean me_burst;
    private Emoji emoji;
    // TODO: burst colours

    public static class ReactionCount {
        private int burst;
        private int normal;
    }
}
