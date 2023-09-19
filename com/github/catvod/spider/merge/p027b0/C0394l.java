package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.b0.l */
/* loaded from: classes.dex */
public enum C0394l extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0394l() {
        super(atm.m897d("2B1C0E103E1A051E03"), 18, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    public final boolean mo638d(AbstractC0341P abstractC0341P, C0365b c0365b) {
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
                return c0365b.m690d0(abstractC0341P, EnumC0313B.f641g);
            }
            if (abstractC0341P.m805f() && ((C0335M) abstractC0341P).f695e.equals(m897d)) {
                c0365b.getClass();
                if (c0365b.m697W(m897d)) {
                    c0365b.m693a0(m897d);
                }
                c0365b.m665s0(EnumC0313B.f656v);
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
