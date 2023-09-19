package com.github.catvod.spider.merge.p018S;

import com.github.catvod.spider.merge.atm;
import java.util.Objects;

/* renamed from: com.github.catvod.spider.merge.S.d */
/* loaded from: classes.dex */
public final class C0203d {
    /* renamed from: a */
    public static void m1176a(StringBuffer stringBuffer, Object obj) {
        Objects.requireNonNull(obj, new C0208i(atm.m897d("051810102F2C"), new Object[0]));
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        int length = stringBuffer.length();
        stringBuffer.ensureCapacity(hexString.length() + name.length() + length + 1);
        stringBuffer.append(name);
        stringBuffer.append('@');
        stringBuffer.append(hexString);
    }
}
