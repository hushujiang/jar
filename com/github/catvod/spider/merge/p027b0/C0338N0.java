package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.N0 */
/* loaded from: classes.dex */
enum C0338N0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0338N0() {
        super(atm.m897d("281F1C1A3E3D2E15190135280F341B1829"), 51, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        C0340O0 c0340o0 = EnumC0388i1.f792a0;
        if (c0362a.m755H()) {
            c0346s.m779g();
            c0346s.m764v(c0340o0);
            return;
        }
        char m740f = c0362a.m740f();
        if (m740f == 0) {
            c0346s.m768r(this);
            c0346s.m779g();
            c0346s.f724m.f689d.append((char) 65533);
        } else if (m740f == ' ') {
            return;
        } else {
            if (m740f == 65535) {
                c0346s.m769q(this);
                c0346s.m779g();
                c0346s.f724m.f693h = true;
                c0346s.m771o();
                c0346s.m764v(EnumC0388i1.f791a);
                return;
            } else if (m740f == '\t' || m740f == '\n' || m740f == '\f' || m740f == '\r') {
                return;
            } else {
                c0346s.m779g();
                c0346s.f724m.f689d.append(m740f);
            }
        }
        c0346s.m764v(c0340o0);
    }
}
