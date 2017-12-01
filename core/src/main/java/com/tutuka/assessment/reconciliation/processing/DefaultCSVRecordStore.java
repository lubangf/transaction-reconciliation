package com.tutuka.assessment.reconciliation.processing;

import com.tutuka.assessment.reconciliation.config.ConfigProperties;

/**
 * This is the default {@link RecordStore} implementation. Records are processed in memory during the reconciliation
 * process. Records can be added, removed, retrieved and iterated from this store.
 */
public class DefaultCSVRecordStore extends AbstractCSVRecordStore {

    private final static String keyColumn = ConfigProperties.getStringProperty("key.column");

    public DefaultCSVRecordStore() {
        super(keyColumn);
    }

}
