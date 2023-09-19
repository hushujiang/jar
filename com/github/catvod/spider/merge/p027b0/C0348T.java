package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.T */
/* loaded from: classes.dex */
enum C0348T extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0348T() {
        super(atm.m897d("3E1B1D3B2D350F"), 9, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        String str;
        EnumC0388i1 enumC0388i1;
        C0372d0 c0372d0 = EnumC0388i1.f791a;
        c0346s.f722k.m820q(c0362a.m732n());
        char m740f = c0362a.m740f();
        if (m740f == 0) {
            AbstractC0339O abstractC0339O = c0346s.f722k;
            str = EnumC0388i1.f826r0;
            abstractC0339O.m820q(str);
            return;
        }
        if (m740f != ' ') {
            if (m740f == '/') {
                enumC0388i1 = EnumC0388i1.f780P;
                c0346s.m764v(enumC0388i1);
            }
            if (m740f == '<') {
                c0362a.m747P();
                c0346s.m768r(this);
            } else if (m740f != '>') {
                if (m740f == 65535) {
                    c0346s.m769q(this);
                    c0346s.m764v(c0372d0);
                    return;
                } else if (m740f != '\t' && m740f != '\n' && m740f != '\f' && m740f != '\r') {
                    c0346s.f722k.m821p(m740f);
                    return;
                }
            }
            c0346s.m770p();
            c0346s.m764v(c0372d0);
            return;
        }
        enumC0388i1 = EnumC0388i1.f772H;
        c0346s.m764v(enumC0388i1);
    }
}
