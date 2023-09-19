package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.R0 */
/* loaded from: classes.dex */
enum C0345R0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0345R0() {
        super(atm.m897d("281F1C1A3E3D2E15190135280F2A0F17203109331E10222C031C13103E"), 55, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        EnumC0388i1 enumC0388i1;
        C0372d0 c0372d0 = EnumC0388i1.f791a;
        char m740f = c0362a.m740f();
        if (m740f == '\t' || m740f == '\n' || m740f == '\f' || m740f == '\r' || m740f == ' ') {
            return;
        }
        if (m740f == '\"') {
            enumC0388i1 = EnumC0388i1.f800e0;
        } else if (m740f != '\'') {
            if (m740f == '>') {
                c0346s.m768r(this);
            } else if (m740f != 65535) {
                c0346s.m768r(this);
                c0346s.f724m.f693h = true;
                enumC0388i1 = EnumC0388i1.f818n0;
            } else {
                c0346s.m769q(this);
            }
            c0346s.f724m.f693h = true;
            c0346s.m771o();
            c0346s.m764v(c0372d0);
            return;
        } else {
            enumC0388i1 = EnumC0388i1.f802f0;
        }
        c0346s.m764v(enumC0388i1);
    }
}
