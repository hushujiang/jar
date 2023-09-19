package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.b0.W */
/* loaded from: classes.dex */
enum C0354W extends EnumC0388i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0354W() {
        super(atm.m897d("38393E3418192F141E212D3F241B1710"), 12, null);
    }

    /* renamed from: h */
    private void m763h(C0346S c0346s, C0362a c0362a) {
        c0346s.m774l(atm.m897d("5655"));
        c0346s.m773m(c0346s.f719h);
        c0362a.m747P();
        c0346s.m764v(EnumC0388i1.f795c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0388i1
    /* renamed from: g */
    public final void mo636g(C0346S c0346s, C0362a c0362a) {
        EnumC0388i1 enumC0388i1;
        if (c0362a.m755H()) {
            String m735k = c0362a.m735k();
            c0346s.f722k.m820q(m735k);
            c0346s.f719h.append(m735k);
            return;
        }
        char m740f = c0362a.m740f();
        if (m740f == '\t' || m740f == '\n' || m740f == '\f' || m740f == '\r' || m740f == ' ') {
            if (c0346s.m766t()) {
                enumC0388i1 = EnumC0388i1.f772H;
                c0346s.m764v(enumC0388i1);
                return;
            }
            m763h(c0346s, c0362a);
        } else if (m740f == '/') {
            if (c0346s.m766t()) {
                enumC0388i1 = EnumC0388i1.f780P;
                c0346s.m764v(enumC0388i1);
                return;
            }
            m763h(c0346s, c0362a);
        } else {
            if (m740f == '>' && c0346s.m766t()) {
                c0346s.m770p();
                enumC0388i1 = EnumC0388i1.f791a;
                c0346s.m764v(enumC0388i1);
                return;
            }
            m763h(c0346s, c0362a);
        }
    }
}
