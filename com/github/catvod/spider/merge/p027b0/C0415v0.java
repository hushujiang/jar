package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.v0 */
/* loaded from: classes.dex */
enum C0415v0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0415v0() {
        super(atm.m897d("2B1C0E103E191E0E081C2E2D1E1F3414213D"), 35, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        EnumC0388i1 enumC0388i1;
        C0372d0 c0372d0 = EnumC0388i1.f791a;
        C0413u0 c0413u0 = EnumC0388i1.f773I;
        char m740f = c0362a.m740f();
        if (m740f == 0) {
            c0346s.m768r(this);
            c0346s.f722k.m826k((char) 65533);
        } else if (m740f == ' ') {
            return;
        } else {
            if (m740f != '\"' && m740f != '\'') {
                if (m740f != '/') {
                    if (m740f == 65535) {
                        c0346s.m769q(this);
                    } else if (m740f != '\t' && m740f != '\n' && m740f != '\f' && m740f != '\r') {
                        switch (m740f) {
                            case '<':
                                break;
                            case '=':
                                enumC0388i1 = EnumC0388i1.f775K;
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
                enumC0388i1 = EnumC0388i1.f780P;
                c0346s.m764v(enumC0388i1);
                return;
            }
            c0346s.m768r(this);
            c0346s.f722k.m813x();
            c0346s.f722k.m826k(m740f);
        }
        c0346s.m764v(c0413u0);
    }
}
