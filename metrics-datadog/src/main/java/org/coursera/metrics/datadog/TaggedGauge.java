package org.coursera.metrics.datadog;

import java.util.AbstractList;

/**
 * An interface to be implemented by Gauges which wish to expose additional
 * tags to datadog
 */
public interface TaggedGauge {

    /**
     * Return a List of Strings to values for Datadog reporter to send along to datadog
     * with the metrics
     */
    public AbstractList getTags();
}
