package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p024Z.C0280b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.b0.h */
/* loaded from: classes.dex */
public enum C0383h extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0383h() {
        super(atm.m897d("231439102034"), 14, null);
    }

    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    final boolean mo638d(AbstractC0341P abstractC0341P, C0365b c0365b) {
        C0380g c0380g = EnumC0313B.f648n;
        C0418x c0418x = EnumC0313B.f641g;
        boolean m805f = abstractC0341P.m805f();
        String m897d = atm.m897d("1E12");
        String m897d2 = atm.m897d("1E1E");
        if (m805f) {
            String str = ((C0335M) abstractC0341P).f695e;
            if (C0280b.m1057c(str, C0311A.f630v)) {
                if (!c0365b.m713G(str)) {
                    c0365b.m668r(this);
                    c0365b.m665s0(c0380g);
                    return false;
                }
                c0365b.m662v(false);
                if (!c0365b.m648b(str)) {
                    c0365b.m668r(this);
                }
                c0365b.m693a0(str);
                c0365b.m680l();
                c0365b.m665s0(c0380g);
                return true;
            } else if (C0280b.m1057c(str, C0311A.f631w)) {
                c0365b.m668r(this);
                return false;
            } else if (C0280b.m1057c(str, C0311A.f632x)) {
                if (!c0365b.m713G(str)) {
                    c0365b.m668r(this);
                    return false;
                }
                if (c0365b.m713G(m897d2)) {
                    m897d = m897d2;
                }
                c0365b.m644f(m897d);
                return c0365b.mo645e(abstractC0341P);
            } else {
                return c0365b.m690d0(abstractC0341P, c0418x);
            }
        } else if (abstractC0341P.m804g() && C0280b.m1057c(((C0337N) abstractC0341P).f695e, C0311A.f633y)) {
            if (!c0365b.m713G(m897d2) && !c0365b.m713G(m897d)) {
                c0365b.m668r(this);
                return false;
            }
            if (c0365b.m713G(m897d2)) {
                m897d = m897d2;
            }
            c0365b.m644f(m897d);
            return c0365b.mo645e(abstractC0341P);
        } else {
            return c0365b.m690d0(abstractC0341P, c0418x);
        }
    }
}
