package com.dh.ms.common;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author 刘明
 * @date 2020/5/11 9:42
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DSContextHolder.get();
    }
}
