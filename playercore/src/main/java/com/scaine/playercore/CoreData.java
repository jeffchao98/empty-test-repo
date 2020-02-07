package com.scaine.playercore;

import com.google.gson.annotations.SerializedName;

public class CoreData {
    @SerializedName("user-name")
    String name = "";

    @SerializedName("player-state")
    String state = "";

    @SerializedName("player-level")
    int level = -1;

    @SerializedName("player-type")
    String type = "";
}
