package com.github.catvod.spider.merge.p059u;

import com.github.catvod.spider.merge.atm;
import java.math.RoundingMode;

/* renamed from: com.github.catvod.spider.merge.u.b */
/* loaded from: classes.dex */
public final class C0695b {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (((r7 == java.math.RoundingMode.HALF_EVEN) & ((r0 & 1) != 0)) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
        if (r1 > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
        if (r5 > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
        if (r5 < 0) goto L34;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m88a(int r5, int r6, java.math.RoundingMode r7) {
        /*
            r7.getClass()
            if (r6 == 0) goto L67
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 != 0) goto Le
            return r0
        Le:
            r5 = r5 ^ r6
            int r5 = r5 >> 31
            r2 = 1
            r5 = r5 | r2
            int[] r3 = com.github.catvod.spider.merge.p059u.C0694a.f1311a
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 0
            switch(r3) {
                case 1: goto L50;
                case 2: goto L56;
                case 3: goto L4d;
                case 4: goto L57;
                case 5: goto L4a;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L25:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L47
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L57
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L3b
            r6 = 1
            goto L3c
        L3b:
            r6 = 0
        L3c:
            r7 = r0 & 1
            if (r7 == 0) goto L42
            r7 = 1
            goto L43
        L42:
            r7 = 0
        L43:
            r6 = r6 & r7
            if (r6 == 0) goto L56
            goto L57
        L47:
            if (r1 <= 0) goto L56
            goto L57
        L4a:
            if (r5 <= 0) goto L56
            goto L57
        L4d:
            if (r5 >= 0) goto L56
            goto L57
        L50:
            if (r1 != 0) goto L53
            goto L54
        L53:
            r2 = 0
        L54:
            if (r2 == 0) goto L5b
        L56:
            r2 = 0
        L57:
            if (r2 == 0) goto L5a
            int r0 = r0 + r5
        L5a:
            return r0
        L5b:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "07151E106C2F0B095A2002162F393F261F19382356552E2D1E5A081A39360E1314126C2F0B095A1B293B0F0909143E21"
            java.lang.String r6 = com.github.catvod.spider.merge.atm.m897d(r6)
            r5.<init>(r6)
            throw r5
        L67:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "455A180C6C220F0815"
            java.lang.String r6 = com.github.catvod.spider.merge.atm.m897d(r6)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p059u.C0695b.m88a(int, int, java.math.RoundingMode):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public static int m87b(int i, RoundingMode roundingMode) {
        if (i <= 0) {
            String m897d = atm.m897d("12");
            StringBuilder sb = new StringBuilder(m897d.length() + 26);
            sb.append(m897d);
            sb.append(atm.m897d("4A52"));
            sb.append(i);
            sb.append(atm.m897d("435A17003F2C4A181F5572785A"));
            throw new IllegalArgumentException(sb.toString());
        }
        switch (C0694a.f1311a[roundingMode.ordinal()]) {
            case 1:
                if (!((i > 0) & (((i + (-1)) & i) == 0))) {
                    throw new ArithmeticException(atm.m897d("07151E106C2F0B095A2002162F393F261F19382356552E2D1E5A081A39360E1314126C2F0B095A1B293B0F0909143E21"));
                }
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - numberOfLeadingZeros) + ((((((-1257966797) >>> numberOfLeadingZeros) - i) ^ (-1)) ^ (-1)) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }
}
