package com.github.catvod.spider.merge.p060v;

import com.github.catvod.spider.merge.atm;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.github.catvod.spider.merge.v.l */
/* loaded from: classes.dex */
final class C0729l implements PrivilegedExceptionAction<Unsafe> {
    @Override // java.security.PrivilegedExceptionAction
    /* renamed from: a */
    public final Unsafe run() {
        Field[] declaredFields;
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError(atm.m897d("1E121F551936191B1C10"));
    }
}
