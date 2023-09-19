package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p024Z.C0280b;

/* renamed from: com.github.catvod.spider.merge.b0.s */
/* loaded from: classes.dex */
enum C0408s extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0408s() {
        super(atm.m897d("281F1C1A3E3D220E1719"), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    public final boolean mo638d(AbstractC0341P abstractC0341P, C0365b c0365b) {
        C0410t c0410t = EnumC0313B.f637c;
        if (abstractC0341P.m807d()) {
            c0365b.m668r(this);
            return false;
        } else if (abstractC0341P.m808c()) {
            c0365b.m710J((C0329J) abstractC0341P);
            return true;
        } else if (EnumC0313B.m860a(abstractC0341P)) {
            c0365b.m711I((C0327I) abstractC0341P);
            return true;
        } else {
            if (abstractC0341P.m804g()) {
                C0337N c0337n = (C0337N) abstractC0341P;
                if (c0337n.f695e.equals(atm.m897d("020E1719"))) {
                    c0365b.m712H(c0337n);
                    c0365b.m665s0(c0410t);
                    return true;
                }
            }
            if (!(abstractC0341P.m805f() && C0280b.m1057c(((C0335M) abstractC0341P).f695e, C0311A.f613e)) && abstractC0341P.m805f()) {
                c0365b.m668r(this);
                return false;
            }
            c0365b.m704P();
            c0365b.m665s0(c0410t);
            return c0365b.mo645e(abstractC0341P);
        }
    }
}
