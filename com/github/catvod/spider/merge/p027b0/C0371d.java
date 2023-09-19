package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p024Z.C0280b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.b0.d */
/* loaded from: classes.dex */
public enum C0371d extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0371d() {
        super(atm.m897d("231439143C2C031514"), 10, null);
    }

    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    final boolean mo638d(AbstractC0341P abstractC0341P, C0365b c0365b) {
        boolean m805f = abstractC0341P.m805f();
        String m897d = atm.m897d("091B0A01253704");
        if (m805f) {
            C0335M c0335m = (C0335M) abstractC0341P;
            if (c0335m.f695e.equals(m897d)) {
                if (!c0365b.m713G(c0335m.f695e)) {
                    c0365b.m668r(this);
                    return false;
                }
                c0365b.m662v(false);
                if (!c0365b.m648b(m897d)) {
                    c0365b.m668r(this);
                }
                c0365b.m693a0(m897d);
                c0365b.m680l();
                c0365b.m665s0(EnumC0313B.f643i);
                return true;
            }
        }
        if ((abstractC0341P.m804g() && C0280b.m1057c(((C0337N) abstractC0341P).f695e, C0311A.f633y)) || (abstractC0341P.m805f() && ((C0335M) abstractC0341P).f695e.equals(atm.m897d("1E1B181929")))) {
            c0365b.m668r(this);
            if (c0365b.m644f(m897d)) {
                return c0365b.mo645e(abstractC0341P);
            }
            return true;
        } else if (abstractC0341P.m805f() && C0280b.m1057c(((C0335M) abstractC0341P).f695e, C0311A.f606J)) {
            c0365b.m668r(this);
            return false;
        } else {
            return c0365b.m690d0(abstractC0341P, EnumC0313B.f641g);
        }
    }
}
