package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.q */
/* loaded from: classes.dex */
enum C0404q extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0404q() {
        super(atm.m897d("2B1C0E103E190C0E1F070A2A0B171F06292C"), 22, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    public final boolean mo638d(AbstractC0341P abstractC0341P, C0365b c0365b) {
        if (abstractC0341P.m808c()) {
            c0365b.m710J((C0329J) abstractC0341P);
            return true;
        } else if (abstractC0341P.m807d() || EnumC0313B.m860a(abstractC0341P) || (abstractC0341P.m804g() && ((C0337N) abstractC0341P).f695e.equals(atm.m897d("020E1719")))) {
            return c0365b.m690d0(abstractC0341P, EnumC0313B.f641g);
        } else {
            if (abstractC0341P.m806e()) {
                return true;
            }
            if (abstractC0341P.m804g() && ((C0337N) abstractC0341P).f695e.equals(atm.m897d("04151C072D350F09"))) {
                return c0365b.m690d0(abstractC0341P, EnumC0313B.f638d);
            }
            c0365b.m668r(this);
            return false;
        }
    }
}
