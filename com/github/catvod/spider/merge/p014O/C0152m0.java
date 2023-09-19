package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.p016Q.C0189k;

/* renamed from: com.github.catvod.spider.merge.O.m0 */
/* loaded from: classes.dex */
public class C0152m0 extends AbstractC0166t0 {

    /* renamed from: b */
    public final C0189k f287b;

    public C0152m0(AbstractC0151m abstractC0151m, C0189k c0189k) {
        super(abstractC0151m);
        if (c0189k == null) {
            c0189k = new C0189k(new int[0]);
            c0189k.m1204a(0);
        }
        this.f287b = c0189k;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0166t0
    /* renamed from: a */
    public int mo1235a() {
        return 7;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0166t0
    /* renamed from: c */
    public final C0189k mo1240c() {
        return this.f287b;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0166t0
    /* renamed from: d */
    public boolean mo1233d(int i, int i2) {
        return this.f287b.m1201d(i);
    }

    public String toString() {
        return this.f287b.toString();
    }
}
