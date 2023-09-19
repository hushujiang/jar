package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p024Z.C0280b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.b0.g */
/* loaded from: classes.dex */
public enum C0380g extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0380g() {
        super(atm.m897d("2314281A3B"), 13, null);
    }

    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    final boolean mo638d(AbstractC0341P abstractC0341P, C0365b c0365b) {
        EnumC0313B enumC0313B = EnumC0313B.f647m;
        EnumC0313B enumC0313B2 = EnumC0313B.f643i;
        boolean m804g = abstractC0341P.m804g();
        String m897d = atm.m897d("1E08");
        if (m804g) {
            C0337N c0337n = (C0337N) abstractC0341P;
            String str = c0337n.f695e;
            if (C0280b.m1057c(str, C0311A.f630v)) {
                c0365b.m672p();
                c0365b.m712H(c0337n);
                c0365b.m665s0(EnumC0313B.f649o);
                c0365b.m706N();
                return true;
            } else if (C0280b.m1057c(str, C0311A.f600D)) {
                if (c0365b.m644f(m897d)) {
                    return c0365b.mo645e(abstractC0341P);
                }
                return false;
            } else {
                return c0365b.m690d0(abstractC0341P, enumC0313B2);
            }
        } else if (abstractC0341P.m805f()) {
            String str2 = ((C0335M) abstractC0341P).f695e;
            if (str2.equals(m897d)) {
                if (!c0365b.m713G(str2)) {
                    c0365b.m668r(this);
                    return false;
                }
            } else if (str2.equals(atm.m897d("1E1B181929"))) {
                if (c0365b.m644f(m897d)) {
                    return c0365b.mo645e(abstractC0341P);
                }
                return false;
            } else if (!C0280b.m1057c(str2, C0311A.f627s)) {
                if (C0280b.m1057c(str2, C0311A.f601E)) {
                    c0365b.m668r(this);
                    return false;
                }
                return c0365b.m690d0(abstractC0341P, enumC0313B2);
            } else if (!c0365b.m713G(str2) || !c0365b.m713G(m897d)) {
                c0365b.m668r(this);
                return false;
            }
            c0365b.m672p();
            c0365b.m694Z();
            c0365b.m665s0(enumC0313B);
            return true;
        } else {
            return c0365b.m690d0(abstractC0341P, enumC0313B2);
        }
    }
}
