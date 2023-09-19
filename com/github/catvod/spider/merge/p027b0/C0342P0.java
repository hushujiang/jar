package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.P0 */
/* loaded from: classes.dex */
enum C0342P0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0342P0() {
        super(atm.m897d("2B1C0E103E1C05190E0C3C3D241B1710"), 53, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        EnumC0388i1 enumC0388i1;
        C0372d0 c0372d0 = EnumC0388i1.f791a;
        if (c0362a.m723w()) {
            c0346s.m769q(this);
            c0346s.f724m.f693h = true;
            c0346s.m771o();
            c0346s.m764v(c0372d0);
        } else if (c0362a.m757F('\t', '\n', '\r', '\f', ' ')) {
            c0362a.m745a();
        } else if (c0362a.m758E('>')) {
            c0346s.m771o();
            c0346s.m785a(c0372d0);
        } else {
            String m897d = atm.m897d("3A2F3839051B");
            if (c0362a.m759D(m897d)) {
                c0346s.f724m.f690e = m897d;
                enumC0388i1 = EnumC0388i1.f796c0;
            } else {
                String m897d2 = atm.m897d("392329210915");
                if (!c0362a.m759D(m897d2)) {
                    c0346s.m768r(this);
                    c0346s.f724m.f693h = true;
                    c0346s.m785a(EnumC0388i1.f818n0);
                    return;
                }
                c0346s.f724m.f690e = m897d2;
                enumC0388i1 = EnumC0388i1.f808i0;
            }
            c0346s.m764v(enumC0388i1);
        }
    }
}
