package org.ykko;

public class Event {

    private Long messageId;
    private String agentId;
    private String message;
    private String timestamp;

    public Event() {}

    public Event(Long messageId, String agentId, String message, String timestamp) {
        this.messageId = messageId;
        this.agentId = agentId;
        this.message = message;
        this.timestamp = timestamp;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}
