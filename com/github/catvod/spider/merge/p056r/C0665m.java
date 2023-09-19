package com.github.catvod.spider.merge.p056r;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.r.m */
/* loaded from: classes.dex */
public final class C0665m {
    /* renamed from: a */
    private static String m131a(int i, int i2, String str) {
        if (i < 0) {
            return C0671s.m113b(atm.m897d("4F095A5D692B435A17003F2C4A1415016C3A0F5A14102B391E130C10"), str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C0671s.m113b(atm.m897d("4F095A5D692B435A17003F2C4A1415016C3A0F5A1D0729391E1F085538300B145A0625220F5A52503F71"), str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append(atm.m897d("041F1D1438311C1F5A0625220F405A"));
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static void m130b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static void m129c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: d */
    public static void m128d(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(C0671s.m113b(str, Character.valueOf(c)));
        }
    }

    /* renamed from: e */
    public static int m127e(int i, int i2) {
        String m113b;
        if (i < 0 || i >= i2) {
            String m897d = atm.m897d("03141E1034");
            if (i < 0) {
                m113b = C0671s.m113b(atm.m897d("4F095A5D692B435A17003F2C4A1415016C3A0F5A14102B391E130C10"), m897d, Integer.valueOf(i));
            } else if (i2 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append(atm.m897d("041F1D1438311C1F5A0625220F405A"));
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                m113b = C0671s.m113b(atm.m897d("4F095A5D692B435A17003F2C4A181F55203D19095A012439045A091C363D4A525F0665"), m897d, Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(m113b);
        }
        return i;
    }

    /* renamed from: f */
    public static int m126f(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m131a(i, i2, atm.m897d("03141E1034")));
        }
        return i;
    }

    /* renamed from: g */
    public static void m125g(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? m131a(i, i3, atm.m897d("190E1B07387803141E1034")) : (i2 < 0 || i2 > i3) ? m131a(i2, i3, atm.m897d("0F141E5525360E1F02")) : C0671s.m113b(atm.m897d("0F141E5525360E1F0255647D19535A18392B1E5A141A3878081F5A19292B195A0E1D2D364A090E143E2C4A13141129204A525F0665"), Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    /* renamed from: h */
    public static void m124h(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: i */
    public static void m123i(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
