package com.github.catvod.spider.merge.p005F;

import com.github.catvod.spider.merge.atm;
import java.io.PrintStream;

/* renamed from: com.github.catvod.spider.merge.F.c */
/* loaded from: classes.dex */
final class C0021c {

    /* renamed from: a */
    private static boolean f90a;

    /* renamed from: b */
    static /* synthetic */ Class f91b;

    static {
        try {
            f90a = System.getProperty(atm.m897d("1217165B3F2C181F1B18623C0F180F12")) != null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    static /* synthetic */ Class m1448a() {
        return C0021c.class;
    }

    /* renamed from: b */
    private static void m1447b(String str) {
        if (f90a) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(atm.m897d("392E28300D15505A"));
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
        if (r2 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r2 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        m1448a();
        com.github.catvod.spider.merge.p005F.C0021c.f91b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        r0 = r0.getClassLoader();
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m1446c() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p005F.C0021c.m1446c():java.lang.Object");
    }

    /* renamed from: d */
    private static Object m1445d(String str, ClassLoader classLoader) {
        String m897d = atm.m897d("3A081503253C0F085A");
        try {
            return (classLoader == null ? Class.forName(str) : classLoader.loadClass(str)).newInstance();
        } catch (ClassNotFoundException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(m897d);
            stringBuffer.append(str);
            stringBuffer.append(atm.m897d("4A1415016C3E050F1411"));
            throw new C0019a(stringBuffer.toString(), e);
        } catch (Exception e2) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(m897d);
            stringBuffer2.append(str);
            stringBuffer2.append(atm.m897d("4A191500203C4A1415016C3A0F5A131B3F2C0B140E1C2D2C0F1E4055"));
            stringBuffer2.append(e2);
            throw new C0019a(stringBuffer2.toString(), e2);
        }
    }
}
