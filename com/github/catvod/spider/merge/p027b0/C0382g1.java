package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.g1 */
/* loaded from: classes.dex */
enum C0382g1 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0382g1() {
        super(atm.m897d("3E1B1D3A3C3D04"), 7, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        EnumC0388i1 enumC0388i1;
        EnumC0388i1 enumC0388i12;
        char m725u = c0362a.m725u();
        if (m725u == '!') {
            enumC0388i1 = EnumC0388i1.f782R;
        } else if (m725u != '/') {
            if (m725u == '?') {
                c0346s.m780f();
                enumC0388i12 = EnumC0388i1.f781Q;
            } else if (c0362a.m755H()) {
                c0346s.m778h(true);
                enumC0388i12 = EnumC0388i1.f809j;
            } else {
                c0346s.m768r(this);
                c0346s.m776j('<');
                enumC0388i12 = EnumC0388i1.f791a;
            }
            c0346s.m764v(enumC0388i12);
            return;
        } else {
            enumC0388i1 = EnumC0388i1.f807i;
        }
        c0346s.m785a(enumC0388i1);
    }
}
