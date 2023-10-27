package ca.awoo.discrop.resources.application;

import ca.awoo.discrop.Snowflake;

public class Application {
    private Snowflake id;
    private String name;
    private String icon;
    private String description;
    private String[] rpc_origins;
    private boolean bot_public;
    private boolean bot_require_code_grant;
    // TODO: this is bot stuff I'm not implementing this now
}
