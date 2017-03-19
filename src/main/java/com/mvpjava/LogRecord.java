package com.mvpjava;

import java.util.Objects;
import org.springframework.data.annotation.Id;

public class LogRecord {

    @Id
    private String mongoId;
    private String level;
    private String message;

    public LogRecord(String level, String message) {
        this.level = level;
        this.message = message;
    }

    public String getMongoId() {
        return mongoId;
    }

    public void setMongoId(String mongoId) {
        this.mongoId = mongoId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "LogRecord{" + "mongoId=" + mongoId + ", level=" + level + ", message=" + message + '}';

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.level);
        hash = 47 * hash + Objects.hashCode(this.message);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LogRecord other = (LogRecord) obj;
        if (!Objects.equals(this.level, other.level)) {
            return false;
        }
        if (!Objects.equals(this.message, other.message)) {
            return false;
        }

        return true;
    }

}
