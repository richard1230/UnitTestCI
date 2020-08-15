package com.github.JunitInAction.Chapter8.AccountManager;

import com.github.JunitInAction.Chapter8.Account.Account;

public interface AccountManager {
    Account findAccountForUser(String userId);
    void updateAccount(Account account);
}
