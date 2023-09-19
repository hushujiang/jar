package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.o */
/* loaded from: classes.dex */
enum C0400o extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0400o() {
        super(atm.m897d("2B1C0E103E1E181B17103F3D1E"), 20, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    public final boolean mo638d(AbstractC0341P abstractC0341P, C0365b c0365b) {
        EnumC0313B enumC0313B;
        if (EnumC0313B.m860a(abstractC0341P)) {
            c0365b.m711I((C0327I) abstractC0341P);
            return true;
        } else if (abstractC0341P.m808c()) {
            c0365b.m710J((C0329J) abstractC0341P);
            return true;
        } else if (abstractC0341P.m807d()) {
            c0365b.m668r(this);
            return false;
        } else {
            boolean m804g = abstractC0341P.m804g();
            String m897d = atm.m897d("020E1719");
            if (m804g && ((C0337N) abstractC0341P).f695e.equals(m897d)) {
                enumC0313B = EnumC0313B.f641g;
            } else if (abstractC0341P.m805f() && ((C0335M) abstractC0341P).f695e.equals(m897d)) {
                c0365b.m665s0(EnumC0313B.f657w);
                return true;
            } else if (!abstractC0341P.m804g() || !((C0337N) abstractC0341P).f695e.equals(atm.m897d("04151C072D350F09"))) {
                if (abstractC0341P.m806e()) {
                    return true;
                }
                c0365b.m668r(this);
                return false;
            } else {
                enumC0313B = EnumC0313B.f638d;
            }
            return c0365b.m690d0(abstractC0341P, enumC0313B);
        }
    }
}
