package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p024Z.C0280b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.b0.z */
/* loaded from: classes.dex */
public enum C0422z extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0422z() {
        super(atm.m897d("23142E142E340F"), 8, null);
    }

    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    final boolean mo638d(AbstractC0341P abstractC0341P, C0365b c0365b) {
        EnumC0313B enumC0313B;
        EnumC0313B enumC0313B2 = EnumC0313B.f638d;
        if (!abstractC0341P.m809b() || !C0280b.m1057c(c0365b.m649a().m973j0(), C0311A.f597A)) {
            if (abstractC0341P.m808c()) {
                c0365b.m710J((C0329J) abstractC0341P);
                return true;
            } else if (abstractC0341P.m807d()) {
                c0365b.m668r(this);
                return false;
            } else {
                boolean m804g = abstractC0341P.m804g();
                String m897d = atm.m897d("1E1F170520391E1F");
                String m897d2 = atm.m897d("1E1B181929");
                if (!m804g) {
                    if (!abstractC0341P.m805f()) {
                        if (!abstractC0341P.m806e()) {
                            m637e(abstractC0341P, c0365b);
                            return true;
                        }
                        if (c0365b.m648b(atm.m897d("020E1719"))) {
                            c0365b.m668r(this);
                        }
                        return true;
                    }
                    String str = ((C0335M) abstractC0341P).f695e;
                    if (str.equals(m897d2)) {
                        if (!c0365b.m713G(str)) {
                            c0365b.m668r(this);
                            return false;
                        }
                        c0365b.m693a0(m897d2);
                        c0365b.m677m0();
                    } else if (C0280b.m1057c(str, C0311A.f634z)) {
                        c0365b.m668r(this);
                        return false;
                    } else if (!str.equals(m897d)) {
                        m637e(abstractC0341P, c0365b);
                        return true;
                    } else {
                        c0365b.m690d0(abstractC0341P, enumC0313B2);
                    }
                    return true;
                }
                C0337N c0337n = (C0337N) abstractC0341P;
                String str2 = c0337n.f695e;
                if (str2.equals(atm.m897d("091B0A01253704"))) {
                    c0365b.m674o();
                    c0365b.m706N();
                    c0365b.m712H(c0337n);
                    enumC0313B = EnumC0313B.f645k;
                } else {
                    String m897d3 = atm.m897d("091516123E371F0A");
                    if (str2.equals(m897d3)) {
                        c0365b.m674o();
                        c0365b.m712H(c0337n);
                        enumC0313B = EnumC0313B.f646l;
                    } else if (str2.equals(atm.m897d("091516"))) {
                        c0365b.m674o();
                        c0365b.m642h(m897d3);
                    } else if (C0280b.m1057c(str2, C0311A.f627s)) {
                        c0365b.m674o();
                        c0365b.m712H(c0337n);
                        enumC0313B = EnumC0313B.f647m;
                    } else if (!C0280b.m1057c(str2, C0311A.f628t)) {
                        if (str2.equals(m897d2)) {
                            c0365b.m668r(this);
                            if (c0365b.m713G(str2)) {
                                c0365b.m693a0(str2);
                                if (c0365b.m677m0()) {
                                    return c0365b.mo645e(abstractC0341P);
                                }
                                c0365b.m712H(c0337n);
                                return true;
                            }
                            return false;
                        } else if (C0280b.m1057c(str2, C0311A.f629u)) {
                            return c0365b.m690d0(abstractC0341P, enumC0313B2);
                        } else {
                            if (str2.equals(atm.m897d("03140A0038"))) {
                                if (!c0337n.m816u() || !c0337n.f704n.m1033l(atm.m897d("1E030A10")).equalsIgnoreCase(atm.m897d("02131E112936"))) {
                                    m637e(abstractC0341P, c0365b);
                                    return true;
                                }
                                c0365b.m709K(c0337n);
                            } else if (!str2.equals(atm.m897d("0C150818"))) {
                                m637e(abstractC0341P, c0365b);
                                return true;
                            } else {
                                c0365b.m668r(this);
                                if (c0365b.m660x() != null || c0365b.m697W(m897d)) {
                                    return false;
                                }
                                c0365b.m708L(c0337n, false, false);
                            }
                            return true;
                        }
                    } else {
                        c0365b.m674o();
                        c0365b.m642h(atm.m897d("1E18151135"));
                    }
                }
                c0365b.m665s0(enumC0313B);
                return true;
            }
        }
        c0365b.m699U();
        c0365b.m701S();
        c0365b.m665s0(EnumC0313B.f644j);
        return c0365b.mo645e(abstractC0341P);
    }

    /* renamed from: e */
    final void m637e(AbstractC0341P abstractC0341P, C0365b c0365b) {
        c0365b.m668r(this);
        c0365b.m673o0(true);
        c0365b.m690d0(abstractC0341P, EnumC0313B.f641g);
        c0365b.m673o0(false);
    }
}
