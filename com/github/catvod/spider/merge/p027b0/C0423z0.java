package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.b0.z0 */
/* loaded from: classes.dex */
public enum C0423z0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0423z0() {
        super(atm.m897d("38191E143839"), 2, null);
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
        if (m725u == '&') {
            enumC0388i1 = EnumC0388i1.f797d;
        } else if (m725u != '<') {
            if (m725u != 65535) {
                c0346s.m774l(c0362a.m738h());
                return;
            } else {
                c0346s.m775k(new C0333L());
                return;
            }
        } else {
            enumC0388i1 = EnumC0388i1.f811k;
        }
        c0346s.m785a(enumC0388i1);
    }
}
