package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.F0 */
/* loaded from: classes.dex */
enum C0322F0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0322F0() {
        super(atm.m897d("2915171829361E290E143E2C"), 44, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        C0372d0 c0372d0 = EnumC0388i1.f791a;
        C0326H0 c0326h0 = EnumC0388i1.f785U;
        char m740f = c0362a.m740f();
        if (m740f != 0) {
            if (m740f == '-') {
                c0346s.m764v(EnumC0388i1.f784T);
                return;
            }
            if (m740f == '>') {
                c0346s.m768r(this);
            } else if (m740f != 65535) {
                c0362a.m747P();
            } else {
                c0346s.m769q(this);
            }
            c0346s.m772n();
            c0346s.m764v(c0372d0);
            return;
        }
        c0346s.m768r(this);
        c0346s.f725n.m830k((char) 65533);
        c0346s.m764v(c0326h0);
    }
}
