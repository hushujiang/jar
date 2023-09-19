package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p024Z.C0280b;
import com.github.catvod.spider.merge.p025a0.C0293m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.b0.w */
/* loaded from: classes.dex */
public enum C0416w extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0416w() {
        super(atm.m897d("2B1C0E103E100F1B1E"), 5, null);
    }

    /* renamed from: e */
    private boolean m640e(AbstractC0341P abstractC0341P, C0365b c0365b) {
        c0365b.m642h(atm.m897d("08151E0C"));
        c0365b.m666s(true);
        return c0365b.mo645e(abstractC0341P);
    }

    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    final boolean mo638d(AbstractC0341P abstractC0341P, C0365b c0365b) {
        C0412u c0412u = EnumC0313B.f638d;
        C0418x c0418x = EnumC0313B.f641g;
        if (EnumC0313B.m860a(abstractC0341P)) {
            c0365b.m711I((C0327I) abstractC0341P);
            return true;
        } else if (abstractC0341P.m808c()) {
            c0365b.m710J((C0329J) abstractC0341P);
            return true;
        } else if (abstractC0341P.m807d()) {
            c0365b.m668r(this);
            return true;
        } else {
            if (abstractC0341P.m804g()) {
                C0337N c0337n = (C0337N) abstractC0341P;
                String str = c0337n.f695e;
                if (str.equals(atm.m897d("020E1719"))) {
                    return c0365b.m690d0(abstractC0341P, c0418x);
                }
                if (str.equals(atm.m897d("08151E0C"))) {
                    c0365b.m712H(c0337n);
                    c0365b.m666s(false);
                    c0365b.m665s0(c0418x);
                    return true;
                } else if (str.equals(atm.m897d("0C081B18292B0F0E"))) {
                    c0365b.m712H(c0337n);
                    c0365b.m665s0(EnumC0313B.f654t);
                    return true;
                } else if (C0280b.m1057c(str, C0311A.f615g)) {
                    c0365b.m668r(this);
                    C0293m m658z = c0365b.m658z();
                    c0365b.f840e.add(m658z);
                    c0365b.m690d0(abstractC0341P, c0412u);
                    c0365b.m683j0(m658z);
                    return true;
                } else if (str.equals(atm.m897d("021F1B11"))) {
                    c0365b.m668r(this);
                    return false;
                }
            } else if (abstractC0341P.m805f()) {
                String str2 = ((C0335M) abstractC0341P).f695e;
                if (!C0280b.m1057c(str2, C0311A.f612d)) {
                    if (str2.equals(atm.m897d("1E1F170520391E1F"))) {
                        c0365b.m690d0(abstractC0341P, c0412u);
                        return true;
                    }
                    c0365b.m668r(this);
                    return false;
                }
            }
            m640e(abstractC0341P, c0365b);
            return true;
        }
    }
}
