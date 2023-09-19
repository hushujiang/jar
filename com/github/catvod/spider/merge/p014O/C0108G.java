package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p013N.AbstractC0094s;

/* renamed from: com.github.catvod.spider.merge.O.G */
/* loaded from: classes.dex */
public final class C0108G implements InterfaceC0104C {

    /* renamed from: a */
    private final int f206a;

    /* renamed from: b */
    private final int f207b;

    public C0108G(int i, int i2) {
        this.f206a = i;
        this.f207b = i2;
    }

    @Override // com.github.catvod.spider.merge.p014O.InterfaceC0104C
    /* renamed from: a */
    public final boolean mo1295a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.p014O.InterfaceC0104C
    /* renamed from: b */
    public final void mo1294b(AbstractC0094s abstractC0094s) {
        abstractC0094s.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0108G) {
            C0108G c0108g = (C0108G) obj;
            return this.f206a == c0108g.f206a && this.f207b == c0108g.f207b;
        }
        return false;
    }

    public final int hashCode() {
        return C0052e.m1415d(C0052e.m1411h(C0052e.m1411h(C0052e.m1411h(0, 1), this.f206a), this.f207b), 3);
    }
}
