package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.b0.n */
/* loaded from: classes.dex */
public enum C0398n extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0398n() {
        super(atm.m897d("23143C072D350F091F01"), 19, null);
    }

    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    final boolean mo638d(AbstractC0341P abstractC0341P, C0365b c0365b) {
        EnumC0313B enumC0313B;
        if (EnumC0313B.m860a(abstractC0341P)) {
            c0365b.m711I((C0327I) abstractC0341P);
        } else if (abstractC0341P.m808c()) {
            c0365b.m710J((C0329J) abstractC0341P);
        } else if (abstractC0341P.m807d()) {
            c0365b.m668r(this);
            return false;
        } else {
            boolean m804g = abstractC0341P.m804g();
            String m897d = atm.m897d("0C081B18292B0F0E");
            String m897d2 = atm.m897d("020E1719");
            if (m804g) {
                C0337N c0337n = (C0337N) abstractC0341P;
                String str = c0337n.f695e;
                str.getClass();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1644953643:
                        if (str.equals(m897d)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3213227:
                        if (str.equals(m897d2)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 97692013:
                        if (str.equals(atm.m897d("0C081B1829"))) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1192721831:
                        if (str.equals(atm.m897d("04151C072D350F09"))) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c0365b.m712H(c0337n);
                        break;
                    case 1:
                        enumC0313B = EnumC0313B.f641g;
                        return c0365b.m690d0(c0337n, enumC0313B);
                    case 2:
                        c0365b.m709K(c0337n);
                        break;
                    case 3:
                        enumC0313B = EnumC0313B.f638d;
                        return c0365b.m690d0(c0337n, enumC0313B);
                    default:
                        c0365b.m668r(this);
                        return false;
                }
            } else if (abstractC0341P.m805f() && ((C0335M) abstractC0341P).f695e.equals(m897d)) {
                if (c0365b.m648b(m897d2)) {
                    c0365b.m668r(this);
                    return false;
                }
                c0365b.m694Z();
                if (!c0365b.m648b(m897d)) {
                    c0365b.m665s0(EnumC0313B.f655u);
                }
            } else if (!abstractC0341P.m806e()) {
                c0365b.m668r(this);
                return false;
            } else if (!c0365b.m648b(m897d2)) {
                c0365b.m668r(this);
            }
        }
        return true;
    }
}
