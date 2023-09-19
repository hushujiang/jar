package com.github.catvod.spider.merge.p002C;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.C.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0007a {
    /* renamed from: a */
    public static /* synthetic */ int m1501a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 0;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 2;
        }
        throw null;
    }

    /* renamed from: b */
    public static /* synthetic */ String m1500b(int i) {
        return i == 1 ? atm.m897d("26") : i == 2 ? atm.m897d("27") : i == 3 ? atm.m897d("3B") : i == 4 ? atm.m897d("22") : atm.m897d("040F1619");
    }

    /* renamed from: c */
    public static /* synthetic */ int m1499c(String str) {
        if (str != null) {
            if (str.equals(atm.m897d("26"))) {
                return 1;
            }
            if (str.equals(atm.m897d("27"))) {
                return 2;
            }
            if (str.equals(atm.m897d("3B"))) {
                return 3;
            }
            if (str.equals(atm.m897d("22"))) {
                return 4;
            }
            throw new IllegalArgumentException(atm.m897d("24155A10222D075A191A222B1E1B14016C3B0517541223370D161F5B362003141D5B3D2A09151E10623C0F191511292A443F0807232A29150807293B1E13151B003D1C1F165B").concat(str));
        }
        throw new NullPointerException(atm.m897d("241B17106C31195A14002034"));
    }
}
