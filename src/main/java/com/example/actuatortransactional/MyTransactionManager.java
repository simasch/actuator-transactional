package com.example.actuatortransactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.support.AbstractPlatformTransactionManager;
import org.springframework.transaction.support.DefaultTransactionStatus;

public class MyTransactionManager extends AbstractPlatformTransactionManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyTransactionManager.class);

    @Override
    protected Object doGetTransaction() throws TransactionException {
        LOGGER.info("doGetTransaction");
        return new MyTransaction();
    }

    @Override
    protected void doBegin(Object transaction, TransactionDefinition definition) throws TransactionException {
        LOGGER.info("doBegin");
    }

    @Override
    protected void doCommit(DefaultTransactionStatus status) throws TransactionException {
        LOGGER.info("doCommit");
    }

    @Override
    protected void doRollback(DefaultTransactionStatus status) throws TransactionException {
        LOGGER.info("doRollback");
    }
}
