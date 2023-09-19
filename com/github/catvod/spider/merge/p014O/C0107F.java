package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p013N.AbstractC0094s;

/* renamed from: com.github.catvod.spider.merge.O.F */
/* loaded from: classes.dex */
public final class C0107F implements InterfaceC0104C {

    /* renamed from: a */
    private final int f205a;

    public C0107F(int i) {
        this.f205a = i;
    }

    @Override // com.github.catvod.spider.merge.p014O.InterfaceC0104C
    /* renamed from: a */
    public final boolean mo1295a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.p014O.InterfaceC0104C
    /* renamed from: b */
    public final void mo1294b(AbstractC0094s abstractC0094s) {
        abstractC0094s.f160l = this.f205a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0107F) && this.f205a == ((C0107F) obj).f205a;
    }

    public final int hashCode() {
        return C0052e.m1415d(C0052e.m1411h(C0052e.m1411h(0, 0), this.f205a), 2);
    }

    public final String toString() {
        return String.format(atm.m897d("09121B1B223D06525F1165"), Integer.valueOf(this.f205a));
    }
}
