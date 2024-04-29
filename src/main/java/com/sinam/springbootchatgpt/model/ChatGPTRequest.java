package com.sinam.springbootchatgpt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ChatGPTRequest {

    private String model = "gpt-3.5-turbo-0125";
    private String prompt;
    private int temperature = 1;

    @SerializedName(value="max_tokens")
    private int maxTokens = 100;
}
