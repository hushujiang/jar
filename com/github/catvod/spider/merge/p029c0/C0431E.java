package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0288h;
import com.github.catvod.spider.merge.p025a0.C0293m;

/* renamed from: com.github.catvod.spider.merge.c0.E */
/* loaded from: classes.dex */
public final class C0431E extends AbstractC0440N {

    /* renamed from: a */
    public final /* synthetic */ int f858a;

    public /* synthetic */ C0431E(int i) {
        this.f858a = i;
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        switch (this.f858a) {
            case 0:
                C0293m m971l0 = c0293m2.m971l0();
                return (m971l0 == null || (m971l0 instanceof C0288h) || c0293m2.m984Y() != m971l0.m986V().size() - 1) ? false : true;
            default:
                if (c0293m instanceof C0288h) {
                    c0293m = c0293m.m988T();
                }
                return c0293m2 == c0293m;
        }
    }

    public final String toString() {
        switch (this.f858a) {
            case 0:
                return atm.m897d("50161B0638750912131928");
            default:
                return atm.m897d("5008151A38");
        }
    }
}
