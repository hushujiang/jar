package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.AbstractC0299s;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p025a0.C0301u;
import com.github.catvod.spider.merge.p027b0.C0319E;
import com.github.catvod.spider.merge.p027b0.C0323G;

/* renamed from: com.github.catvod.spider.merge.c0.L */
/* loaded from: classes.dex */
public final class C0438L extends AbstractC0440N {
    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        if (c0293m2 instanceof C0301u) {
            return true;
        }
        for (AbstractC0299s abstractC0299s : c0293m2.m959x0()) {
            C0301u c0301u = new C0301u(C0323G.m833m(c0293m2.m962u0(), C0319E.f665d), c0293m2.mo923f(), c0293m2.mo924e());
            abstractC0299s.m932E(c0301u);
            c0301u.m995M(abstractC0299s);
        }
        return false;
    }

    public final String toString() {
        return atm.m897d("50171B012F303E1F0201");
    }
}
