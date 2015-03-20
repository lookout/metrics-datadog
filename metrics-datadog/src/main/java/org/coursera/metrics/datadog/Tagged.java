package org.coursera.metrics.datadog;

import java.util.List;

/**
 * An interface to be implemented by Gauges, Counter, etc which wish to expose additional
 * tags to datadog
 */
public interface Tagged {

    /**
     * Return a List of Strings to values for Datadog reporter to send along to datadog
     * with the metrics
     */
    public List<String> getTags();

    /**
     * Provide the name for the metric to be used instead of the uniquely
     * identifiable metric registry name
     */
    public String getName();
}
