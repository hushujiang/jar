package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p024Z.C0280b;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p056r.C0653a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.b0.u */
/* loaded from: classes.dex */
public enum C0412u extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0412u() {
        super(atm.m897d("231432102D3C"), 3, null);
    }

    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    final boolean mo638d(AbstractC0341P abstractC0341P, C0365b c0365b) {
        EnumC0313B enumC0313B;
        EnumC0313B enumC0313B2 = EnumC0313B.f642h;
        if (EnumC0313B.m860a(abstractC0341P)) {
            c0365b.m711I((C0327I) abstractC0341P);
            return true;
        }
        int m139a = C0653a.m139a(abstractC0341P.f705a);
        if (m139a == 0) {
            c0365b.m668r(this);
            return false;
        }
        Object m897d = atm.m897d("1E1F170520391E1F");
        String m897d2 = atm.m897d("021F1B11");
        if (m139a == 1) {
            C0337N c0337n = (C0337N) abstractC0341P;
            String str = c0337n.f695e;
            if (str.equals(atm.m897d("020E1719"))) {
                return EnumC0313B.f641g.mo638d(abstractC0341P, c0365b);
            }
            if (C0280b.m1057c(str, C0311A.f609a)) {
                C0293m m709K = c0365b.m709K(c0337n);
                if (str.equals(atm.m897d("081B0910")) && m709K.m917o(atm.m897d("02081F13"))) {
                    c0365b.m700T(m709K);
                }
            } else if (str.equals(atm.m897d("071F0E14"))) {
                c0365b.m709K(c0337n);
            } else if (str.equals(atm.m897d("1E130E1929"))) {
                c0365b.f838c.m764v(EnumC0388i1.f795c);
                c0365b.m701S();
                c0365b.m665s0(enumC0313B2);
                c0365b.m712H(c0337n);
            } else if (C0280b.m1057c(str, C0311A.f610b)) {
                EnumC0313B.m859b(c0337n, c0365b);
            } else if (str.equals(atm.m897d("041509163E311A0E"))) {
                c0365b.m712H(c0337n);
                enumC0313B = EnumC0313B.f639e;
                c0365b.m665s0(enumC0313B);
            } else if (str.equals(atm.m897d("1919081C3C2C"))) {
                c0365b.f838c.m764v(EnumC0388i1.f801f);
                c0365b.m701S();
                c0365b.m665s0(enumC0313B2);
                c0365b.m712H(c0337n);
            } else if (str.equals(m897d2)) {
                c0365b.m668r(this);
                return false;
            } else if (!str.equals(m897d)) {
                c0365b.m644f(m897d2);
                return c0365b.mo645e(abstractC0341P);
            } else {
                c0365b.m712H(c0337n);
                c0365b.m706N();
                c0365b.m666s(false);
                EnumC0313B enumC0313B3 = EnumC0313B.f652r;
                c0365b.m665s0(enumC0313B3);
                c0365b.m688f0(enumC0313B3);
            }
        } else if (m139a == 2) {
            String str2 = ((C0335M) abstractC0341P).f695e;
            if (str2.equals(m897d2)) {
                c0365b.m694Z();
                enumC0313B = EnumC0313B.f640f;
                c0365b.m665s0(enumC0313B);
            } else if (C0280b.m1057c(str2, C0311A.f611c)) {
                c0365b.m644f(m897d2);
                return c0365b.mo645e(abstractC0341P);
            } else if (!str2.equals(m897d)) {
                c0365b.m668r(this);
                return false;
            } else if (c0365b.m697W(str2)) {
                c0365b.m662v(true);
                if (!str2.equals(c0365b.m649a().m973j0())) {
                    c0365b.m668r(this);
                }
                c0365b.m693a0(str2);
                c0365b.m680l();
                c0365b.m692b0();
                c0365b.m677m0();
            } else {
                c0365b.m668r(this);
            }
        } else if (m139a != 3) {
            c0365b.m644f(m897d2);
            return c0365b.mo645e(abstractC0341P);
        } else {
            c0365b.m710J((C0329J) abstractC0341P);
        }
        return true;
    }
}
