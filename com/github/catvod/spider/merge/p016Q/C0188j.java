package com.github.catvod.spider.merge.p016Q;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.Q.j */
/* loaded from: classes.dex */
public final class C0188j {

    /* renamed from: c */
    static C0188j[] f342c = new C0188j[1001];

    /* renamed from: a */
    public int f343a;

    /* renamed from: b */
    public int f344b;

    public C0188j(int i, int i2) {
        this.f343a = i;
        this.f344b = i2;
    }

    /* renamed from: b */
    public static C0188j m1206b(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new C0188j(i, i2);
        }
        C0188j[] c0188jArr = f342c;
        if (c0188jArr[i] == null) {
            c0188jArr[i] = new C0188j(i, i);
        }
        return c0188jArr[i];
    }

    /* renamed from: a */
    public final boolean m1207a(C0188j c0188j) {
        int i = this.f343a;
        int i2 = c0188j.f343a;
        if (!(i < i2 && this.f344b < i2)) {
            if (!(i > c0188j.f344b)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final C0188j m1205c(C0188j c0188j) {
        return m1206b(Math.min(this.f343a, c0188j.f343a), Math.max(this.f344b, c0188j.f344b));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0188j)) {
            return false;
        }
        C0188j c0188j = (C0188j) obj;
        return this.f343a == c0188j.f343a && this.f344b == c0188j.f344b;
    }

    public final int hashCode() {
        return ((713 + this.f343a) * 31) + this.f344b;
    }

    public final String toString() {
        return this.f343a + atm.m897d("4454") + this.f344b;
    }
}
