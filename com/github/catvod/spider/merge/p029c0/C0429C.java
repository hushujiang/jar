package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0288h;
import com.github.catvod.spider.merge.p025a0.C0293m;

/* renamed from: com.github.catvod.spider.merge.c0.C */
/* loaded from: classes.dex */
public final class C0429C extends AbstractC0440N {

    /* renamed from: a */
    public final /* synthetic */ int f857a;

    public /* synthetic */ C0429C(int i) {
        this.f857a = i;
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        switch (this.f857a) {
            case 0:
                C0293m m971l0 = c0293m2.m971l0();
                return (m971l0 == null || (m971l0 instanceof C0288h) || c0293m2.m984Y() != 0) ? false : true;
            default:
                C0293m m971l02 = c0293m2.m971l0();
                return (m971l02 == null || (m971l02 instanceof C0288h) || !c0293m2.m964s0().isEmpty()) ? false : true;
        }
    }

    public final String toString() {
        switch (this.f857a) {
            case 0:
                return atm.m897d("501C13073F2C4719121C203C");
            default:
                return atm.m897d("5015141935750912131928");
        }
    }
}
