package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.h0 */
/* loaded from: classes.dex */
enum C0384h0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0384h0() {
        super(atm.m897d("3919081C3C2C2E1B0E14092B091B0A10281C0B0912"), 22, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        EnumC0388i1 enumC0388i1;
        C0381g0 c0381g0 = EnumC0388i1.f831v;
        if (c0362a.m723w()) {
            c0346s.m769q(this);
            c0346s.m764v(EnumC0388i1.f791a);
            return;
        }
        char m740f = c0362a.m740f();
        if (m740f != 0) {
            if (m740f == '-') {
                c0346s.m776j(m740f);
                enumC0388i1 = EnumC0388i1.f833x;
            } else if (m740f == '<') {
                enumC0388i1 = EnumC0388i1.f834y;
            }
            c0346s.m764v(enumC0388i1);
            return;
        }
        c0346s.m768r(this);
        m740f = 65533;
        c0346s.m776j(m740f);
        c0346s.m764v(c0381g0);
    }
}
