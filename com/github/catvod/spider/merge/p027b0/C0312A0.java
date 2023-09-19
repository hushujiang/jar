package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.A0 */
/* loaded from: classes.dex */
enum C0312A0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0312A0() {
        super(atm.m897d("2B0E0E07253A1F0E1F232D341F1F250022291F150E1028"), 39, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        AbstractC0339O abstractC0339O;
        C0372d0 c0372d0 = EnumC0388i1.f791a;
        String m728r = c0362a.m728r(EnumC0388i1.f824q0);
        if (m728r.length() > 0) {
            c0346s.f722k.m823n(m728r);
        }
        char m740f = c0362a.m740f();
        if (m740f != 0) {
            if (m740f != ' ') {
                if (m740f != '\"' && m740f != '`') {
                    if (m740f == 65535) {
                        c0346s.m769q(this);
                    } else if (m740f != '\t' && m740f != '\n' && m740f != '\f' && m740f != '\r') {
                        if (m740f == '&') {
                            int[] m781e = c0346s.m781e('>', true);
                            AbstractC0339O abstractC0339O2 = c0346s.f722k;
                            if (m781e != null) {
                                abstractC0339O2.m822o(m781e);
                                return;
                            } else {
                                abstractC0339O2.m824m('&');
                                return;
                            }
                        } else if (m740f != '\'') {
                            switch (m740f) {
                                case '>':
                                    c0346s.m770p();
                                    break;
                                case '<':
                                case '=':
                                    c0346s.m768r(this);
                                    break;
                            }
                            abstractC0339O = c0346s.f722k;
                        }
                    }
                    c0346s.m764v(c0372d0);
                    return;
                }
                c0346s.m768r(this);
                abstractC0339O = c0346s.f722k;
            }
            c0346s.m764v(EnumC0388i1.f772H);
            return;
        }
        c0346s.m768r(this);
        abstractC0339O = c0346s.f722k;
        m740f = 65533;
        abstractC0339O.m824m(m740f);
    }
}
