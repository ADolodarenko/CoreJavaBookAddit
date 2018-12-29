package org.dav.learn.corejavabook;

import com.sun.security.auth.callback.TextCallbackHandler;

import java.io.FilePermission;

public class PermissionMain
{
    public static void main(String[] args)
    {
        System.out.println(PermissionUtils.firstImpliesSecond(new FilePermission("C:\\-", "read,write"),
                new FilePermission("C:\\Eula.txt", "write")));
    }
}
