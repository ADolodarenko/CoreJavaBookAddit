package org.dav.learn.corejavabook;

import java.security.Permission;

public class PermissionUtils
{
    public static boolean firstImpliesSecond(Permission firstPermission, Permission secondPermission)
    {
        if (firstPermission != null && secondPermission != null)
            return firstPermission.implies(secondPermission);
        else
            return false;
    }
}
