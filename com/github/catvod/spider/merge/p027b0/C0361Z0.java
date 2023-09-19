package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.Z0 */
/* loaded from: classes.dex */
enum C0361Z0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0361Z0() {
        super(atm.m897d("2E15190135280F290306383D07331E10222C031C13103E070E150F17203D3B0F1501293C"), 62, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        StringBuilder sb;
        C0372d0 c0372d0 = EnumC0388i1.f791a;
        char m740f = c0362a.m740f();
        if (m740f != 0) {
            if (m740f == '\"') {
                c0346s.m764v(EnumC0388i1.f816m0);
                return;
            }
            if (m740f == '>') {
                c0346s.m768r(this);
            } else if (m740f != 65535) {
                sb = c0346s.f724m.f692g;
            } else {
                c0346s.m769q(this);
            }
            c0346s.f724m.f693h = true;
            c0346s.m771o();
            c0346s.m764v(c0372d0);
            return;
        }
        c0346s.m768r(this);
        sb = c0346s.f724m.f692g;
        m740f = 65533;
        sb.append(m740f);
    }
}
