package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.B0 */
/* loaded from: classes.dex */
enum C0314B0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0314B0() {
        super(atm.m897d("2B1C0E103E191E0E081C2E2D1E1F2C14202D0F250B00232C0F1E"), 40, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        C0372d0 c0372d0 = EnumC0388i1.f791a;
        C0411t0 c0411t0 = EnumC0388i1.f772H;
        char m740f = c0362a.m740f();
        if (m740f != '\t' && m740f != '\n' && m740f != '\f' && m740f != '\r' && m740f != ' ') {
            if (m740f == '/') {
                c0346s.m764v(EnumC0388i1.f780P);
                return;
            }
            if (m740f == '>') {
                c0346s.m770p();
            } else if (m740f != 65535) {
                c0362a.m747P();
                c0346s.m768r(this);
            } else {
                c0346s.m769q(this);
            }
            c0346s.m764v(c0372d0);
            return;
        }
        c0346s.m764v(c0411t0);
    }
}
