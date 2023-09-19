package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p024Z.C0280b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.b0.j */
/* loaded from: classes.dex */
public enum C0389j extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0389j() {
        super(atm.m897d("23142910203D090E331B183908161F"), 16, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    public final boolean mo638d(AbstractC0341P abstractC0341P, C0365b c0365b) {
        boolean m804g = abstractC0341P.m804g();
        String m897d = atm.m897d("191F16102F2C");
        if (m804g && C0280b.m1057c(((C0337N) abstractC0341P).f695e, C0311A.f603G)) {
            c0365b.m668r(this);
            c0365b.m693a0(m897d);
            c0365b.m677m0();
            return c0365b.mo645e(abstractC0341P);
        }
        if (abstractC0341P.m805f()) {
            C0335M c0335m = (C0335M) abstractC0341P;
            if (C0280b.m1057c(c0335m.f695e, C0311A.f603G)) {
                c0365b.m668r(this);
                if (c0365b.m713G(c0335m.f695e)) {
                    c0365b.m693a0(m897d);
                    c0365b.m677m0();
                    return c0365b.mo645e(abstractC0341P);
                }
                return false;
            }
        }
        return c0365b.m690d0(abstractC0341P, EnumC0313B.f650p);
    }
}
