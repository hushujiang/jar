package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p013N.AbstractC0094s;

/* renamed from: com.github.catvod.spider.merge.O.L */
/* loaded from: classes.dex */
public final class C0113L implements InterfaceC0104C {

    /* renamed from: a */
    private final int f213a;

    public C0113L(int i) {
        this.f213a = i;
    }

    @Override // com.github.catvod.spider.merge.p014O.InterfaceC0104C
    /* renamed from: a */
    public final boolean mo1295a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.p014O.InterfaceC0104C
    /* renamed from: b */
    public final void mo1294b(AbstractC0094s abstractC0094s) {
        int i = this.f213a;
        abstractC0094s.f162n.m1213a(abstractC0094s.f163o);
        abstractC0094s.f163o = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0113L) && this.f213a == ((C0113L) obj).f213a;
    }

    public final int hashCode() {
        return C0052e.m1415d(C0052e.m1411h(C0052e.m1411h(0, 5), this.f213a), 2);
    }

    public final String toString() {
        return String.format(atm.m897d("1A0F091D01370E1F52502871"), Integer.valueOf(this.f213a));
    }
}
