package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.H0 */
/* loaded from: classes.dex */
enum C0326H0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0326H0() {
        super(atm.m897d("2915171829361E"), 46, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        char m725u = c0362a.m725u();
        if (m725u == 0) {
            c0346s.m768r(this);
            c0362a.m745a();
            c0346s.f725n.m830k((char) 65533);
        } else if (m725u == '-') {
            c0346s.m785a(EnumC0388i1.f786V);
        } else if (m725u != 65535) {
            c0346s.f725n.m829l(c0362a.m729q('-', 0));
        } else {
            c0346s.m769q(this);
            c0346s.m772n();
            c0346s.m764v(EnumC0388i1.f791a);
        }
    }
}
