package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p024Z.C0280b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.b0.t */
/* loaded from: classes.dex */
public enum C0410t extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0410t() {
        super(atm.m897d("281F1C1A3E3D221F1B11"), 2, null);
    }

    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    final boolean mo638d(AbstractC0341P abstractC0341P, C0365b c0365b) {
        if (EnumC0313B.m860a(abstractC0341P)) {
            c0365b.m711I((C0327I) abstractC0341P);
            return true;
        } else if (abstractC0341P.m808c()) {
            c0365b.m710J((C0329J) abstractC0341P);
            return true;
        } else if (abstractC0341P.m807d()) {
            c0365b.m668r(this);
            return false;
        } else if (abstractC0341P.m804g() && ((C0337N) abstractC0341P).f695e.equals(atm.m897d("020E1719"))) {
            return EnumC0313B.f641g.mo638d(abstractC0341P, c0365b);
        } else {
            boolean m804g = abstractC0341P.m804g();
            String m897d = atm.m897d("021F1B11");
            if (m804g) {
                C0337N c0337n = (C0337N) abstractC0341P;
                if (c0337n.f695e.equals(m897d)) {
                    c0365b.m671p0(c0365b.m712H(c0337n));
                    c0365b.m665s0(EnumC0313B.f638d);
                    return true;
                }
            }
            if (abstractC0341P.m805f() && C0280b.m1057c(((C0335M) abstractC0341P).f695e, C0311A.f613e)) {
                c0365b.m642h(m897d);
                return c0365b.mo645e(abstractC0341P);
            } else if (abstractC0341P.m805f()) {
                c0365b.m668r(this);
                return false;
            } else {
                c0365b.m642h(m897d);
                return c0365b.mo645e(abstractC0341P);
            }
        }
    }
}
