package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p024Z.C0280b;
import com.github.catvod.spider.merge.p056r.C0653a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.b0.k */
/* loaded from: classes.dex */
public enum C0392k extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0392k() {
        super(atm.m897d("23142E102128061B0E10"), 17, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    public final boolean mo638d(AbstractC0341P abstractC0341P, C0365b c0365b) {
        C0412u c0412u = EnumC0313B.f638d;
        C0418x c0418x = EnumC0313B.f641g;
        int m139a = C0653a.m139a(abstractC0341P.f705a);
        if (m139a != 0) {
            if (m139a != 1) {
                String m897d = atm.m897d("1E1F170520391E1F");
                if (m139a != 2) {
                    if (m139a != 3 && m139a != 4) {
                        if (m139a == 5 && c0365b.m697W(m897d)) {
                            c0365b.m668r(this);
                            c0365b.m693a0(m897d);
                            c0365b.m680l();
                            c0365b.m692b0();
                            c0365b.m677m0();
                            if (c0365b.m669q0() == EnumC0313B.f652r || c0365b.m667r0() >= 12) {
                                return true;
                            }
                            return c0365b.mo645e(abstractC0341P);
                        }
                        return true;
                    }
                } else if (!((C0335M) abstractC0341P).f695e.equals(m897d)) {
                    c0365b.m668r(this);
                    return false;
                }
            } else {
                String str = ((C0337N) abstractC0341P).f695e;
                if (!C0280b.m1057c(str, C0311A.f607K)) {
                    if (C0280b.m1057c(str, C0311A.f608L)) {
                        c0365b.m692b0();
                        C0422z c0422z = EnumC0313B.f643i;
                        c0365b.m688f0(c0422z);
                        c0365b.m665s0(c0422z);
                        return c0365b.mo645e(abstractC0341P);
                    } else if (str.equals(atm.m897d("091516"))) {
                        c0365b.m692b0();
                        C0374e c0374e = EnumC0313B.f646l;
                        c0365b.m688f0(c0374e);
                        c0365b.m665s0(c0374e);
                        return c0365b.mo645e(abstractC0341P);
                    } else if (str.equals(atm.m897d("1E08"))) {
                        c0365b.m692b0();
                        C0377f c0377f = EnumC0313B.f647m;
                        c0365b.m688f0(c0377f);
                        c0365b.m665s0(c0377f);
                        return c0365b.mo645e(abstractC0341P);
                    } else if (!str.equals(atm.m897d("1E1E")) && !str.equals(atm.m897d("1E12"))) {
                        c0365b.m692b0();
                        c0365b.m688f0(c0418x);
                        c0365b.m665s0(c0418x);
                        return c0365b.mo645e(abstractC0341P);
                    } else {
                        c0365b.m692b0();
                        C0380g c0380g = EnumC0313B.f648n;
                        c0365b.m688f0(c0380g);
                        c0365b.m665s0(c0380g);
                        return c0365b.mo645e(abstractC0341P);
                    }
                }
            }
            c0365b.m690d0(abstractC0341P, c0412u);
            return true;
        }
        c0365b.m690d0(abstractC0341P, c0418x);
        return true;
    }
}
