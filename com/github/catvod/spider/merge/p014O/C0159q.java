package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.p016Q.C0189k;

/* renamed from: com.github.catvod.spider.merge.O.q */
/* loaded from: classes.dex */
public final class C0159q extends AbstractC0166t0 {

    /* renamed from: b */
    public final int f296b;

    public C0159q(AbstractC0151m abstractC0151m, int i) {
        super(abstractC0151m);
        this.f296b = i;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0166t0
    /* renamed from: a */
    public final int mo1235a() {
        return 5;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0166t0
    /* renamed from: c */
    public final C0189k mo1240c() {
        int i = this.f296b;
        C0189k c0189k = new C0189k(new int[0]);
        c0189k.m1204a(i);
        return c0189k;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0166t0
    /* renamed from: d */
    public final boolean mo1233d(int i, int i2) {
        return this.f296b == i;
    }

    public final String toString() {
        return String.valueOf(this.f296b);
    }
}
