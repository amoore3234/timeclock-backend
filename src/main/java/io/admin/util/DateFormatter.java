package io.admin.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * A date formatter class to convert a Timestamp protobuf to a new Timestamp instance.
 */
public class DateFormatter {

  public DateFormatter() {}

  /**
 * Format a Timestamp protobuf instance.
 */
  public static Timestamp format(com.google.protobuf.Timestamp timestamp) {
    final String dateFormat = "MM/dd/yyyy";
    final String date = new SimpleDateFormat(dateFormat).format(timestamp);
    return Timestamp.valueOf(date);
  }

  public static com.google.protobuf.Timestamp toProtoDate(Timestamp timestamp) {
    return com.google.protobuf.Timestamp.newBuilder().build();
  }
}
