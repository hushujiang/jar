package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.n0 */
/* loaded from: classes.dex */
enum C0399n0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0399n0() {
        super(atm.m897d("3919081C3C2C2E1B0E1408371F181610092B091B0A1028"), 28, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        EnumC0388i1 enumC0388i1;
        char m725u = c0362a.m725u();
        if (m725u == 0) {
            c0346s.m768r(this);
            c0362a.m745a();
            c0346s.m776j((char) 65533);
            return;
        }
        if (m725u == '-') {
            c0346s.m776j(m725u);
            enumC0388i1 = EnumC0388i1.f768D;
        } else if (m725u != '<') {
            if (m725u != 65535) {
                c0346s.m774l(c0362a.m729q('-', '<', 0));
                return;
            }
            c0346s.m769q(this);
            c0346s.m764v(EnumC0388i1.f791a);
            return;
        } else {
            c0346s.m776j(m725u);
            enumC0388i1 = EnumC0388i1.f770F;
        }
        c0346s.m785a(enumC0388i1);
    }
}
