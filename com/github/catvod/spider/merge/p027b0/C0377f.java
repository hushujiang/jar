package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p024Z.C0280b;
import com.github.catvod.spider.merge.p056r.C0653a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.b0.f */
/* loaded from: classes.dex */
public enum C0377f extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0377f() {
        super(atm.m897d("23142E142E340F38151135"), 12, null);
    }

    /* renamed from: e */
    private boolean m656e(AbstractC0341P abstractC0341P, C0365b c0365b) {
        if (!c0365b.m713G(atm.m897d("1E18151135")) && !c0365b.m713G(atm.m897d("1E121F1428")) && !c0365b.m717C(atm.m897d("1E1C151A38"), null)) {
            c0365b.m668r(this);
            return false;
        }
        c0365b.m676n();
        c0365b.m644f(c0365b.m649a().m973j0());
        return c0365b.mo645e(abstractC0341P);
    }

    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    final boolean mo638d(AbstractC0341P abstractC0341P, C0365b c0365b) {
        EnumC0313B enumC0313B = EnumC0313B.f643i;
        int m139a = C0653a.m139a(abstractC0341P.f705a);
        if (m139a == 1) {
            C0337N c0337n = (C0337N) abstractC0341P;
            String str = c0337n.f695e;
            String m897d = atm.m897d("1E08");
            if (!str.equals(m897d)) {
                if (!C0280b.m1057c(str, C0311A.f630v)) {
                    return C0280b.m1057c(str, C0311A.f598B) ? m656e(abstractC0341P, c0365b) : c0365b.m690d0(abstractC0341P, enumC0313B);
                }
                c0365b.m668r(this);
                c0365b.m642h(m897d);
                return c0365b.mo645e(c0337n);
            }
            c0365b.m676n();
            c0365b.m712H(c0337n);
            c0365b.m665s0(EnumC0313B.f648n);
        } else if (m139a != 2) {
            return c0365b.m690d0(abstractC0341P, enumC0313B);
        } else {
            String str2 = ((C0335M) abstractC0341P).f695e;
            if (!C0280b.m1057c(str2, C0311A.f604H)) {
                if (str2.equals(atm.m897d("1E1B181929"))) {
                    return m656e(abstractC0341P, c0365b);
                }
                if (C0280b.m1057c(str2, C0311A.f599C)) {
                    c0365b.m668r(this);
                    return false;
                }
                return c0365b.m690d0(abstractC0341P, enumC0313B);
            } else if (!c0365b.m713G(str2)) {
                c0365b.m668r(this);
                return false;
            } else {
                c0365b.m676n();
                c0365b.m694Z();
                c0365b.m665s0(enumC0313B);
            }
        }
        return true;
    }
}
