package com.github.catvod.spider.merge.p003D;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p002C.C0007a;
import com.github.catvod.spider.merge.p002C.C0011e;
import com.github.catvod.spider.merge.p063y.C0750d;
import com.github.catvod.spider.merge.p064z.C0751a;

/* renamed from: com.github.catvod.spider.merge.D.e */
/* loaded from: classes.dex */
final class C0016e {

    /* renamed from: a */
    private static final int[][] f77a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    private static final int[][] f78b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    private static final int[][] f79c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d */
    private static final int[][] f80d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1465a(C0751a c0751a, int i, C0011e c0011e, int i2, C0013b c0013b) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        c0013b.m1482a();
        int length = f77a[0].length;
        m1462d(0, 0, c0013b);
        m1462d(c0013b.m1478e() - length, 0, c0013b);
        m1462d(0, c0013b.m1478e() - length, c0013b);
        m1463c(0, 7, c0013b);
        m1463c(c0013b.m1478e() - 8, 7, c0013b);
        m1463c(0, c0013b.m1478e() - 8, c0013b);
        m1461e(7, 0, c0013b);
        int i7 = -1;
        m1461e((c0013b.m1479d() - 7) - 1, 0, c0013b);
        m1461e(7, c0013b.m1479d() - 7, c0013b);
        if (c0013b.m1481b(8, c0013b.m1479d() - 8) != 0) {
            c0013b.m1477f(8, c0013b.m1479d() - 8, 1);
            if (c0011e.m1485f() >= 2) {
                int m1485f = c0011e.m1485f() - 1;
                int[][] iArr = f79c;
                int[] iArr2 = iArr[m1485f];
                int length2 = iArr[m1485f].length;
                int i8 = 0;
                while (i8 < length2) {
                    int i9 = 0;
                    while (i9 < length2) {
                        int i10 = iArr2[i8];
                        int i11 = iArr2[i9];
                        if (i11 != i7 && i10 != i7 && m1459g(c0013b.m1481b(i11, i10))) {
                            int i12 = i11 - 2;
                            int i13 = i10 - 2;
                            for (int i14 = 0; i14 < 5; i14++) {
                                for (int i15 = 0; i15 < 5; i15++) {
                                    c0013b.m1477f(i12 + i15, i13 + i14, f78b[i14][i15]);
                                }
                            }
                        }
                        i9++;
                        i7 = -1;
                    }
                    i8++;
                    i7 = -1;
                }
            }
            int i16 = 8;
            while (i16 < c0013b.m1478e() - 8) {
                int i17 = i16 + 1;
                int i18 = i17 % 2;
                if (m1459g(c0013b.m1481b(i16, 6))) {
                    c0013b.m1477f(i16, 6, i18);
                }
                if (m1459g(c0013b.m1481b(6, i16))) {
                    c0013b.m1477f(6, i16, i18);
                }
                i16 = i17;
            }
            C0751a c0751a2 = new C0751a();
            if (!(i2 >= 0 && i2 < 8)) {
                throw new C0750d(atm.m897d("23140C1420310E5A17143F334A0A1B01383D1814"));
            }
            int m1501a = (C0007a.m1501a(i) << 3) | i2;
            c0751a2.m11c(m1501a, 5);
            c0751a2.m11c(m1464b(m1501a, 1335), 10);
            C0751a c0751a3 = new C0751a();
            c0751a3.m11c(21522, 15);
            c0751a2.m6h(c0751a3);
            int m8f = c0751a2.m8f();
            String m897d = atm.m897d("19121500203C4A1415016C300B0A0A102278080F0E553B3D4A1D15017678");
            if (m8f == 15) {
                for (int i19 = 0; i19 < c0751a2.m8f(); i19++) {
                    boolean m9e = c0751a2.m9e((c0751a2.m8f() - 1) - i19);
                    int[][] iArr3 = f80d;
                    c0013b.m1476g(iArr3[i19][0], iArr3[i19][1], m9e);
                    if (i19 < 8) {
                        c0013b.m1476g((c0013b.m1478e() - i19) - 1, 8, m9e);
                    } else {
                        c0013b.m1476g(8, (i19 - 8) + (c0013b.m1479d() - 7), m9e);
                    }
                }
                if (c0011e.m1485f() >= 7) {
                    C0751a c0751a4 = new C0751a();
                    c0751a4.m11c(c0011e.m1485f(), 6);
                    c0751a4.m11c(m1464b(c0011e.m1485f(), 7973), 12);
                    if (c0751a4.m8f() != 18) {
                        throw new C0750d(m897d + c0751a4.m8f());
                    }
                    int i20 = 17;
                    for (int i21 = 0; i21 < 6; i21++) {
                        for (int i22 = 0; i22 < 3; i22++) {
                            boolean m9e2 = c0751a4.m9e(i20);
                            i20--;
                            c0013b.m1476g(i21, (c0013b.m1479d() - 11) + i22, m9e2);
                            c0013b.m1476g((c0013b.m1479d() - 11) + i22, i21, m9e2);
                        }
                    }
                }
                int m1478e = c0013b.m1478e() - 1;
                int m1479d = c0013b.m1479d() - 1;
                int i23 = 0;
                int i24 = -1;
                while (m1478e > 0) {
                    if (m1478e == 6) {
                        m1478e--;
                    }
                    while (m1479d >= 0 && m1479d < c0013b.m1479d()) {
                        for (int i25 = 0; i25 < 2; i25++) {
                            int i26 = m1478e - i25;
                            if (m1459g(c0013b.m1481b(i26, m1479d))) {
                                if (i23 < c0751a.m8f()) {
                                    z = c0751a.m9e(i23);
                                    i23++;
                                } else {
                                    z = false;
                                }
                                if (i2 != -1) {
                                    switch (i2) {
                                        case 0:
                                            i3 = m1479d + i26;
                                            i4 = i3 & 1;
                                            break;
                                        case 1:
                                            i3 = m1479d;
                                            i4 = i3 & 1;
                                            break;
                                        case 2:
                                            i4 = i26 % 3;
                                            break;
                                        case 3:
                                            i4 = (m1479d + i26) % 3;
                                            break;
                                        case 4:
                                            i4 = ((i26 / 3) + (m1479d / 2)) & 1;
                                            break;
                                        case 5:
                                            int i27 = m1479d * i26;
                                            i4 = (i27 % 3) + (i27 & 1);
                                            break;
                                        case 6:
                                            int i28 = m1479d * i26;
                                            i5 = i28 & 1;
                                            i6 = i28 % 3;
                                            i3 = i6 + i5;
                                            i4 = i3 & 1;
                                            break;
                                        case 7:
                                            i6 = (m1479d * i26) % 3;
                                            i5 = (m1479d + i26) & 1;
                                            i3 = i6 + i5;
                                            i4 = i3 & 1;
                                            break;
                                        default:
                                            throw new IllegalArgumentException(atm.m897d("23140C1420310E5A17143F334A0A1B01383D18144055") + i2);
                                    }
                                    if (i4 == 0) {
                                        z = !z;
                                    }
                                }
                                c0013b.m1476g(i26, m1479d, z);
                            }
                        }
                        m1479d += i24;
                    }
                    i24 = -i24;
                    m1479d += i24;
                    m1478e -= 2;
                }
                if (i23 == c0751a.m8f()) {
                    return;
                }
                throw new C0750d(atm.m897d("24150E552D34065A181C382B4A19151B3F2D071F1E4F6C") + i23 + '/' + c0751a.m8f());
            }
            throw new C0750d(m897d + c0751a2.m8f());
        }
        throw new C0750d();
    }

    /* renamed from: b */
    static int m1464b(int i, int i2) {
        if (i2 != 0) {
            int m1460f = m1460f(i2);
            int i3 = i << (m1460f - 1);
            while (m1460f(i3) >= m1460f) {
                i3 ^= i2 << (m1460f(i3) - m1460f);
            }
            return i3;
        }
        throw new IllegalArgumentException(atm.m897d("5A5A0A1A20210415171C2D34"));
    }

    /* renamed from: c */
    private static void m1463c(int i, int i2, C0013b c0013b) {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!m1459g(c0013b.m1481b(i4, i2))) {
                throw new C0750d();
            }
            c0013b.m1477f(i4, i2, 0);
        }
    }

    /* renamed from: d */
    private static void m1462d(int i, int i2, C0013b c0013b) {
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                c0013b.m1477f(i + i4, i2 + i3, f77a[i3][i4]);
            }
        }
    }

    /* renamed from: e */
    private static void m1461e(int i, int i2, C0013b c0013b) {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!m1459g(c0013b.m1481b(i, i4))) {
                throw new C0750d();
            }
            c0013b.m1477f(i, i4, 0);
        }
    }

    /* renamed from: f */
    static int m1460f(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: g */
    private static boolean m1459g(int i) {
        return i == -1;
    }
}
