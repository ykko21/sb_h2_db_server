package org.ykko;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {
    public static String getFormattedCurrentTimestamp() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        return now.format(formatter);
    }
}
