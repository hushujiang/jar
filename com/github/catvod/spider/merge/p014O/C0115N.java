package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p013N.AbstractC0094s;

/* renamed from: com.github.catvod.spider.merge.O.N */
/* loaded from: classes.dex */
public final class C0115N implements InterfaceC0104C {

    /* renamed from: a */
    private final int f215a;

    public C0115N(int i) {
        this.f215a = i;
    }

    @Override // com.github.catvod.spider.merge.p014O.InterfaceC0104C
    /* renamed from: a */
    public final boolean mo1295a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.p014O.InterfaceC0104C
    /* renamed from: b */
    public final void mo1294b(AbstractC0094s abstractC0094s) {
        abstractC0094s.f161m = this.f215a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0115N) && this.f215a == ((C0115N) obj).f215a;
    }

    public final int hashCode() {
        return C0052e.m1415d(C0052e.m1411h(C0052e.m1411h(0, 7), this.f215a), 2);
    }

    public final String toString() {
        return String.format(atm.m897d("1E030A10647D0E53"), Integer.valueOf(this.f215a));
    }
}
