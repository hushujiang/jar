package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p013N.AbstractC0094s;
import com.github.catvod.spider.merge.p016Q.C0187i;
import java.util.EmptyStackException;

/* renamed from: com.github.catvod.spider.merge.O.K */
/* loaded from: classes.dex */
public final class C0112K implements InterfaceC0104C {

    /* renamed from: a */
    public static final C0112K f212a = new C0112K();

    private C0112K() {
    }

    @Override // com.github.catvod.spider.merge.p014O.InterfaceC0104C
    /* renamed from: a */
    public final boolean mo1295a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.p014O.InterfaceC0104C
    /* renamed from: b */
    public final void mo1294b(AbstractC0094s abstractC0094s) {
        if (!abstractC0094s.f162n.m1210d()) {
            C0187i c0187i = abstractC0094s.f162n;
            abstractC0094s.f163o = c0187i.m1209e(c0187i.m1208f() - 1);
            return;
        }
        throw new EmptyStackException();
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return C0052e.m1415d(C0052e.m1411h(0, 4), 1);
    }

    public final String toString() {
        return atm.m897d("1A150A38233C0F");
    }
}
