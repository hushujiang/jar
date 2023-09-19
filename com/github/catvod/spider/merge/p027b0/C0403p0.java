package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.p0 */
/* loaded from: classes.dex */
enum C0403p0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0403p0() {
        super(atm.m897d("3919081C3C2C2E1B0E1408371F181610092B091B0A10281C0B0912"), 29, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        EnumC0388i1 enumC0388i1;
        C0399n0 c0399n0 = EnumC0388i1.f767C;
        char m740f = c0362a.m740f();
        if (m740f != 0) {
            if (m740f == '-') {
                c0346s.m776j(m740f);
                enumC0388i1 = EnumC0388i1.f769E;
            } else if (m740f == '<') {
                c0346s.m776j(m740f);
                enumC0388i1 = EnumC0388i1.f770F;
            } else if (m740f == 65535) {
                c0346s.m769q(this);
                enumC0388i1 = EnumC0388i1.f791a;
            }
            c0346s.m764v(enumC0388i1);
            return;
        }
        c0346s.m768r(this);
        m740f = 65533;
        c0346s.m776j(m740f);
        c0346s.m764v(c0399n0);
    }
}
