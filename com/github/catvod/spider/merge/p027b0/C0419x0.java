package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.x0 */
/* loaded from: classes.dex */
enum C0419x0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0419x0() {
        super(atm.m897d("2B0E0E07253A1F0E1F232D341F1F2511232D08161F2439371E1F1E"), 37, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        AbstractC0339O abstractC0339O;
        EnumC0388i1 enumC0388i1;
        String m739g = c0362a.m739g(false);
        if (m739g.length() > 0) {
            c0346s.f722k.m823n(m739g);
        } else {
            c0346s.f722k.m811z();
        }
        char m740f = c0362a.m740f();
        if (m740f != 0) {
            if (m740f == '\"') {
                enumC0388i1 = EnumC0388i1.f779O;
            } else if (m740f == '&') {
                int[] m781e = c0346s.m781e('\"', true);
                AbstractC0339O abstractC0339O2 = c0346s.f722k;
                if (m781e != null) {
                    abstractC0339O2.m822o(m781e);
                    return;
                } else {
                    abstractC0339O2.m824m('&');
                    return;
                }
            } else if (m740f != 65535) {
                abstractC0339O = c0346s.f722k;
            } else {
                c0346s.m769q(this);
                enumC0388i1 = EnumC0388i1.f791a;
            }
            c0346s.m764v(enumC0388i1);
            return;
        }
        c0346s.m768r(this);
        abstractC0339O = c0346s.f722k;
        m740f = 65533;
        abstractC0339O.m824m(m740f);
    }
}
