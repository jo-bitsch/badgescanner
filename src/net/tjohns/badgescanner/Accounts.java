// Copyright 2012 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package net.tjohns.badgescanner;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;

public class Accounts {
    public static final String ACCOUNT_TYPE_GOOGLE = "com.google";
    
    public static String[] GetAccounts(Context context) {
        Account accounts[] = AccountManager.get(context).getAccountsByType(ACCOUNT_TYPE_GOOGLE);
        String accountEntries[] = new String[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            accountEntries[i] = accounts[i].name;
        }
        return accountEntries;
    }
}
