package com.github.catvod.spider.merge.p053o0;

import com.github.catvod.spider.merge.atm;
import java.io.PrintStream;

/* renamed from: com.github.catvod.spider.merge.o0.a */
/* loaded from: classes.dex */
public final class C0639a extends Exception {

    /* renamed from: a */
    protected Throwable f1224a;

    public C0639a(String str) {
        super(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0639a(java.lang.Throwable r4) {
        /*
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            r0.append(r1)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "091B0F06293C4A18034F6C"
            java.lang.String r2 = com.github.catvod.spider.merge.atm.m897d(r2)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            r3.f1224a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p053o0.C0639a.<init>(java.lang.Throwable):void");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        if (this.f1224a == null) {
            super.printStackTrace();
            return;
        }
        synchronized (System.err) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getMessage());
            stringBuffer.append(atm.m897d("515A14103F2C0F1E5A10343B0F0A0E1C23364A13094F"));
            printStream.println(stringBuffer.toString());
            this.f1224a.printStackTrace();
        }
    }
}
