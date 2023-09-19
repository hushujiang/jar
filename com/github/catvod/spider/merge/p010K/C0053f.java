package com.github.catvod.spider.merge.p010K;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p054p.C0642b;
import java.util.Arrays;

/* renamed from: com.github.catvod.spider.merge.K.f */
/* loaded from: classes.dex */
public final class C0053f {
    private C0053f() {
    }

    /* renamed from: a */
    public static boolean m1409a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m1408b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m1404f(nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: c */
    public static void m1407c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(C0642b.m156a(str, atm.m897d("4A170F06387804150E552E3D4A140F1920")));
        m1404f(nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: d */
    public static void m1406d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        NullPointerException nullPointerException = new NullPointerException(atm.m897d("3A1B0814213D1E1F08553F280F191313253D0E5A1B066C360514571B3934065A13066C361F16164F6C350F0E121A2878") + className + atm.m897d("44") + methodName + atm.m897d("465A0A143E39071F0E103E78") + str);
        m1404f(nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: e */
    public static int m1405e(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: f */
    private static <T extends Throwable> T m1404f(T t) {
        String name = C0053f.class.getName();
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (name.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }
}
