package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;
import edu.bsu.cs.model.RevisionFormatterInterface;

import java.text.Normalizer;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class RevisionFormatterAlternative implements RevisionFormatterInterface {

    // DateTimeFormatter.ISO_INSTANT.format(revision.timestamp)

    @Override
    public String format(Revision revision) {
        LocalDateTime dt = (LocalDateTime.ofInstant(revision.timestamp, ZoneOffset.UTC));
        return String.format("%s by User: %s",
                dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)),
                revision.name);
    }
}
