package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.b0.C0 */
/* loaded from: classes.dex */
public enum C0316C0 extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0316C0() {
        super(atm.m897d("391F16130F340509131B2B0B1E1B080118390D"), 41, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        C0372d0 c0372d0 = EnumC0388i1.f791a;
        char m740f = c0362a.m740f();
        if (m740f == '>') {
            c0346s.f722k.f703m = true;
            c0346s.m770p();
        } else if (m740f != 65535) {
            c0362a.m747P();
            c0346s.m768r(this);
            c0346s.m764v(EnumC0388i1.f772H);
            return;
        } else {
            c0346s.m769q(this);
        }
        c0346s.m764v(c0372d0);
    }
}
