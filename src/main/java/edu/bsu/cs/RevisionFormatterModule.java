package edu.bsu.cs;

import com.google.inject.AbstractModule;
import edu.bsu.cs.model.RevisionFormatterInterface;
import edu.bsu.cs.view.RevisionFormatter;
import edu.bsu.cs.view.RevisionFormatterAlternative;

public class RevisionFormatterModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(RevisionFormatterInterface.class).to(RevisionFormatterAlternative.class);
    }
}
