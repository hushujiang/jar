package com.github.catvod.spider.merge.p003D;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p002C.C0011e;
import com.github.catvod.spider.merge.p002C.EnumC0008b;
import com.github.catvod.spider.merge.p063y.C0750d;
import com.github.catvod.spider.merge.p064z.C0751a;

/* renamed from: com.github.catvod.spider.merge.D.c */
/* loaded from: classes.dex */
public final class C0014c {

    /* renamed from: a */
    private static final int[] f76a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: a */
    private static int m1475a(EnumC0008b enumC0008b, C0751a c0751a, C0751a c0751a2, C0011e c0011e) {
        return c0751a2.m8f() + enumC0008b.m1497b(c0011e) + c0751a.m8f();
    }

    /* renamed from: b */
    private static C0011e m1474b(int i, int i2) {
        for (int i3 = 1; i3 <= 40; i3++) {
            C0011e m1486e = C0011e.m1486e(i3);
            if (m1471e(i, m1486e, i2)) {
                return m1486e;
            }
        }
        throw new C0750d(atm.m897d("2E1B0E146C2C05155A17253F"));
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map<Lcom/github/catvod/spider/merge/y/b;*>;)Lcom/github/catvod/spider/merge/D/f; */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fd A[LOOP:1: B:60:0x00cf->B:74:0x00fd, LOOP_END] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.github.catvod.spider.merge.p003D.C0017f m1473c(java.lang.String r23, int r24, java.util.Map r25) {
        /*
            Method dump skipped, instructions count: 1383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p003D.C0014c.m1473c(java.lang.String, int, java.util.Map):com.github.catvod.spider.merge.D.f");
    }

    /* renamed from: d */
    static int m1472d(int i) {
        int[] iArr = f76a;
        if (i < 96) {
            return iArr[i];
        }
        return -1;
    }

    /* renamed from: e */
    private static boolean m1471e(int i, C0011e c0011e, int i2) {
        return c0011e.m1487d() - c0011e.m1488c(i2).m1491d() >= (i + 7) / 8;
    }
}
