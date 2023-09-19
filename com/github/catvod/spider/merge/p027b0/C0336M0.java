package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.M0 */
/* loaded from: classes.dex */
enum C0336M0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0336M0() {
        super(atm.m897d("2E15190135280F"), 50, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        C0338N0 c0338n0 = EnumC0388i1.f790Z;
        char m740f = c0362a.m740f();
        if (m740f != '\t' && m740f != '\n' && m740f != '\f' && m740f != '\r' && m740f != ' ') {
            if (m740f != '>') {
                if (m740f != 65535) {
                    c0346s.m768r(this);
                } else {
                    c0346s.m769q(this);
                }
            }
            c0346s.m768r(this);
            c0346s.m779g();
            c0346s.f724m.f693h = true;
            c0346s.m771o();
            c0346s.m764v(EnumC0388i1.f791a);
            return;
        }
        c0346s.m764v(c0338n0);
    }
}
