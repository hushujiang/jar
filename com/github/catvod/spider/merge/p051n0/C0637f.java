package com.github.catvod.spider.merge.p051n0;

import com.github.catvod.spider.merge.atm;
import java.io.PrintStream;

/* renamed from: com.github.catvod.spider.merge.n0.f */
/* loaded from: classes.dex */
public final class C0637f {

    /* renamed from: a */
    private static C0636e f1221a;

    /* renamed from: b */
    private static boolean f1222b;

    private C0637f() {
    }

    /* renamed from: a */
    public static Class<?> m163a() {
        int i;
        C0636e c0636e = f1221a;
        if (c0636e == null) {
            if (f1222b) {
                c0636e = null;
            } else {
                try {
                    c0636e = new C0636e();
                } catch (SecurityException unused) {
                    c0636e = null;
                }
                f1221a = c0636e;
                f1222b = true;
            }
        }
        if (c0636e == null) {
            return null;
        }
        Class<?>[] classContext = c0636e.getClassContext();
        String name = C0637f.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new IllegalStateException(atm.m897d("2C1B1319293C4A0E15552A31041E5A1A3E3F44091613783244121F193C3D180954203831065A15076C311E095A162D34061F085525364A0E12106C2B1E1B191E77781E1213066C2B02150F19287804150E5524391A0A1F1B"));
        }
        return classContext[i];
    }

    /* renamed from: b */
    public static final void m162b(String str) {
        PrintStream printStream = System.err;
        printStream.println(atm.m897d("39363C4106624A") + str);
    }

    /* renamed from: c */
    public static final void m161c(String str, Throwable th) {
        System.err.println(str);
        System.err.println(atm.m897d("381F0A1A3E2C0F1E5A10343B0F0A0E1C233650"));
        th.printStackTrace();
    }
}
