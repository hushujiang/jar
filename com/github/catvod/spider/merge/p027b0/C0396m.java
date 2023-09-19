package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0289i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.b0.m */
/* loaded from: classes.dex */
public enum C0396m extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0396m() {
        super(atm.m897d("23141301253906"), 0, null);
    }

    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    final boolean mo638d(AbstractC0341P abstractC0341P, C0365b c0365b) {
        C0408s c0408s = EnumC0313B.f636b;
        if (EnumC0313B.m860a(abstractC0341P)) {
            return true;
        }
        if (abstractC0341P.m808c()) {
            c0365b.m710J((C0329J) abstractC0341P);
        } else if (!abstractC0341P.m807d()) {
            c0365b.m665s0(c0408s);
            return c0365b.mo645e(abstractC0341P);
        } else {
            C0331K c0331k = (C0331K) abstractC0341P;
            C0289i c0289i = new C0289i(c0365b.f843h.m852d(c0331k.f689d.toString()), c0331k.f691f.toString(), c0331k.f692g.toString());
            c0289i.m1001L(c0331k.f690e);
            c0365b.f839d.m995M(c0289i);
            if (c0331k.f693h) {
                c0365b.f839d.m1006E0();
            }
            c0365b.m665s0(c0408s);
        }
        return true;
    }
}
