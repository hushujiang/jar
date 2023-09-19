package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p013N.AbstractC0094s;

/* renamed from: com.github.catvod.spider.merge.O.I */
/* loaded from: classes.dex */
public final class C0110I implements InterfaceC0104C {

    /* renamed from: a */
    private final int f210a;

    public C0110I(int i) {
        this.f210a = i;
    }

    @Override // com.github.catvod.spider.merge.p014O.InterfaceC0104C
    /* renamed from: a */
    public final boolean mo1295a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.p014O.InterfaceC0104C
    /* renamed from: b */
    public final void mo1294b(AbstractC0094s abstractC0094s) {
        abstractC0094s.f163o = this.f210a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0110I) && this.f210a == ((C0110I) obj).f210a;
    }

    public final int hashCode() {
        return C0052e.m1415d(C0052e.m1411h(C0052e.m1411h(0, 2), this.f210a), 2);
    }

    public final String toString() {
        return String.format(atm.m897d("07151E10647D0E53"), Integer.valueOf(this.f210a));
    }
}
