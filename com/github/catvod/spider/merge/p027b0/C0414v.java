package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p024Z.C0280b;

/* renamed from: com.github.catvod.spider.merge.b0.v */
/* loaded from: classes.dex */
enum C0414v extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0414v() {
        super(atm.m897d("231432102D3C241509163E311A0E"), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    public final boolean mo638d(AbstractC0341P abstractC0341P, C0365b c0365b) {
        C0327I c0327i;
        C0412u c0412u = EnumC0313B.f638d;
        if (abstractC0341P.m807d()) {
            c0365b.m668r(this);
        } else if (abstractC0341P.m804g() && ((C0337N) abstractC0341P).f695e.equals(atm.m897d("020E1719"))) {
            return c0365b.m690d0(abstractC0341P, EnumC0313B.f641g);
        } else {
            if (!abstractC0341P.m805f() || !((C0335M) abstractC0341P).f695e.equals(atm.m897d("041509163E311A0E"))) {
                if (!EnumC0313B.m860a(abstractC0341P) && !abstractC0341P.m808c() && (!abstractC0341P.m804g() || !C0280b.m1057c(((C0337N) abstractC0341P).f695e, C0311A.f614f))) {
                    if (abstractC0341P.m805f() && ((C0335M) abstractC0341P).f695e.equals(atm.m897d("0808"))) {
                        c0365b.m668r(this);
                        c0327i = new C0327I();
                    } else if ((abstractC0341P.m804g() && C0280b.m1057c(((C0337N) abstractC0341P).f695e, C0311A.f605I)) || abstractC0341P.m805f()) {
                        c0365b.m668r(this);
                        return false;
                    } else {
                        c0365b.m668r(this);
                        c0327i = new C0327I();
                    }
                    c0327i.m832k(abstractC0341P.toString());
                    c0365b.m711I(c0327i);
                    return true;
                }
                return c0365b.m690d0(abstractC0341P, c0412u);
            }
            c0365b.m694Z();
            c0365b.m665s0(c0412u);
        }
        return true;
    }
}
