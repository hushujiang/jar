package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.U */
/* loaded from: classes.dex */
enum C0350U extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0350U() {
        super(atm.m897d("38191E143839261F090638300B14291C2B36"), 10, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        EnumC0388i1 enumC0388i1;
        if (c0362a.m758E('/')) {
            c0346s.m777i();
            c0346s.m785a(EnumC0388i1.f813l);
            return;
        }
        if (!c0362a.m755H() || c0346s.m784b() == null || c0362a.m726t(c0346s.m783c())) {
            c0346s.m774l(atm.m897d("56"));
            enumC0388i1 = EnumC0388i1.f795c;
        } else {
            AbstractC0339O m778h = c0346s.m778h(false);
            m778h.m815v(c0346s.m784b());
            c0346s.f722k = m778h;
            c0346s.m770p();
            enumC0388i1 = EnumC0388i1.f805h;
        }
        c0346s.m764v(enumC0388i1);
    }
}
