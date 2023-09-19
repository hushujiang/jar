package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.u0 */
/* loaded from: classes.dex */
enum C0413u0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0413u0() {
        super(atm.m897d("2B0E0E07253A1F0E1F3B2D350F"), 34, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        EnumC0388i1 enumC0388i1;
        C0372d0 c0372d0 = EnumC0388i1.f791a;
        c0346s.f722k.m825l(c0362a.m728r(EnumC0388i1.f822p0));
        char m740f = c0362a.m740f();
        if (m740f != '\t' && m740f != '\n' && m740f != '\f' && m740f != '\r' && m740f != ' ') {
            if (m740f != '\"' && m740f != '\'') {
                if (m740f != '/') {
                    if (m740f != 65535) {
                        switch (m740f) {
                            case '=':
                                enumC0388i1 = EnumC0388i1.f775K;
                                break;
                            case '>':
                                c0346s.m770p();
                                break;
                        }
                        c0346s.f722k.m826k(m740f);
                        return;
                    }
                    c0346s.m769q(this);
                    c0346s.m764v(c0372d0);
                    return;
                }
                enumC0388i1 = EnumC0388i1.f780P;
            }
            c0346s.m768r(this);
            c0346s.f722k.m826k(m740f);
            return;
        }
        enumC0388i1 = EnumC0388i1.f774J;
        c0346s.m764v(enumC0388i1);
    }
}
