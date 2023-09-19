package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.I0 */
/* loaded from: classes.dex */
enum C0328I0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0328I0() {
        super(atm.m897d("2915171829361E3F141108391912"), 47, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        EnumC0388i1 enumC0388i1;
        C0326H0 c0326h0 = EnumC0388i1.f785U;
        char m740f = c0362a.m740f();
        if (m740f != 0) {
            if (m740f == '-') {
                enumC0388i1 = EnumC0388i1.f787W;
            } else if (m740f != 65535) {
                C0329J c0329j = c0346s.f725n;
                c0329j.m830k('-');
                c0329j.m830k(m740f);
            } else {
                c0346s.m769q(this);
                c0346s.m772n();
                enumC0388i1 = EnumC0388i1.f791a;
            }
            c0346s.m764v(enumC0388i1);
            return;
        }
        c0346s.m768r(this);
        C0329J c0329j2 = c0346s.f725n;
        c0329j2.m830k('-');
        c0329j2.m830k((char) 65533);
        c0346s.m764v(c0326h0);
    }
}
