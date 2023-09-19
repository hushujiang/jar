package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p013N.AbstractC0094s;

/* renamed from: com.github.catvod.spider.merge.O.H */
/* loaded from: classes.dex */
public final class C0109H implements InterfaceC0104C {

    /* renamed from: a */
    private final int f208a;

    /* renamed from: b */
    private final InterfaceC0104C f209b;

    public C0109H(int i, InterfaceC0104C interfaceC0104C) {
        this.f208a = i;
        this.f209b = interfaceC0104C;
    }

    @Override // com.github.catvod.spider.merge.p014O.InterfaceC0104C
    /* renamed from: a */
    public final boolean mo1295a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.p014O.InterfaceC0104C
    /* renamed from: b */
    public final void mo1294b(AbstractC0094s abstractC0094s) {
        this.f209b.mo1294b(abstractC0094s);
    }

    /* renamed from: c */
    public final InterfaceC0104C m1297c() {
        return this.f209b;
    }

    /* renamed from: d */
    public final int m1296d() {
        return this.f208a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0109H) {
            C0109H c0109h = (C0109H) obj;
            return this.f208a == c0109h.f208a && this.f209b.equals(c0109h.f209b);
        }
        return false;
    }

    public final int hashCode() {
        return C0052e.m1415d(C0052e.m1410i(C0052e.m1411h(0, this.f208a), this.f209b), 2);
    }
}
