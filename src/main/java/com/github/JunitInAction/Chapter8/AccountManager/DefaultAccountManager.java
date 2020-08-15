package com.github.JunitInAction.Chapter8.AccountManager;

import com.github.JunitInAction.Chapter8.Account.Account;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;


public class DefaultAccountManager implements AccountManager{

    private static final Log logger = LogFactory.getLog(AccountManager.class);

    @Override
    public Account findAccountForUser(String userId) {
        logger.debug("Getting account for user [" + userId + "]");
        ResourceBundle bundle =
                PropertyResourceBundle.getBundle("technical");
        String sql = bundle.getString("FIND_ACCOUNT_FOR_USER");
        return null;
    }

    @Override
    public void updateAccount(Account account) {

    }
}
