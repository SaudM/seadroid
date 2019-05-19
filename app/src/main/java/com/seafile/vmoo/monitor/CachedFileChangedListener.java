package com.seafile.vmoo.monitor;

import com.seafile.vmoo.account.Account;
import com.seafile.vmoo.data.SeafCachedFile;

import java.io.File;

interface CachedFileChangedListener {
    void onCachedBlocksChanged(Account account, SeafCachedFile cf, File file);

    void onCachedFileChanged(Account account, SeafCachedFile cf, File file);
}

