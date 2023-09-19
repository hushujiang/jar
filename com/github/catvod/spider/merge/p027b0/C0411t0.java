package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.b0.t0 */
/* loaded from: classes.dex */
public enum C0411t0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0411t0() {
        super(atm.m897d("281F1C1A3E3D2B0E0E07253A1F0E1F3B2D350F"), 33, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        C0372d0 c0372d0 = EnumC0388i1.f791a;
        C0413u0 c0413u0 = EnumC0388i1.f773I;
        char m740f = c0362a.m740f();
        if (m740f == 0) {
            c0362a.m747P();
            c0346s.m768r(this);
            c0346s.f722k.m813x();
        } else if (m740f == ' ') {
            return;
        } else {
            if (m740f != '\"' && m740f != '\'') {
                if (m740f == '/') {
                    c0346s.m764v(EnumC0388i1.f780P);
                    return;
                }
                if (m740f == 65535) {
                    c0346s.m769q(this);
                } else if (m740f != '\t' && m740f != '\n' && m740f != '\f' && m740f != '\r') {
                    switch (m740f) {
                        case '<':
                            c0362a.m747P();
                            c0346s.m768r(this);
                            c0346s.m770p();
                            break;
                        case '=':
                            break;
                        case '>':
                            c0346s.m770p();
                            break;
                        default:
                            c0346s.f722k.m813x();
                            c0362a.m747P();
                            break;
                    }
                } else {
                    return;
                }
                c0346s.m764v(c0372d0);
                return;
            }
            c0346s.m768r(this);
            c0346s.f722k.m813x();
            c0346s.f722k.m826k(m740f);
        }
        c0346s.m764v(c0413u0);
    }
}
