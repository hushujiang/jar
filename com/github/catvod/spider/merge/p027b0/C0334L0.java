package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.L0 */
/* loaded from: classes.dex */
enum C0334L0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0334L0() {
        super(atm.m897d("2915171829361E3F14110E39041D"), 49, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        C0372d0 c0372d0 = EnumC0388i1.f791a;
        C0326H0 c0326h0 = EnumC0388i1.f785U;
        char m740f = c0362a.m740f();
        String m897d = atm.m897d("47575B");
        if (m740f != 0) {
            if (m740f == '-') {
                c0346s.f725n.m829l(m897d);
                c0346s.m764v(EnumC0388i1.f786V);
                return;
            }
            if (m740f != '>') {
                if (m740f != 65535) {
                    C0329J c0329j = c0346s.f725n;
                    c0329j.m829l(m897d);
                    c0329j.m830k(m740f);
                } else {
                    c0346s.m769q(this);
                }
            }
            c0346s.m772n();
            c0346s.m764v(c0372d0);
            return;
        }
        c0346s.m768r(this);
        C0329J c0329j2 = c0346s.f725n;
        c0329j2.m829l(m897d);
        c0329j2.m830k((char) 65533);
        c0346s.m764v(c0326h0);
    }
}
