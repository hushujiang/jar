package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.p */
/* loaded from: classes.dex */
enum C0402p extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0402p() {
        super(atm.m897d("2B1C0E103E190C0E1F070E370E03"), 21, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    public final boolean mo638d(AbstractC0341P abstractC0341P, C0365b c0365b) {
        if (abstractC0341P.m808c()) {
            c0365b.m710J((C0329J) abstractC0341P);
            return true;
        } else if (abstractC0341P.m807d() || (abstractC0341P.m804g() && ((C0337N) abstractC0341P).f695e.equals(atm.m897d("020E1719")))) {
            return c0365b.m690d0(abstractC0341P, EnumC0313B.f641g);
        } else {
            if (EnumC0313B.m860a(abstractC0341P)) {
                c0365b.m711I((C0327I) abstractC0341P);
                return true;
            } else if (abstractC0341P.m806e()) {
                return true;
            } else {
                c0365b.m668r(this);
                c0365b.m679l0();
                return c0365b.mo645e(abstractC0341P);
            }
        }
    }
}
