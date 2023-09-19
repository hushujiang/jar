package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.a0 */
/* loaded from: classes.dex */
enum C0363a0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0363a0() {
        super(atm.m897d("3919081C3C2C2E1B0E14003D19090E1D2D3639131D1B"), 16, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        EnumC0388i1 enumC0388i1;
        char m740f = c0362a.m740f();
        if (m740f == '!') {
            c0346s.m774l(atm.m897d("565B"));
            enumC0388i1 = EnumC0388i1.f829t;
        } else if (m740f != '/') {
            c0346s.m774l(atm.m897d("56"));
            if (m740f != 65535) {
                c0362a.m747P();
                enumC0388i1 = EnumC0388i1.f801f;
            } else {
                c0346s.m769q(this);
                enumC0388i1 = EnumC0388i1.f791a;
            }
        } else {
            c0346s.m777i();
            enumC0388i1 = EnumC0388i1.f825r;
        }
        c0346s.m764v(enumC0388i1);
    }
}
