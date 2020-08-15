package com.github.JunitInAction.Chapter8.AccountManager;

import com.github.JunitInAction.Chapter8.Account.Account;
import org.apache.commons.logging.Log;



public class DefaultAccountManager implements AccountManager{

    private Log logger;
//    private Configuration configuration;

    public DefaultAccountManager() {
//        this(LogFactory.getLog(DefaultAccountManager.class),new DefaultConfiguration("technical"));
    }

    public DefaultAccountManager(Log logger/*, Configuration configuration*/
    ) {
        this.logger = logger;
//        this.configuration = configuration;
    }

    @Override
    public Account findAccountForUser(String userId) {
        this.logger.debug("Getting account for user [" + userId + "]");
//        this.configuration.getSQL("FIND_ACCOUNT_FOR_USER");
        return null;
    }

    @Override
    public void updateAccount(Account account) {

    }
}
