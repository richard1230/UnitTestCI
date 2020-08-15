package com.github.JunitInAction.Chapter8.AccountManager;

import com.github.JunitInAction.Chapter8.Account.Account;

import java.util.HashMap;
import java.util.Map;

public class MockAccountManager implements AccountManager{
    private Map<String, Account> accounts = new HashMap<String, Account>();

    public void addAccount(String userId, Account account) {
        this.accounts.put(userId, account);
    }

    public Account findAccountForUser(String userId) {
        return this.accounts.get(userId);
    }

    public void updateAccount(Account account) {
        // do nothing
    }
}
