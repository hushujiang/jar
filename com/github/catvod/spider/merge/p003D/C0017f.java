package com.github.catvod.spider.merge.p003D;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p002C.C0007a;
import com.github.catvod.spider.merge.p002C.C0011e;
import com.github.catvod.spider.merge.p002C.EnumC0008b;

/* renamed from: com.github.catvod.spider.merge.D.f */
/* loaded from: classes.dex */
public final class C0017f {

    /* renamed from: a */
    private EnumC0008b f81a;

    /* renamed from: b */
    private int f82b;

    /* renamed from: c */
    private C0011e f83c;

    /* renamed from: d */
    private int f84d = -1;

    /* renamed from: e */
    private C0013b f85e;

    /* renamed from: a */
    public final C0013b m1458a() {
        return this.f85e;
    }

    /* renamed from: b */
    public final void m1457b(int i) {
        this.f82b = i;
    }

    /* renamed from: c */
    public final void m1456c(int i) {
        this.f84d = i;
    }

    /* renamed from: d */
    public final void m1455d(C0013b c0013b) {
        this.f85e = c0013b;
    }

    /* renamed from: e */
    public final void m1454e(EnumC0008b enumC0008b) {
        this.f81a = enumC0008b;
    }

    /* renamed from: f */
    public final void m1453f(C0011e c0011e) {
        this.f83c = c0011e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append(atm.m897d("564670"));
        sb.append(atm.m897d("4A17151129624A"));
        sb.append(this.f81a);
        sb.append(atm.m897d("605A1F16003D1C1F164F6C"));
        sb.append(C0007a.m1500b(this.f82b));
        sb.append(atm.m897d("605A0C103E2B0315144F6C"));
        sb.append(this.f83c);
        sb.append(atm.m897d("605A17143F333A1B0E01292A04405A"));
        sb.append(this.f84d);
        if (this.f85e == null) {
            sb.append(atm.m897d("605A1714382A03024055222D061670"));
        } else {
            sb.append(atm.m897d("605A1714382A0302407F"));
            sb.append(this.f85e);
        }
        sb.append(atm.m897d("544470"));
        return sb.toString();
    }
}
