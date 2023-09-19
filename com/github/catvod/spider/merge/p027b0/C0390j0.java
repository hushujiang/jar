package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.j0 */
/* loaded from: classes.dex */
enum C0390j0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0390j0() {
        super(atm.m897d("3919081C3C2C2E1B0E14092B091B0A1028140F09090124390429131222"), 24, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        EnumC0388i1 enumC0388i1;
        if (c0362a.m755H()) {
            c0346s.m777i();
            c0346s.f719h.append(c0362a.m725u());
            c0346s.m774l(atm.m897d("56"));
            c0346s.m776j(c0362a.m725u());
            enumC0388i1 = EnumC0388i1.f766B;
        } else if (!c0362a.m758E('/')) {
            c0346s.m776j('<');
            c0346s.m764v(EnumC0388i1.f831v);
            return;
        } else {
            c0346s.m777i();
            enumC0388i1 = EnumC0388i1.f835z;
        }
        c0346s.m785a(enumC0388i1);
    }
}
