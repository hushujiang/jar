package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.w0 */
/* loaded from: classes.dex */
enum C0417w0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0417w0() {
        super(atm.m897d("281F1C1A3E3D2B0E0E07253A1F0E1F232D341F1F"), 36, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        EnumC0388i1 enumC0388i1;
        C0372d0 c0372d0 = EnumC0388i1.f791a;
        C0312A0 c0312a0 = EnumC0388i1.f778N;
        char m740f = c0362a.m740f();
        if (m740f != 0) {
            if (m740f != ' ') {
                if (m740f != '\"') {
                    if (m740f != '`') {
                        if (m740f == 65535) {
                            c0346s.m769q(this);
                        } else if (m740f == '\t' || m740f == '\n' || m740f == '\f' || m740f == '\r') {
                            return;
                        } else {
                            if (m740f != '&') {
                                if (m740f != '\'') {
                                    switch (m740f) {
                                        case '>':
                                            c0346s.m768r(this);
                                            break;
                                    }
                                } else {
                                    enumC0388i1 = EnumC0388i1.f777M;
                                }
                            }
                            c0362a.m747P();
                        }
                        c0346s.m770p();
                        c0346s.m764v(c0372d0);
                        return;
                    }
                    c0346s.m768r(this);
                    c0346s.f722k.m824m(m740f);
                } else {
                    enumC0388i1 = EnumC0388i1.f776L;
                }
                c0346s.m764v(enumC0388i1);
                return;
            }
            return;
        }
        c0346s.m768r(this);
        c0346s.f722k.m824m((char) 65533);
        c0346s.m764v(c0312a0);
    }
}
