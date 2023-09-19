package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.h1 */
/* loaded from: classes.dex */
enum C0385h1 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0385h1() {
        super(atm.m897d("2F141E212D3F250A1F1B"), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        EnumC0388i1 enumC0388i1;
        C0372d0 c0372d0 = EnumC0388i1.f791a;
        if (c0362a.m723w()) {
            c0346s.m769q(this);
            c0346s.m774l(atm.m897d("5655"));
            c0346s.m764v(c0372d0);
            return;
        }
        if (c0362a.m755H()) {
            c0346s.m778h(false);
            enumC0388i1 = EnumC0388i1.f809j;
        } else {
            boolean m758E = c0362a.m758E('>');
            c0346s.m768r(this);
            if (m758E) {
                c0346s.m785a(c0372d0);
                return;
            }
            c0346s.m780f();
            c0346s.f725n.m830k('/');
            enumC0388i1 = EnumC0388i1.f781Q;
        }
        c0346s.m764v(enumC0388i1);
    }
}
