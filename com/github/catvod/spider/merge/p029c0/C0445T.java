package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.AbstractC0299s;
import com.github.catvod.spider.merge.p025a0.C0293m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.c0.T */
/* loaded from: classes.dex */
public final class C0445T extends AbstractC0453a0 {

    /* renamed from: b */
    final C0454b f867b;

    public C0445T(AbstractC0440N abstractC0440N) {
        this.f871a = abstractC0440N;
        this.f867b = new C0454b(abstractC0440N);
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        for (int i = 0; i < c0293m2.mo903h(); i++) {
            AbstractC0299s m922g = c0293m2.m922g(i);
            if ((m922g instanceof C0293m) && this.f867b.m611a(c0293m2, (C0293m) m922g) != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(atm.m897d("50121B06647D1953"), this.f871a);
    }
}
